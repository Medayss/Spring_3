//package Kiosk;
//
//import KioskTest.Kiosk;
//import KioskTest.MenuTest;
//
//public class Drink extends MenuTest {
//    public void drink() throws InterruptedException {
//        MenuTest ar4 = new MenuTest();
//
//        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
//        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
//        System.out.println("[ Drink MENU ]");
//
//
//        while (true) {
//            for (int i = 0; i < ar4.DrinkMenu.length ; i++) {
//                System.out.printf("%s \n", ar4.DrinkMenu[i]);
//            }
//            int no = sc.nextInt();
//
//            if (no == 1) {
//
//            } else if (no == 2) {
//
//            } else if (no == 3) {
//
//            } else if (no == 4) {
//
//            } else if (no == 5) {
//                System.out.println("처음 화면으로 돌아갑니다.");
//                Kiosk kiosk = new Kiosk();
//                kiosk.kiosk();
//            } else {
//                System.out.println("잘못입력하셨습니다 다시 입력해주세요");
//            }
//        }
//    }
//}
