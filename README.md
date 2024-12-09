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
- Demo Video URL
  - https://youtu.be/P26uF7IQ3sk

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
- Intellij IDEA 설치
- AlbasidaeUOS/Albasidae-BE repository의 zip파일 다운로드
- Docker에서 albasidae-backend-1 컨테이너를 제외하고 실행
- src/main/java/albabe.albabe에서 AlbaBeApplication 실행
- swagger는 http://localhost:8080/swagger-ui/index.html, 웹 페이지는 localhost:3000 으로 접속

- Vercel Deployment
  - https://albasidae-fe.vercel.app/

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
  - Branch Naming & Workflow
    - Notion에서 새로운 업무 단위마다 티켓을 생성 후, Decription에 어떤 내용인지 작성한다.
    - 각 티켓의 ID명과 동일한 branch를 생성한다. (ID명: Front-end는 FE-# 형태, Back-end는 BE-# 형태를 따른다.)
    - Front-end는 [AlbaSidae-FE](https://github.com/AlbaSidaeUOS/AlbaSidae-FE) repository에서 작업하고 Back-end는 [AlbaSidae-BE](https://github.com/AlbaSidaeUOS/AlbaSidae-BE)에서 작업한다.
    - [AlbaSidae-FE](https://github.com/AlbaSidaeUOS/AlbaSidae-FE)와 [AlbaSidae-BE](https://github.com/AlbaSidaeUOS/AlbaSidae-BE)에서 PR(Pull Request) merge와 같은 main branch에 push가 발생할 경우, github actions를 통해 [Albasidae](https://github.com/AlbaSidaeUOS/AlbaSidae)의 main branch에 merge된다.
  - Key Logic and Code Description
# 프로젝트 구조

# 📁 main/java/albabe/albabe
---
## 📂 config
- **AwsConfig.java**  
  : S3 서비스를 이용하기 위한 설정 소스파일
- **SecurityConfig.java**  
  : 보안 관련 설정 소스파일

---

## 📂 domain
---
---
##### 📂 controller
컨트롤러 소스파일들의 모음. 기능을 사용하기 위한 역할을 수행합니다.
- **JobApplicationController.java**  
  : 알바 지원에 관련된 컨트롤러 소스파일
- **JobPostController.java**  
  : 모집 공고와 관련된 컨트롤러 소스파일
- **ResumeController.java**  
  : 이력서와 관련된 컨트롤러 소스파일
- **TimeTableController.java**  
  : 시간표 등록과 관련된 컨트롤러 소스파일
- **UserController.java**  
  : 회원과 관련된 컨트롤러 소스파일
---
##### 📂 dto
Dto 소스파일들의 모음. Entity에서 가져온 데이터의 틀 역할을 합니다.
- **CompanyDto.java**  
  : 기업정보 Dto 소스파일
- **FilterDto.java**  
  : 필터링 Dto 소스파일
- **JobApplicationDto.java**  
  : 알바 지원 Dto 소스파일
- **JobPostResponse.java**  
  : 모집 공고 Dto 소스파일
- **PersonalDto.java**  
  : 개인 회원 Dto 소스파일
- **ResumeDto.java**  
  : 이력서 Dto 소스파일
- **TimeTableDto.java**  
  : 시간표 Dto 소스파일
- **UserDto.java**  
  : 회원 Dto 소스파일
---
##### 📂 entity
Entity 소스파일들의 모음. DB의 데이터와 대응합니다.
- **JobApplicationEntity.java**  
  : 알바 지원 Entity 소스파일
- **JobPostEntity.java**  
  : 모집 공고 Entity 소스파일
- **ResumeEntity.java**  
  : 이력서 Entity 소스파일
- **TimeTableEntity.java**  
  : 시간표 Entity 소스파일
- **UserEntity.java**  
  : 회원 Entity 소스파일
---
##### 📂 enums
- **UserRole.java**  
  : 회원 종류를 담고 있는 enum 자료형 선언 소스파일
---
##### 📂 repository
JPA를 사용해 DB와 연결하는 역할을 합니다.
- **JobApplicationRepository.java**  
  : 알바 지원 Repository 소스파일. 모집 공고 찾기, 삭제 함수 존재
- **JobPostRepository.java**  
  : 모집 공고 Repository 소스파일. 모집 공고 정렬, 찾기, 필터링된 모집 공고 조회, 검색 함수 존재
- **ResumeRepository.java**  
  : 이력서 Repository 소스파일. 이력서 찾기 함수 존재
- **TimeTableRepository.java**  
  : 시간표 Repository 소스파일. 시간표 찾기 함수 존재
- **UserRepository.java**  
  : 회원 Repository 소스파일. 사용자 찾기 함수 존재
---
##### 📂 service
컨트롤러의 기능들을 구현합니다.
- **JobApplicationService.java**  
  : 알바 지원 Service 소스파일. 알바 지원 관련 함수들, JobPostEntity를 JobPostDto로 변환하는 함수 구현
- **JobPostService.java**  
  : 모집 공고 Service 소스파일. 필터링 기능 함수, 공고 관련 함수들 구현
- **ResumeService.java**  
  : 이력서 Service 소스파일. 이력서 등록/수정/삭제 관련 함수들 구현
- **S3Service.java**  
  : S3 기능 중 파일 업로드 기능을 맡은 소스파일
- **TimeTableService.java**  
  : 시간표 Service 소스파일. 시간표 등록/수정/조회 함수 구현
- **UserService.java**  
  : 회원 Service 소스파일. 회원가입, 로그인, 아이디/비밀번호 찾기, 회원 정보 수정, 사용자 삭제, 유저 이미지 업로드 함수 구현
---
---
## 📂 exception
- **GlobalExceptionHandler.java**  
  : 예외 처리에 관한 소스파일

---

## 📂 security
- **JwtTokenProvider.java**  
  : Jwt Token에 관한 소스파일

---

## 📂 util
- **ApiResponse.java**  
  : ApiResponse를 정의하는 소스파일

---

## 📂 application
- **AlbaBeApplication.java**  
  : 프로그램 실행 소스파일



- Test cases & results
  - https://github.com/AlbaSidaeUOS/AlbaSidae/blob/main/artifacts/test%20cases%20and%20results_albasidae_v01.xlsx

# Repository Structure
### frontend directory
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
### backend directory
```
📦src
 ┣ 📂config # 웹 환경 설정 및 보안 설정을 정의하는 객체들이 모인 디렉토리
 ┣ 📂controller # 명령을 입력받는 객체들이 정의된 디렉토리
 ┣ 📂dto # 전달하고 싶은 데이터를 담고 있는 객체들이 정의된 디렉토리
 ┣ 📂entity # 데이터 구조를 정의하고 데이터베이스와 매핑하는 객체들이 정의된 디렉토리
 ┣ 📂enums # user의 역할의 종류가 정의된 디렉토리
 ┣ 📂repository # 데이터를 조회하거나 조작하는 작업을 처리하는 객체들이 정의된 디렉토리
 ┣ 📂service # 입력받은 명령을 수행하는 객체들이 정의된 디렉토리
 ┗ 📂exception # 예외를 처리하는 객체가 정의된 디렉토리
```
### proposal directory
- SOW.md (Statement of Work) 프로젝트에서 수행할 작업, 범위, 일정 등을 명확히 정의하는 문서를 담고 있다.
### artifacts directory
- High-level Architecture, Sequence, Class Diagram과 UML design, UI design, Coding Standard, Test cases&results, Requirements 문서들의 모든 버전을 담고 있다.
### reports
- Midterm presentation slides, Final presentation slides, Demo video를 담고 있다.
