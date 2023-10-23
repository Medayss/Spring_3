package TIL.Homepage;

import java.util.Scanner;

public class Main extends HomePage implements Back {
    public void View() {
        while (true) {
            System.out.println("게시판 입니다.");
            System.out.println("-----------------------------------");
            System.out.println("번호           내용              작성시간");
            // 게시글 보여주기 for 반복문으로 userPosting 배열을 하나씩 보여줌
            for (int i = 0; i < userPosting.size(); i++) {
                System.out.println((i + 1) + "             " + userPosting.get(i) + ("         " + postingTime.get(i)));
            }
            System.out.println("작성     수정     삭제");
            // 게시글 작성 키오스크랑 다르게 switch case 문 사용
            Scanner getLine = new Scanner(System.in);
            String sc = getLine.nextLine();
            switch (sc) {
                case "작성": {
                    Post posting = new Post();
                    posting.Post();
                }
                case "수정": {
                    System.out.println("수정할 게시글 번호를 입력해주세요");
                    int fix = getLine.nextInt();
                    System.out.println("내용을 입력하세요");
                    String fixPost = getLine.next();               // 왜 실행이 안되는 것인가.... 너가 실행이 안되니 fixPost에 아무것도 입력이 안되잖니... next 는 됨
                    super.userPosting.set(fix - 1, fixPost);
                    System.out.println("수정이 완료 되었습니다.");
                    Main go = new Main();
                    go.View();
                }
                case "삭제": {
                    System.out.println("삭제할 게시글 번호를 입력해주세요");
                    int fix = getLine.nextInt();
                    super.userPosting.remove(fix - 1);
                    super.postingTime.remove(fix - 1);
                    System.out.println("삭제가 완료 되었습니다.");
                    Main go = new Main();
                    go.View();
                }
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
        }
    }
}