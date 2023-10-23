package TIL.Homepage;

import java.util.Scanner;

public class Post extends HomePage implements Back{
    public void Post() {
        Scanner sc = new Scanner(System.in);
        System.out.println("내용을 입력해 주세요");
        String UP = sc.nextLine();

        Double_Check doubleCheck = new Double_Check();
        doubleCheck.double_check(UP);
    }
}