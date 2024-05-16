![284](/uploads/43ca7c08310448ebce2cf7b83c54f058/284.png)


1. [서비스 개요](#1-service-overview)
1. [기술 스택](#2-기술-스택)
1. [한눈에 보는 시스템 아키텍처](#3-한눈에-보는-시스템-아키텍처)
1. [팀원 소개](#4-팀원-소개)
1. [BackEnd Structure](#5-backend-structure)
1. [FrontEnd Structure](#6-frontend-structure)
1. [ERD](#7-erd)
1. [API 명세서](#8-API명세서)
1. [온터뷰 사용설명서](#9-온터뷰 사용설명서)

## 1. Service Overview
사소한 법률 문제라 변호사 선임, 상담 비용이 더 커
너무 급하고 걱정되는데 당장 물어볼 곳이 없어
나랑 비슷한 과거 사례들이 있는지 궁금해

**언제 어디서나 쉽게 받는 법률 조언, 헬로(Law)**

## 2. 기술 스택

### IDE
<img src="https://img.shields.io/badge/intellij idea-000000?style=for-the-badge&logo=intellij idea&logoColor=white">
<img src="https://img.shields.io/badge/visual studio code-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white">

### Frontend
<img src="https://img.shields.io/badge/node.js 20.11.0-339933?style=for-the-badge&logo=node.js&logoColor=white">
<img src="https://img.shields.io/badge/axios 1.6.5-5A29E4?style=for-the-badge&logo=axios&logoColor=white">
<img src="https://img.shields.io/badge/openvidu browser 2.29.1-000000?style=for-the-badge&logo=&logoColor=white">
<img src="https://img.shields.io/badge/sass-CC6699?style=for-the-badge&logo=sass&logoColor=white">
<img src="https://img.shields.io/badge/vue 3.3.11-4FC98D?style=for-the-badge&logo=vue&logoColor=white">
<img src="https://img.shields.io/badge/vuetify 3.4.10-1867C0?style=for-the-badge&logo=vuetify&logoColor=white">


### Backend
<img src="https://img.shields.io/badge/java 17-E84135?style=for-the-badge&logo=y&logoColor=white">
<img src="https://img.shields.io/badge/spring boot 3.2.1-6DB33F?style=for-the-badge&logo=spring boot&logoColor=white">
<img src="https://img.shields.io/badge/spring data jpa 3.2.1-6DB33F?style=for-the-badge&logo=t&logoColor=white">
<img src="https://img.shields.io/badge/spring security 6.2.1-6DB33F?style=for-the-badge&logo=spring security&logoColor=white">
<img src="https://img.shields.io/badge/spring security messaging 6.2.1-6DB33F?style=for-the-badge&logo=spring security&logoColor=white">
<img src="https://img.shields.io/badge/swagger 2.0.2-5EA2D?style=for-the-badge&logo=spring security&logoColor=white">
<img src="https://img.shields.io/badge/jjwt 0.8.0-000000?style=for-the-badge&logo=y&logoColor=white">
<img src="https://img.shields.io/badge/mysql 8.0.35-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/openvidu 2.29.0-000000?style=for-the-badge&logo=&logoColor=white">
<img src="https://img.shields.io/badge/Spring webflux 6.1.2-000000?style=for-the-badge&logo=&logoColor=white">
<img src="https://img.shields.io/badge/Spring websocket 6.1.2-000000?style=for-the-badge&logo=&logoColor=white">
<img src="https://img.shields.io/badge/querydsl 5.0.0-000000?style=for-the-badge&logo=&logoColor=white">

### Auth Server
<img src="https://img.shields.io/badge/java 17-E84135?style=for-the-badge&logo=y&logoColor=white">
<img src="https://img.shields.io/badge/spring boot 3.2.1-6DB33F?style=for-the-badge&logo=spring boot&logoColor=white">
<img src="https://img.shields.io/badge/spring security 6.2.1-6DB33F?style=for-the-badge&logo=spring security&logoColor=white">
<img src="https://img.shields.io/badge/ffmpeg 0.8.0-007808?style=for-the-badge&logo=ffmpeg&logoColor=white">
<img src="https://img.shields.io/badge/jjwt 0.8.0-000000?style=for-the-badge&logo=y&logoColor=white">

### Infra
<img src="https://img.shields.io/badge/jenkins 2.426.3-D24939?style=for-the-badge&logo=jenkins&logoColor=white">
<img src="https://img.shields.io/badge/docker 25.0.0-2496ED?style=for-the-badge&logo=docker&logoColor=white">
<img src="https://img.shields.io/badge/nginx 1.25.3-009639?style=for-the-badge&logo=nginx&logoColor=white">
<img src="https://img.shields.io/badge/aws ec2-FF9900?style=for-the-badge&logo=amazon ec2&logoColor=white">

### Version control
<img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
<img src="https://img.shields.io/badge/gitlab-FC6D26?style=for-the-badge&logo=gitlab&logoColor=white">


### Management Tools
<img src="https://img.shields.io/badge/jira software-0052CC?style=for-the-badge&logo=jira software&logoColor=white">
<img src="https://img.shields.io/badge/mattermost-0058CC?style=for-the-badge&logo=mattermost&logoColor=white">
<img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white">
<img src="https://img.shields.io/badge/figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white">


## 3. System Architecture

## 4. 팀원 소개
쓰기

## 5. Backend File Structure
### API Server
```
├─main
│  ├─java
│  │  └─com
│  │      └─hellolaw
│  │          └─hellolaw
│  │              ├─annotation
│  │              ├─common
│  │              ├─config
│  │              ├─controller
│  │              ├─dto
│  │              ├─entity
│  │              │  └─common
│  │              ├─exception
│  │              ├─filter
│  │              ├─internal
│  │              │  ├─config
│  │              │  ├─dto
│  │              │  └─service
│  │              ├─mapper
│  │              ├─repository
│  │              ├─resolver
│  │              ├─service
│  │              └─util
│  └─resources
└─test
    └─java
        └─com
            └─hellolaw
                └─hellolaw
```


## 6. Frontend File Structure

## 7. ERD
![erd](/uploads/be725437d5f972139c708c0fd3ed09c7/erd.png)
