package TIL.Homepage;


public class Start {
    public static void main(String[] args) {
        // 게시판 구성요소
        // CRUD
        // C : 생성 .add 를 사용해서 글 목록에 보이고 글 작성 시 메인화면에 한개씩 늘어나게
        // R : 메인화면에 출력되게
        // U : .set 사용해서 수정하기
        // 게시글 번호, 글 내용, 현재 날짜(LocalDate time = LocalDate.now();) 시간 (LocalTime time = LocalTime.now();)
        // D : .remove 로 인덱스 삭제

        // 게시판입니다.
        // ----------------------
        // 1. 내용 / 현재 날짜
        // 2. 내용 / 현재 날짜
        // 3. 내용 / 현재 날짜
        // ...
        // 게시글 작성(다른 클래스 이동)      수정       삭제
        // 어떤 글을 수정하시겠습니까 or 삭제하시겠습니까
        Main go = new Main();
        go.View();
    }
}

