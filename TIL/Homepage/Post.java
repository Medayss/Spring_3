package TIL.Homepage;

import java.time.LocalTime;
import java.util.Scanner;

public class Post extends HomePage implements Back{
    public void Post() {
        Scanner sc = new Scanner(System.in);
        System.out.println("내용을 입력해 주세요");
        String UP = sc.nextLine();
        LocalTime time = LocalTime.now();
        Double_Check doubleCheck = new Double_Check();
        doubleCheck.double_check(UP, time);
    }
}