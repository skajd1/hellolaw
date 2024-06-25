![hellolaw logo](https://github.com/skajd1/hellolaw/assets/86655177/1c09225d-57d4-4dd8-a045-75f9c8618daa)

## 목차
### [서비스 개요](#1-service-overview)
### [사용 스택](#2-stacks)
### [담당 역할 및 세부 내용](#3-role-and-details)
### [프로젝트 회고](#4-wrap-up)

## 1. Service Overview
AI 기반의 법률 조언 서비스 "헬로"는 기존 법률 서비스의 상담 비용과 절차, 접근 난이도를 줄이고자 기획되었습니다.

AI를 통해 사용자의 상황에 맞는 과거 사례와 판례, 법안들을 제공하고, 언제 어디서나 쉽고 간편하게 접근이 가능한 법률 조언 서비스 "헬로"입니다.

![image](https://github.com/skajd1/hellolaw/assets/86655177/be410a6a-c939-4403-a686-321fe40f536b)
![image](https://github.com/skajd1/hellolaw/assets/86655177/722ae9a9-096c-4d6d-9892-7142ce99ec90)
![image](https://github.com/skajd1/hellolaw/assets/86655177/28ca0c13-dc44-4c1f-aed3-598df003c148)
![image](https://github.com/skajd1/hellolaw/assets/86655177/5d96203e-e7dd-43fb-a922-22319ef2a829)

## 2. Stacks
### IDE
<img src="https://img.shields.io/badge/intellij idea-000000?style=for-the-badge&logo=intellij idea&logoColor=white"> <img src="https://img.shields.io/badge/visual studio code-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white"> <img src="https://img.shields.io/badge/pycharm-143?style=for-the-badge&logo=pycharm&logoColor=black&color=black&labelColor=green">

### Database
<img src="https://img.shields.io/badge/mysql 5.6-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/redis 7.2.4-%23DD0031.svg?style=for-the-badge&logo=redis&logoColor=white">

### AI Server
<img src="https://img.shields.io/badge/python 3.12.0-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54"> <img src="https://img.shields.io/badge/FastAPI-005571?style=for-the-badge&logo=fastapi">

### Backend - API Server
![Java](https://img.shields.io/badge/java17-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
<img src="https://img.shields.io/badge/spring boot 3.2.5-6DB33F?style=for-the-badge&logo=spring boot&logoColor=white">
<img src="https://img.shields.io/badge/Spring Data JPA-6DB33F?style=for-the-badge&logo=hibernate&logoColor=white">

### Backend - Auth Server
![Java](https://img.shields.io/badge/java17-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
<img src="https://img.shields.io/badge/spring boot 3.2.5-6DB33F?style=for-the-badge&logo=spring boot&logoColor=white">
<img src="https://img.shields.io/badge/spring webflux-6DB33F?style=for-the-badge&logo=spring boot&logoColor=white">
<img src="https://img.shields.io/badge/spring security-6DB33F?style=for-the-badge&logo=spring security&logoColor=white">
<img src="https://img.shields.io/badge/Spring Data JPA-6DB33F?style=for-the-badge&logo=hibernate&logoColor=white">
<img src="https://img.shields.io/badge/Spring Cloud Gateway-6DB33F?style=for-the-badge&logoColor=white">
<img src="https://img.shields.io/badge/JWT 0.8.0-000000?style=for-the-badge&logo=jsonwebtokens&logoColor=FFFFFF">

### Infrastructure
<img src="https://img.shields.io/badge/jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white"> <img src="https://img.shields.io/badge/docker-2496ED?style=for-the-badge&logo=docker&logoColor=white"> <img src="https://img.shields.io/badge/aws ec2-FF9900?style=for-the-badge&logo=amazon ec2&logoColor=white"> <img src="https://img.shields.io/badge/eks-58ACFA?style=for-the-badge&logo=Amazon%20EKS&logoColor=white"> <img src="https://img.shields.io/badge/k8s-326CE5?style=for-the-badge&logo=Kubernetes&logoColor=white"> <img src="https://img.shields.io/badge/fluentd-0E83C8?style=for-the-badge&logo=Fluentd&logoColor=white">

### Version control
<img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white"> <img src="https://img.shields.io/badge/gitlab-FC6D26?style=for-the-badge&logo=gitlab&logoColor=white">


### Management Tools
<img src="https://img.shields.io/badge/jira software-0052CC?style=for-the-badge&logo=jira software&logoColor=white"> <img src="https://img.shields.io/badge/mattermost-0058CC?style=for-the-badge&logo=mattermost&logoColor=white"> <img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white"> <img src="https://img.shields.io/badge/figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white">
## 3. Role And Details
### 시스템 아키텍처 설계 & 개발 인프라 구축
![Architecture-final](https://github.com/skajd1/hellolaw/assets/86655177/4754ffd0-7251-4640-b3f2-577a06ec93f0)
- **개발/운영 환경 분리**
  - 클러스터 내부의 EC2 2개를 노드그룹에 추가하여 Node Affinity를 활용해 각 노드에 스케줄링 될 파드를 물리적으로 분리하였습니다.
  - k8s Ingress 라우팅 설정 및 도메인 CNAME 설정을 통해 `https://test.{도메인}`으로 개발 서버에 접속할 수 있도록 구현하였습니다.
  - 테스트 완료된 안정적인 버전만을 운영 서버에 배포하여 서버 안정성을 증가시켰습니다.
  - 개발 서버에서는 자유롭게 기능 개발을 테스트할 수 있습니다.

- **Blue-Green 무중단 배포**
  - Jenkins에서 k8s service에 patch 명령을 통해 기존 트래픽 경로를 수정하는 방식으로 구현하였습니다.
  - 기존 Rolling Update 방식에 비해 버전 교체 시간을 90% 이상 단축하여 가용성을 증가시켰습니다.

- **CI/CD 파이프라인 구축**
  - ECR(AWS 이미지 허브)와 Jenkins를 연동하여 이미지를 배포하는 방식으로 구현하였습니다.
  - 운영 서버는 k8s Deployment에 ECR로부터 최신 버전의 이미지를 받아 배포합니다.
  - 개발 서버는 SCM -> Build -> ECR Push -> Kubectl Deployment의 순서로 배포합니다.
  - 배포 실패 시 서버가 다운되는 것을 방지하기 위해 버전 롤백 기능을 구현하여 서버 가용성을 증가시켰습니다.

- **EFK 로그 모니터링 환경**
  - Fluentd(로그 수집기)를 k8s Daemonset을 이용해 각 노드에 배치하였습니다.
  - Index Pattern으로 서버 별 로그를 `https://log.{도메인}`에서 모니터링 할 수 있게 구현하여 개발 과정의 디버깅 및 효율을 증가시켰습니다.

## 4. Wrap Up

- **EKS, ECR, ACM 등 AWS 활용**
  - 실서비스에 필요한 k8s 클러스터 구축 경험을 쌓았습니다.
  - Linux OS에서의 작업 및 SSH 명령을 통한 CI/CD 파이프라인 구축을 통해 Linux 환경에 익숙해졌습니다.

- **Spring Vault**
  - 기존에 Jenkins에 Secret을 등록하여 사용했으나, 이는 비효율적이었습니다. Vault를 활용하여 Secret Key 관리를 일관성 있고 편리하게 할 수 있었습니다.

- **Ansible 및 Terraform 등 IaC 도구 필요성**
  - Argo CD 등 GitOps 도구 사용이 미비했습니다.
  - Kubernetes 매니페스트 파일을 git과 연동하여 배포 관리 및 자동화 설정이 필요했습니다. 기존의 수작업 방식은 너무 불편하고 비효율적이었습니다.

- **Pod Auto Scaling**
  - 시스템 Metric을 관제하여 파드 별 적절한 리소스 제한을 설정하고, 이를 통한 파드 스케줄링 역량이 필요했습니다.






