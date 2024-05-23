![hellolaw logo](https://github.com/skajd1/hellolaw/assets/86655177/1c09225d-57d4-4dd8-a045-75f9c8618daa)

# AI 법률조언서비스 "헬로"
## 목차
### [서비스 개요](#1-service-overview)
### [사용 스택](#2-stacks)
### [담당 역할 및 세부 내용](#3-role-and-details)
### [프로젝트 회고](#4-wrap-up)

# 1. Service Overview
## 주요기능
![image](https://github.com/skajd1/hellolaw/assets/86655177/be410a6a-c939-4403-a686-321fe40f536b)
![image](https://github.com/skajd1/hellolaw/assets/86655177/722ae9a9-096c-4d6d-9892-7142ce99ec90)
![image](https://github.com/skajd1/hellolaw/assets/86655177/28ca0c13-dc44-4c1f-aed3-598df003c148)
![image](https://github.com/skajd1/hellolaw/assets/86655177/5d96203e-e7dd-43fb-a922-22319ef2a829)

# 2. Stacks
![Jenkins](https://img.shields.io/badge/jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white)
![AWS EC2](https://img.shields.io/badge/aws%20ec2-FF9900?style=for-the-badge&logo=amazon%20ec2&logoColor=white)
![Docker](https://img.shields.io/badge/docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![EKS](https://img.shields.io/badge/eks-58ACFA?style=for-the-badge&logo=Amazon%20EKS&logoColor=white)
![Kubernetes](https://img.shields.io/badge/k8s-326CE5?style=for-the-badge&logo=Kubernetes&logoColor=white)
![fluentd](https://img.shields.io/badge/fluentd-0E83C8?style=for-the-badge&logo=Fluentd&logoColor=white)

# 3. Role And Details
### 시스템 아키텍처 설계 & 개발 인프라 구축
![Architecture-final](https://github.com/skajd1/hellolaw/assets/86655177/4754ffd0-7251-4640-b3f2-577a06ec93f0)
- 개발/운영 환경 분리
  - 클러스터 내부의 EC2 2개를 노드그룹에 추가하였고, Node Affinity를 활용해 각 노드에 스케쥴링 될 파드를 물리적으로 분리하였음
  - k8s Ingress 라우팅 설정 및 도메인 CNAME 설정을 통해 https://test.{도메인} 으로 개발서버 접속 가능하게 구현
  - <u>**테스트 완료된 stable한 버전만을 운영서버에 배포하여 서버 안정성 증가**</u>
  - 개발서버에선 자유롭게 기능 개발을 테스트해 볼 수 있음
- Blue-Green 무중단 배포
  - Jenkins에서 k8s service에 patch 명령을 함으로써 기존 트래픽 경로를 수정하는 방식으로 구현
  - <u> **기존 Rolling Update 방식에 비해 버전 교체 시간 90% 이상 단축으로 가용성 증가**</u>
- CI/CD 파이프라인 구축
  - ECR(AWS에서 제공하는 이미지 허브)와 Jenkins를 연동하여 이미지를 배포하는 방식으로 구현
  - 운영서버는 k8s Deployment에 ECR로부터 최신 버전의 이미지를 받아 배포
  - 개발서버는 SCM -> Build -> ECR Push -> Kubectl Deployment의 순서로 배포
  - <u>**배포 실패 시에 서버가 다운되는 것을 방지하기 위한 버전 롤백 기능 구현으로 서버 가용성 증가**</u>
- EFK 로그 모니터링 환경
  - Fluentd(로그 수집기)를 k8s Daemonset을 이용해 각 노드에 배치
  - <u>**Index Pattern으로 서버 별 로그를 https://log.{도메인} 에서 모니터링 할 수 있게 구현하여 개발 과정 디버깅 및 효율 증가**</u>
 
# 4. Wrap Up






