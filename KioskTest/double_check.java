package KioskTest;

import java.util.List;
import java.util.Map;

public class double_check extends MenuTest{
   public void Double_check(String menu) throws InterruptedException {
       Kiosk kiosk = new Kiosk();
       System.out.println(menu);
       System.out.println(doubleCheck);
       System.out.println("1. 확인        2. 취소");
           int no = sc.nextInt();

           if (no == 1) {
               System.out.println(menu.split("\\|")[0].trim() + "가 장바구니에 추가되었습니다.");
               super.choiceMenu.add(menu);
                kiosk.kiosk();
           } else if (no == 2) {
               System.out.println("취소되었습니다.");
               kiosk.kiosk();
           } else {
               System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
           }
   }
}
