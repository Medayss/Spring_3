package KioskTest;


import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Kiosk extends MenuTest{

    public Serializable kiosk() throws InterruptedException {
        Kiosk kiosk = new Kiosk();
        // 인사
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        // 키오스크 동작
        while (true) {

            for (int i = 0; i < super.mainMenu.length; i++) {

                System.out.printf("%s \n", super.mainMenu[i]);
            }
            int no1 = sc.nextInt();

            if (no1 == 1) {
                System.out.println("버거 목록으로 이동합니다.");
                System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
                System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                System.out.println("[ Burgers MENU ]");

                while (true) {
                    for (int i = 0; i < super.BurgersMenu.length ; i++) {
                        System.out.printf("%s \n", super.BurgersMenu[i]);
                    }
                    int no = sc.nextInt();
                    List<Double> burgerPrice = super.BP();
                    List<String> burgerList = super.BL();
                    
                    if (no == 1 || no == 2 || no == 3 || no == 4 || no == 5) {
                        Double bprice = burgerPrice.get((no - 1));
                        String burger = burgerList.get((no - 1));
                        double_check doubleCheck = new double_check();
                        doubleCheck.Double_check(burger);
                    } else if (no == 6) {
                        System.out.println("처음 화면으로 돌아갑니다.");
                    } else {
                        System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
                    }
                }
            } else if (no1 == 2) {
                System.out.println("아이스크림 목록으로 이동합니다.");
                System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                System.out.println("[ Ice Cream MENU ]");

                while (true) {
                    for (int i = 0; i < super.IceCreamMenu.length ; i++) {
                        System.out.printf("%s \n", super.IceCreamMenu[i]);
                    }
                    int no = sc.nextInt();
                    List<String> IceCreamList = super.IL();
                    if (no == 1 || no == 2 || no == 3) {
                        String icecream = IceCreamList.get((no - 1));
                        double_check doubleCheck = new double_check();
                        doubleCheck.Double_check(icecream);
                    } else if (no == 4) {
                        System.out.println("처음 화면으로 돌아갑니다.");
                        kiosk.kiosk();
                    } else {
                        System.out.println("잘못입력하셨습니다 다시 입력해주세요");
                    }
                }
            } else if (no1 == 3) {
                System.out.println("음료 목록으로 이동합니다.");
                System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
                System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                System.out.println("[ Drink MENU ]");

                while (true) {
                    for (int i = 0; i < super.DrinkMenu.length ; i++) {
                        System.out.printf("%s \n", super.DrinkMenu[i]);
                    }
                    int no = sc.nextInt();
                    List<String> DrinkList = super.DrinkL();
                    if (no == 1 || no == 2 || no == 3|| no == 4|| no == 5|| no == 6) {
                        String drink = DrinkL().get((no - 1));
                        double_check doubleCheck = new double_check();
                        doubleCheck.Double_check(drink);
                    } else if (no == 7) {
                        System.out.println("처음 화면으로 돌아갑니다.");
                        kiosk.kiosk();
                    } else {
                        System.out.println("잘못입력하셨습니다 다시 입력해주세요");
                    }
                }
            } else if (no1 == 4) {
                System.out.println("맥주 목록으로 이동합니다.");
                while (true) {
                    for (int i = 0; i < super.BeerMenu.length ; i++) {
                        System.out.printf("%s \n", super.BeerMenu[i]);
                    }
                    int no = sc.nextInt();
                    List<String> BeerList = super.BeerL();
                    if (no == 1|| no == 2) {
                        String beer = BeerL().get((no - 1));
                        double_check doubleCheck = new double_check();
                        doubleCheck.Double_check(beer);
                    } else if (no == 3) {
                        System.out.println("처음 화면으로 돌아갑니다.");
                        kiosk.kiosk();
                    } else  {
                        System.out.println("잘못 입력 하셨습니다 다시 입력 해주세요");
                    }
                }
            } else if (no1 == 5) {
                System.out.println("담아두신 상품목록으로 이동합니다.");
                Order order = new Order();
                order.order();
            } else if (no1 == 6) {
                choiceMenu.clear();
                System.out.println("모든 주문을 취소합니다.");
                System.out.println("장바구니 : " + choiceMenu);
                kiosk.kiosk();

            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
            }



        }
    }
}
