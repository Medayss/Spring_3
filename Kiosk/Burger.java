//package Kiosk;
//
//import KioskTest.Kiosk;
//import KioskTest.MenuTest;
//import KioskTest.double_check;
//
//import java.io.Serializable;
//import java.util.List;
//
//public class Burger extends MenuTest {
//    public Serializable burger() throws InterruptedException {
//        List<String> burgerList = super.BL();
//        MenuTest ar2 = new MenuTest();
//
//        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
//        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
//        System.out.println("[ Burgers MENU ]");
//
//
//        while (true) {
//            for (int i = 0; i < ar2.BurgersMenu.length ; i++) {
//                System.out.printf("%s \n", ar2.BurgersMenu[i]);
//            }
//            int no = sc.nextInt();
//
//            if (no == 1 || no == 2 || no == 3 || no == 4 || no == 5) {
//                String burger = burgerList.get((no - 1));
//                double_check doubleCheck = new double_check();
//                doubleCheck.Double_check(burger);
//            } else if (no == 6) {
//                System.out.println("처음 화면으로 돌아갑니다.");
//                Kiosk kiosk = new Kiosk();
//                kiosk.kiosk();
//            } else {
//                System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
//            }
//        }
//    }
//}
