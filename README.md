# AIBE6_Project2_Team3

<h1>명언 CLI 앱</h1>

<h2>프로젝트 소개</h2>
<p>Java로 구현한 명언 관리 CLI 서비스입니다. 명언을 등록, 조회, 수정, 삭제할 수 있습니다.</p>

<h2>실행 방법</h2>
<pre><code>./gradlew run</code></pre>

<h2>기능</h2>
<table>
  <thead>
    <tr>
      <th>명령어</th>
      <th>설명</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><code>등록</code></td>
      <td>명언과 작가를 입력받아 저장. 고유 번호가 자동 발급됩니다.</td>
    </tr>
    <tr>
      <td><code>목록</code></td>
      <td>저장된 명언 전체를 최신순으로 출력합니다.</td>
    </tr>
    <tr>
      <td><code>삭제?id=N</code></td>
      <td>N번 명언을 삭제합니다. 없는 번호는 오류 메시지를 출력합니다.</td>
    </tr>
    <tr>
      <td><code>수정?id=N</code></td>
      <td>N번 명언의 내용과 작가를 수정합니다. 없는 번호는 오류 메시지를 출력합니다.</td>
    </tr>
    <tr>
      <td><code>종료</code></td>
      <td>프로그램을 종료합니다.</td>
    </tr>
  </tbody>
</table>

<h2>실행 예시</h2>
<pre><code>== 명언 앱 ==
명령) 등록
명언 : 현재를 사랑하라.
작가 : 작자미상
1번 명언이 등록되었습니다.
명령) 등록
명언 : 과거에 집착하지 마라.
작가 : 작자미상
2번 명언이 등록되었습니다.
명령) 목록
번호 / 작가 / 명언
----------------------
2 / 작자미상 / 과거에 집착하지 마라.
1 / 작자미상 / 현재를 사랑하라.
명령) 삭제?id=1
1번 명언이 삭제되었습니다.
명령) 수정?id=2
명언(기존) : 과거에 집착하지 마라.
명언 : 현재와 자신을 사랑하라.
작가(기존) : 작자미상
작가 : 홍길동
명령) 종료</code></pre>

<h2>프로젝트 구조</h2>
<pre><code>src/main/java/org/example/
├── Main.java      # 진입점
├── App.java       # 명령 처리 및 비즈니스 로직
├── Article.java   # 명언 데이터 클래스
└── Rq.java        # 명령어 파싱 클래스 (cmd?key=value 형식)</code></pre>
