
## 가이드

- Notion에서 새로운 업무 단위마다 티켓을 생성 후, Decription에 어떤 내용인지 작성해주세요.
- 각 티켓의 ID명과 동일한 branch를 생성해주세요.
- 개별 branch에서 작업을 모두 한 뒤, 모든 commit을 push하고 github에서 PR(Pull Request)을 합니다.
- 하나의 branch의 내용이 너무 많지 않도록 만들어주세요.
- 새로운 branch를 만들때, main branch에서 git pull을 하고 생성해주세요.
- Commit message는 https://velog.io/@jiheon/Git-Commit-message-%EA%B7%9C%EC%B9%99 를 따라주세요.
- 주의: **main branch에 절대 push 하지마세요.**

## Docker 가이드

- Docker Desktop 설치: [Docker Desktop 다운로드](https://www.docker.com/products/docker-desktop)
---

## 프로젝트 실행 방법

#1. 프로젝트 폴더로 이동
먼저, 터미널을 열고 프로젝트 폴더로 이동합니다. docker-compose.yml 파일이 포함된 폴더여야 합니다.

'''
cd ../AlbaSidae
'''

#2. Docker Compose로 서비스 실행
모든 서비스를 처음 시작하거나 변경 사항이 있을 때 아래 명령어를 입력하여 Docker Compose로 실행합니다.

'''
docker-compose up --build
'''

- **백그라운드에서 실행**하고 싶다면 다음과 같이 `-d` 옵션을 추가합니다.

'''
docker-compose up -d --build
'''

이 명령어로 **프론트엔드, 백엔드, 데이터베이스**가 자동으로 실행됩니다.

---

## 🗄️ MySQL 데이터베이스 정보

서비스 실행 후 MySQL 데이터베이스에 접근하려면 아래 정보를 사용하세요. (mysql workbench 이용)

- **포트**: `3305`
- **사용자 이름**: `root`
- **비밀번호**: `root`
- **데이터베이스 이름**: `albasidae`

---

## ⏹️ 서비스 종료 방법

작업이 끝난 후 모든 컨테이너를 종료하려면 다음 명령어를 사용합니다.

'''
docker-compose down
'''

---

## 🖥️ Docker Desktop을 통한 컨테이너 관리

1. **Docker Desktop 열기**: Docker Desktop을 열면 현재 실행 중인 모든 컨테이너를 확인할 수 있습니다.
2. **컨테이너 중지/시작**: 
   - 중지할 컨테이너를 선택하고 **Stop** 버튼을 클릭합니다.
   - 다시 시작하려면 **Start** 버튼을 클릭합니다.
   - 
### 효율적인 사용 방법
- **프론트엔드 개발자**: docker-compose up --build backend db (백엔드와 db 컨테이너만 사용) 후 로컬에서 작업.
- **백엔드 개발자**: docker-compose up --build frontend db (프론트엔드와 db 컨테이너만 사용) 후 로컬에서 작업, 이 경우 application.properties에서 datasource.url 변경
---

