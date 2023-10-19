//package Kiosk;
//
//import KioskTest.Kiosk;
//import KioskTest.MenuTest;
//
//import java.io.Serializable;
//
//public class IceCream extends MenuTest {
//        public Serializable iceCream() {
//            MenuTest ar3 = new MenuTest();
//
//            System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
//            System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
//            System.out.println("[ Ice Cream MENU ]");
//
//
//            while (true) {
//                for (int i = 0; i < ar3.IceCreamMenu.length ; i++) {
//                    System.out.printf("%s \n", ar3.IceCreamMenu[i]);
//                }
//                int no = sc.nextInt();
//
//                if (no == 1) {
//
//                } else if (no == 2) {
//
//                } else if (no == 3) {
//                    System.out.println("처음 화면으로 돌아갑니다.");
//                    Kiosk kiosk = new Kiosk();
//                    kiosk.kiosk();
//                } else {
//                    System.out.println("잘못입력하셨습니다 다시 입력해주세요");
//                }
//            }
//        }
//    }
