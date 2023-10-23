package TIL.Homepage;

import java.util.Scanner;

public class Double_Check extends HomePage implements Back{
    public void double_check(String post) {
        System.out.println("게시글 작성을 완료 하셨습니까?");
        System.out.println("1.예          2.아니요");
        Scanner check = new Scanner(System.in);
        int sc = check.nextInt();
        if (sc == 1) {
            System.out.println("작성이 완료되었습니다.");
            super.userPosting.add(post);
            Main goMain = new Main();
            goMain.View();
        } else if (sc == 2){
            System.out.println("이전 화면으로 돌아갑니다.");
            Post goPost = new Post();
            goPost.Post();
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
