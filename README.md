# Project Title
알바시대(Albasidae)

# Project Team Name
UOS Works

# Project Scope
서울시립대학교 컴퓨터과학부 2024년 소프트웨어공학 프로젝트로 Software Development Life-Cycle을 기반으로 객체지향 소프트웨어공학 방법론을 적용하여 학교 주변 알바 구인, 구직을 개인 맞춤형으로 편리하게 제공하는 웹 서비스 개발

# Project Duration
2024년 2학기

# Project Team Members
| 학번        | 이름   | 역할         |
| ----------- | ------ | ------------ |
| 2014920047  | 임진우  |    BE        |
| 2020920031  | 서제임스  |    FE        |
| 2020920058  | 조성채  |     BE       |
| 2022920010  | 김동하  |     FE       |
| 2022920024  | 박동찬  |     FE       |
| 2022920045  | 이승목  |     BE       |

# Highlighted Features
- 인재 정보, 공고 정보 등록, 수정, 삭제
- 구직자 지역, 하는 일, 근무조건, **시간표** 필터링
- 알바 지도 확인 서비스
- Demo Video(넣어야함)

# Project Constraints
- 플랫폼 접근성: 다양한 사용자층이 접근할 수 있도록, 시스템은 웹 브라우저를 통해 구현되어야 한다.
- 프로그래밍 언어 및 프레임워크: 프론트엔드는 사용자 인터페이스 구현에 React.js를 필수로 사용해야 한다. 백엔드의 서버 측 로직 및 API 개발은 Java Spring Boot를 사용해야 한다.
- 인증 및 보안: 사용자 로그인 및 인증에는 JWT(Json Web Token) 방식의 토큰 기반 인증을 사용해야 한다. 모든 API 요청 및 응답은 HTTPS를 통해 전송되어야 하며, 데이터의 무결성과 보안을 보장해야 한다.
- 배포 및 호스팅: 프론트엔드는 vercel을 사용하고 백엔드는 ngrok을 사용하여 테스트 환경 배포를 지원해야 한다.
- 버전 관리: 코드 관리를 위해 Git을 사용해야 하며, GitHub에서 Front-end repository와 Back-end repository를 사용하여 협업해야 한다.
- API 제한 사항: 모든 API response는 JSON 형식으로 반환되어야 하며 성공과 실패에 대한 명확한 메시지와 상태 코드가 포함되어야 한다. 모든 API는 RESTful 표준을 따르며, CRUD(Create, Read, Update, Delete) 작업에 맞춰 HTTP method를 사용해야 한다.
- 라이센스 준수: 모든 라이브러리는 오픈 소스 라이센스를 준수하며 상업적 사용이 가능한 라이브러리만 사용한다.
- 테스트: 사용자의 프론트엔드와 백엔드, 데이터베이스와 애플리케이션 간의 통합 테스트를 진행해야 한다. 외부 서비스 API와의 통합 테스트를 진행해야 한다. 사용성 테스트를 통해 UX를 개선해야 한다. 인증 및 권한 테스트로 인증 관련 로직이 제대로 동작하는지 테스트를 진행해야 한다. API의 응답 시간은 일반적인 요청에 대해 최대 1초 이내여야 하며 사용자가 경험하는 페이지 로딩 시간은 최대 3초 이내의 응답 시간을 목표로 하여 성능 테스트를 진행해야 한다.

# High level Architecture
### Tier Architecture
<img width="90%" alt="tier_architecture" src="https://github.com/user-attachments/assets/37cc9cc2-ea70-43d0-a8cd-4a76bcbd2128">

### MVC Architecture
<img width="90%" alt="mvc_architecture" src="https://github.com/user-attachments/assets/d855341f-ac50-4189-bcad-0a2278897950">

# Technology stacks
### ✔️Front-end
<img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=React&logoColor=black"><img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=black"><img src="https://img.shields.io/badge/Styled Components-DB7093?style=for-the-badge&logo=styled-components&logoColor=white">

### ✔️Back-end
<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=green"><img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=yellow"><img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white">

### ✔️Deployment
<img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=Docker&logoColor=white"><img src="https://img.shields.io/badge/GitHub Actions-2088FF?style=for-the-badge&logo=GitHub-Actions&logoColor=white"><img src="https://img.shields.io/badge/Ngrok-1F1E25?style=for-the-badge&logo=Ngrok&logoColor=white"><img src="https://img.shields.io/badge/Vercel-000000?style=for-the-badge&logo=Vercel&logoColor=white">

