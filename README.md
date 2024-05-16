![284](/uploads/43ca7c08310448ebce2cf7b83c54f058/284.png)

1. [서비스 개요](#1-service-overview)
1. [기술 스택](#2-기술-스택)
1. [한눈에 보는 시스템 아키텍처](#3-system-architecture)
1. [팀원 소개](#4-팀원-소개)
1. [BackEnd Structure](#5-backend-file-structure)
1. [FrontEnd Structure](#6-frontend-file-structure)
1. [ERD](#7-erd)

## 1. Service Overview
사소한 법률 문제라 변호사 선임, 상담 비용이 더 커
너무 급하고 걱정되는데 당장 물어볼 곳이 없어
나랑 비슷한 과거 사례들이 있는지 궁금해

**언제 어디서나 쉽게 받는 법률 조언, 헬로(Law)**

## 2. 기술 스택

### IDE
<img src="https://img.shields.io/badge/intellij idea-000000?style=for-the-badge&logo=intellij idea&logoColor=white">
<img src="https://img.shields.io/badge/visual studio code-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white">
![PyCharm](https://img.shields.io/badge/pycharm-143?style=for-the-badge&logo=pycharm&logoColor=black&color=black&labelColor=green)

### Frontend
![React](https://img.shields.io/badge/react-%2320232a.svg?style=for-the-badge&logo=react&logoColor=%2361DAFB)
![TypeScript](https://img.shields.io/badge/typescript-%23007ACC.svg?style=for-the-badge&logo=typescript&logoColor=white)
![Vite](https://img.shields.io/badge/vite-%23646CFF.svg?style=for-the-badge&logo=vite&logoColor=white)
![TailwindCSS](https://img.shields.io/badge/tailwindcss-%2338B2AC.svg?style=for-the-badge&logo=tailwind-css&logoColor=white)
![PNPM](https://img.shields.io/badge/pnpm-%234a4a4a.svg?style=for-the-badge&logo=pnpm&logoColor=f69220)
![React Query](https://img.shields.io/badge/-React%20Query-FF4154?style=for-the-badge&logo=react%20query&logoColor=white)

### Database
<img src="https://img.shields.io/badge/mysql 8.0.36-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
![Redis](https://img.shields.io/badge/redis 7.2.4-%23DD0031.svg?style=for-the-badge&logo=redis&logoColor=white)

### AI Server
<img src="https://img.shields.io/badge/python 3.11.0-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54">
![FastAPI](https://img.shields.io/badge/FastAPI-005571?style=for-the-badge&logo=fastapi)

### Backend - API Server
![Java](https://img.shields.io/badge/java17-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
<img src="https://img.shields.io/badge/spring boot 3.2.5-6DB33F?style=for-the-badge&logo=spring boot&logoColor=white">
<img src="https://img.shields.io/badge/spring data jpa 3.2.1-6DB33F?style=for-the-badge&logo=t&logoColor=white">
<img src="https://img.shields.io/badge/junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white">
<img src="https://img.shields.io/badge/querydsl 5.0.0-000000?style=for-the-badge&logo=&logoColor=white">

### Backend - Auth Server
![Java](https://img.shields.io/badge/java17-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
<img src="https://img.shields.io/badge/spring boot 3.2.5-6DB33F?style=for-the-badge&logo=spring boot&logoColor=white">
<img src="https://img.shields.io/badge/spring security 6.2.1-6DB33F?style=for-the-badge&logo=spring security&logoColor=white">
<img src="https://img.shields.io/badge/spring data jpa 3.2.1-6DB33F?style=for-the-badge&logo=t&logoColor=white">
<img src="https://img.shields.io/badge/JWT 0.8.0-000000?style=for-the-badge&logo=jsonwebtokens&logoColor=FFFFFF">
<img src="https://img.shields.io/badge/querydsl 5.0.0-000000?style=for-the-badge&logo=&logoColor=white">

### Crawling Server
<img src="https://img.shields.io/badge/python 3.10-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54">
![FastAPI](https://img.shields.io/badge/FastAPI-005571?style=for-the-badge&logo=fastapi)
<img src="https://img.shields.io/badge/BeautifulSoup-000000?style=for-the-badge&logo=&logoColor=white">

### Infrastructure
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
📁
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

### Auth Server
```
📁
├─main
│  └─java
│      └─com
│          └─hellolaw
│              └─auth
│                  ├─client
│                  │  └─kakao
│                  ├─config
│                  ├─controller
│                  ├─dto
│                  ├─entity
│                  ├─exception
│                  ├─filter
│                  ├─provider
│                  ├─redis
│                  ├─repository
│                  ├─service
│                  └─util
└─test
    └─java
        └─com
            └─hellolaw
                └─auth
```

### Crawling Server
```
📁
└─Crawling
    ├─main
    ├─category
    └─crawl
```

### AI Server
```
📁
└─AI
    ├─BERT
    │  ├─inference
    │  ├─make_embedding
    │  └─search
    ├─GPTAssistant
    ├─LLM
    └─utils
```

## 6. Frontend File Structure
```
📁
├─.storybook
├─deps
├─public
└─src
    ├─api
    ├─assets
    │  └─svg
    │      └─category
    ├─components
    │  ├─AccordionBox
    │  ├─Avatar
    │  ├─BottomBar
    │  ├─Button
    │  ├─Chat
    │  ├─ContentBox
    │  ├─GuideBox
    │  ├─Icon
    │  ├─Loading
    │  ├─Modal
    │  │  └─manage
    │  └─SideBar
    ├─hooks
    ├─mocks
    ├─pages
    │  ├─AuthCheck
    │  ├─Home
    │  └─Main
    ├─routes
    ├─store
    ├─styles
    │  └─fonts
    ├─test
    ├─types
    └─utils
```

## 7. ERD
![erd](/uploads/be725437d5f972139c708c0fd3ed09c7/erd.png)
