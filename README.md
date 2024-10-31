
## 가이드

- Notion에서 새로운 업무 단위마다 티켓을 생성 후, Decription에 어떤 내용인지 작성해주세요.
- 각 티켓의 ID명과 동일한 branch를 생성해주세요.
- 개별 branch에서 작업을 모두 한 뒤, 모든 commit을 push하고 github에서 PR(Pull Request)을 합니다.
- 하나의 branch의 내용이 너무 많지 않도록 만들어주세요.
- 새로운 branch를 만들때, main branch에서 git pull을 하고 생성해주세요.
- Commit message는 https://velog.io/@jiheon/Git-Commit-message-%EA%B7%9C%EC%B9%99 를 따라주세요.
- 주의: **main branch에 절대 push 하지마세요.**

## Docker 가이드 (수정중)

- docker desktop 설치: https://www.docker.com/products/docker-desktop/
- docker desktop 을 실행시킨 상태에서 빌드 (branch 생성 후 build 권장)
```
# 전체 파일 빌드
docker-compose up --build
```
- 한번 빌드하면 docker desktop container에서 run / stop 가능

-http://localhost:3000/ 접속
