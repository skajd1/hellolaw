package com.hellolaw.auth.filter;

import java.time.Duration;

import org.springframework.http.HttpCookie;
import org.springframework.http.ResponseCookie;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import com.hellolaw.auth.service.AuthService;
import com.hellolaw.auth.util.JWTProvider;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
public class JWTAuthenticationFilter implements WebFilter {
	private final JWTProvider jwtProvider;
	private final AuthService authService;

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
		log.info("JWT 필터 실행");
		return getAccessToken(exchange.getRequest().getCookies())
			.flatMap(accessToken -> {
				if (jwtProvider.isValidateToken(accessToken)) {
					return updateSecurityContext(accessToken)
						.flatMap(securityContext -> chain.filter(exchange)
							.contextWrite(
								ReactiveSecurityContextHolder.withSecurityContext(Mono.just(securityContext))));
				} else {
					return validateRefreshTokenAndReIssueAccessToken(exchange, accessToken, chain);
				}
			})
			.onErrorResume(e -> {
				log.error("Error during JWT filter processing", e);
				return Mono.error(e);
			});
	}

	private Mono<String> getAccessToken(MultiValueMap<String, HttpCookie> cookies) {
		log.info("쿠키에서 액세스 토큰 추출");
		return Mono.justOrEmpty(cookies.getFirst("access-token"))
			.map(HttpCookie::getValue);
	}

	private Mono<SecurityContext> updateSecurityContext(String accessToken) {
		return Mono.defer(() -> {
			Authentication authentication = jwtProvider.getAuthentication(accessToken);
			SecurityContextImpl securityContext = new SecurityContextImpl(authentication);
			SecurityContextHolder.setContext(securityContext);
			log.info("인증 정보로 SecurityContext 업데이트: {}", securityContext.getAuthentication().isAuthenticated());
			return Mono.just(securityContext);
		});
	}

	private Mono<String> reIssueAccessToken(String accessToken) {
		return Mono.just(jwtProvider.createAccessToken(jwtProvider.getId(accessToken),
			jwtProvider.getProvider(accessToken)));
	}

	private void addAccessTokenCookie(ServerWebExchange exchange, String accessToken) {
		ResponseCookie cookie = ResponseCookie.from("access-token", accessToken)
			.httpOnly(true)
			.maxAge(Duration.ofDays(30))
			.path("/")
			.build();
		exchange.getResponse().addCookie(cookie);
	}

	private Mono<Void> validateRefreshTokenAndReIssueAccessToken(ServerWebExchange exchange, String accessToken,
		WebFilterChain chain) {
		return authService.validateRefreshTokenInRedis(accessToken)
			.flatMap(isValidRefreshToken -> {
				if (isValidRefreshToken) {
					return reIssueAccessToken(accessToken)
						.flatMap(newAccessToken -> {
							addAccessTokenCookie(exchange, newAccessToken);
							return updateSecurityContext(newAccessToken)
								.flatMap(securityContext -> chain.filter(exchange)
									.contextWrite(
										ReactiveSecurityContextHolder.withSecurityContext(Mono.just(securityContext))));
						});
				} else {
					SecurityContextHolder.clearContext();
					return chain.filter(exchange);
				}
			});
	}
}