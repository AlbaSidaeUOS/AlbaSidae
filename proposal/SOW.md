# Project Title
알바시대(Albasidae)

# Project Scope
서울시립대학교 컴퓨터과학부 2024년 소프트웨어공학 프로젝트로 Software Development Life-Cycle을 기반으로 객체지향 소프트웨어공학 방법론을 적용하여 학교 주변 알바 구인, 구직을 개인 맞춤형으로 편리하게 제공하는 웹 서비스 개발

# Project Values/Motivations
구인자는 손쉽게 구인 공고를 올려서 원하는 인재를 찾을 수 있고, 구직자는 원하는 조건에 맞는 아르바이트를 쉽게 찾을 수 있도록 합니다. 다른 알바 중계 플랫폼과의 차별점으로 우리학교 학생들을 주 타겟으로 개인의 시간표나 일정 시간 등록 기능을 제공합니다. 기존 관련 플랫폼을 보면 필터링 기능에 근무 요일, 근무 시간 등을 선택할 수 있게 되어있지만 요일마다 가능한 시간이 다른 학생의 입장에서는 활용도가 높지 않은 기능입니다. 따라서 알바시대는 알바를 검색할때 자신의 시간표를 제외한 시간의 구인 공고를 필터링할 수 있는 기능을 제공합니다. 또한 구직자가 공고를 등록하면 해당 위치가 자동으로 알바지도에 등록되어 쉽게 구직자가 위치 중심으로 정보를 쉽게 파악할 수 있습니다.

# Project Duration
2024년 2학기

# Project Description(Key Features)
### 공통
- 회원가입: EMAIL, PASSWORD, PHONE NUMBER(구인자) or BUSINESS NUMBER(구직자) 정보로 회원가입
- 로그인: EMAIL, PASSWORD로 로그인
- 아이디/비밀번호 찾기: PHONE NUMBER(구인자) or BUSINESS NUMBER(구직자)로 아이디/비밀번호 찾기

### 구직자
- 시간표 등록: 모집 공고를 찾을 때 필터링 항목으로 사용할 시간표 등록
- 이력서 관리: 본인의 이력서를 등록, 수정, 삭제
- 모집 공고 조회/검색: 지도API를 통한 지도 내 아르바이트 검색 및 지역, 하는일, 근무기간, 근무요일, 근무시간, 시간표 맞춤 필터 항목에 따라 모집 공고를 조회
- 알바 지원: 모집 공고에 알바 지원
- 프로필 설정: 본인의 계정 정보 수정

### 구인자
- 모집 공고 관리: 모집 공고를 등록, 수정, 삭제
- 인재 정보 조회: 이력서가 등록된 구직자들 모아보기
- 프로필 설정: 본인의 계정 정보 수정

### 관리자
- 회원 관리: 부적절한 회원정보 삭제
- 게시물 관리: 부적절한 모집 공고 삭제

# Expected Deliverables
- 요구사항 분석 명세서
- 아키텍쳐 및 설계(UML, UI Design)
- Coding standard
- Source code
- Test cases & results
- Reports(PPT, Demo Video)

# Project Constraints
- 플랫폼 접근성: 다양한 사용자층이 접근할 수 있도록, 시스템은 웹 브라우저를 통해 구현되어야 한다.
- 프로그래밍 언어 및 프레임워크: 프론트엔드는 사용자 인터페이스 구현에 React.js를 필수로 사용해야 한다. 백엔드의 서버 측 로직 및 API 개발은 Java Spring Boot를 사용해야 한다.
- 인증 및 보안: 사용자 로그인 및 인증에는 JWT(Json Web Token) 방식의 토큰 기반 인증을 사용해야 한다. 모든 API 요청 및 응답은 HTTPS를 통해 전송되어야 하며, 데이터의 무결성과 보안을 보장해야 한다.
- 배포 및 호스팅: 프론트엔드는 vercel을 사용하고 백엔드는 ngrok을 사용하여 테스트 환경 배포를 지원해야 한다.
- 버전 관리: 코드 관리를 위해 Git을 사용해야 하며, GitHub에서 Front-end repository와 Back-end repository를 사용하여 협업해야 한다.
- API 제한 사항: 모든 API response는 JSON 형식으로 반환되어야 하며 성공과 실패에 대한 명확한 메시지와 상태 코드가 포함되어야 한다. 모든 API는 RESTful 표준을 따르며, CRUD(Create, Read, Update, Delete) 작업에 맞춰 HTTP method를 사용해야 한다.
- 라이센스 준수: 모든 라이브러리는 오픈 소스 라이센스를 준수하며 상업적 사용이 가능한 라이브러리만 사용한다.
- 테스트: 사용자의 프론트엔드와 백엔드, 데이터베이스와 애플리케이션 간의 통합 테스트를 진행해야 한다. 외부 서비스 API와의 통합 테스트를 진행해야 한다. 사용성 테스트를 통해 UX를 개선해야 한다. 인증 및 권한 테스트로 인증 관련 로직이 제대로 동작하는지 테스트를 진행해야 한다. API의 응답 시간은 일반적인 요청에 대해 최대 1초 이내여야 하며 사용자가 경험하는 페이지 로딩 시간은 최대 3초 이내의 응답 시간을 목표로 하여 성능 테스트를 진행해야 한다.

# Project Team Members
| 학번        | 이름   | 역할         |
| ----------- | ------ | ------------ |
| 2014920047  | 임진우  |    BE        |
| 2020920031  | 서제임스  |    FE        |
| 2020920058  | 조성채  |     BE       |
| 2022920010  | 김동하  |     FE       |
| 2022920024  | 박동찬  |     FE       |
| 2022920045  | 이승목  |     BE       |

# Technology stacks
### ✔️Front-end
<img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=React&logoColor=black"><img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=black"><img src="https://img.shields.io/badge/Styled Components-DB7093?style=for-the-badge&logo=styled-components&logoColor=white">

### ✔️Back-end
<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=green"><img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=yellow"><img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white">

### ✔️Deployment
<img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=Docker&logoColor=white"><img src="https://img.shields.io/badge/GitHub Actions-2088FF?style=for-the-badge&logo=GitHub-Actions&logoColor=white"><img src="https://img.shields.io/badge/Ngrok-1F1E25?style=for-the-badge&logo=Ngrok&logoColor=white"><img src="https://img.shields.io/badge/Vercel-000000?style=for-the-badge&logo=Vercel&logoColor=white">

### ✔️Collaboration Tools
<img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=GitHub&logoColor=white"><img src="https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=Notion&logoColor=white">

