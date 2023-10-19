package 숙제;

import java.util.Scanner;

public class Arrs {
    public static void main(String[] args) {
//        **요리 레시피 메모장 만들기**

//        - 입력값

//        - 내가 좋아하는 요리 제목을 먼저 입력합니다.
        Scanner sc = new Scanner(System.in);     // Scanner = 키보드로 입력하기, System.in 사용자로부터 입력받는 스트림
        String name = sc.nextLine();

//        - 요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해주세요. (ex. 3.5)
        double star = sc.nextDouble();

//        - 이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장을 입력합니다.
        String turn1 = sc.next();
        String turn2 = sc.next();
        String turn3 = sc.next();
        String turn4 = sc.next();
        String turn5 = sc.next();
        String turn6 = sc.next();
        String turn7 = sc.next();
        String turn8 = sc.next();
        String turn9 = sc.next();
        String turn10 = sc.next();

//        - 출력값

//        - 입력이 종료되면 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
        System.out.println("[ " + name + " ]");

//        - 이어서, 요리 별점을 소수점을 제외한 정수로만 출력해줍니다. (ex. 3)
        int star2 = (int)star;
        System.out.print("별점 : " + star2 + " ");

//        - 바로 뒤에 정수별점을 5점만점 퍼센트로 표현했을 때 값을 실수로 출력해줍니다. (ex. 60.0%)
        System.out.println(" " + "(" + star * 100 / 5 + ")" + "%");

//        - 이어서, 입력한 모든 문장 앞에 번호를 붙여서 모두 출력 해줍니다.
        System.out.println("1. " + turn1);
        System.out.println("2. " + turn2);
        System.out.println("3. " + turn3);
        System.out.println("4. " + turn4);
        System.out.println("5. " + turn5);
        System.out.println("6. " + turn6);
        System.out.println("7. " + turn7);
        System.out.println("8. " + turn8);
        System.out.println("9. " + turn9);
        System.out.println("10. " + turn10);
    }
}