### ✔️Collaboration Tools
<img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=GitHub&logoColor=white"><img src="https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=Notion&logoColor=white">

# Installation guideline
### FE
- node.js 설치
```
# 의존성 설치
npm install

# 실행
npm start
```
- Vercel Deployment
  - https://albasidae-fe.vercel.app/

### BE

### Docker
- https://github.com/AlbaSidaeUOS/AlbaSidae/blob/main/docker_guide.md  

# Project Delieverables
- 요구사항 분석 명세서 final version
  - https://github.com/AlbaSidaeUOS/AlbaSidae/blob/main/artifacts/Requirements-Albasidae-v02.docx
- Architecture 및 Design Documents
  - Software Architecture
    - https://github.com/AlbaSidaeUOS/AlbaSidae/blob/main/artifacts/High-level%20Architecture%20UML%20Diagrams%20Document_%EC%95%8C%EB%B0%94%EC%8B%9C%EB%8C%80.pptx
  - Software Design
    - https://github.com/AlbaSidaeUOS/AlbaSidae/blob/main/artifacts/UML%20Diagram%20Raw%20file_%EC%95%8C%EB%B0%94%EC%8B%9C%EB%8C%80.zip
  - UI Design
    - https://github.com/AlbaSidaeUOS/AlbaSidae/blob/main/artifacts/UI%20Design%20Document_%EC%95%8C%EB%B0%94%EC%8B%9C%EB%8C%80.pptx
- Coding Standard
  - https://github.com/AlbaSidaeUOS/AlbaSidae/blob/main/artifacts/Coding%20Standard%2C%20Repository%20Management%20and%20Review%20Process_%EC%95%8C%EB%B0%94%EC%8B%9C%EB%8C%80.docx
- Code
  - Notion에서 새로운 업무 단위마다 티켓을 생성 후, Decription에 어떤 내용인지 작성한다.
  - 각 티켓의 ID명과 동일한 branch를 생성한다. (ID명: Front-end는 FE-# 형태, Back-end는 BE-# 형태를 따른다.)
  - Front-end는 [AlbaSidae-FE](https://github.com/AlbaSidaeUOS/AlbaSidae-FE) repository에서 작업하고 Back-end는 [AlbaSidae-BE](https://github.com/AlbaSidaeUOS/AlbaSidae-BE)에서 작업한다.
  - [AlbaSidae-FE](https://github.com/AlbaSidaeUOS/AlbaSidae-FE)와 [AlbaSidae-BE](https://github.com/AlbaSidaeUOS/AlbaSidae-BE)에서 PR(Pull Request) merge와 같은 main branch에 push가 발생할 경우, github actions를 통해 [Albasidae](https://github.com/AlbaSidaeUOS/AlbaSidae)의 main branch에 merge된다.
- Test cases & results

# Repository Structure
## frontend directory
```
📦src
 ┣ 📂components # 재사용 가능한 컴포넌트들이 위치한 디렉토리
 ┣ 📂images # 애플리케이션에서 사용하는 이미지 파일들을 저장한 디렉토리
 ┣ 📂mock # 애플리케이션에서 사용하는 목업 데이터가 저장된 디렉토리
 ┣ 📂pages # 애플리케이션의 각 페이지를 구성하는 컴포넌트가 위한 디렉토리
 ┣ 📂uis # 재사용 가능한 UI 요소와 스타일을 포함하는 디렉토리
 ┣ 📜App.css 
 ┣ 📜App.jsx # 애플리케이션의 루트 컴포넌트
 ┣ 📜index.css
 ┗ 📜index.js # 애플리케이션의 Entry Point 파일
```
## backend directory
```
```
### proposal directory
- SOW.md (Statement of Work) 프로젝트에서 수행할 작업, 범위, 일정 등을 명확히 정의하는 문서를 담고 있다.
### artifacts directory
- High-level Architecture, Sequence, Class Diagram과 UML design, UI design, Coding Standard, Test cases&results, Requirements 문서들의 모든 버전을 담고 있다.
### reports
- Midterm presentation slides, Final presentation slides, Demo video를 담고 있다.
