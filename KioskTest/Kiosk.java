package KioskTest;

import java.io.Serializable;
import java.util.List;

public class Kiosk extends MenuTest{
    public Serializable kiosk() throws InterruptedException {
        Kiosk kiosk = new Kiosk();
        // 인사
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        // 키오스크 동작
        while (true) {
            // 버거, 아이스크림 등 음식 종류를 출력
            for (int i = 0; i < super.mainMenu.length; i++) {

                System.out.printf("%s \n", super.mainMenu[i]);
            }
            // 키오스크 동작 (각 음식 메뉴로 이동하는 스캐너)
            int ChoiceKiosk = sc.nextInt();

            if (ChoiceKiosk == 1) {
                System.out.println("버거 목록으로 이동합니다.");
                System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
                System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                System.out.println("[ Burgers MENU ]");

                while (true) {
                    // 버거 종류 출력
                    for (int i = 0; i < super.BurgersMenu.length ; i++) {
                        System.out.printf("%s \n", super.BurgersMenu[i]);
                    }
                    // 버거의 종류와 가격을 가져오기 위한 인스턴스 배열
                    List<Double> burgerPrice = super.BP();
                    List<String> burgerList = super.BL();
                    // 음식 종류 선택
                    int no = sc.nextInt();
                    if (no == 1 || no == 2 || no == 3 || no == 4 || no == 5) {
                        // 새로운 인스턴스를 만들고 값을 넣어주는데 사용자가 입력한 값(no)에 -1 을 하여 입력한 숫자와 배열이 가지고 있는 인덱스와 동일하게 하기
                        Double bprice = burgerPrice.get((no - 1));
                        String burger = burgerList.get((no - 1));
                        // 재확인 Class로 이동 (String인 burger 와 Double인 brice를 가지고 감)
                        double_check doubleCheck = new double_check();
                        doubleCheck.Double_check(burger, bprice);
                    } else if (no == 6) {
                        System.out.println("처음 화면으로 돌아갑니다.");
                    } else {
                        System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
                    }
                }
            } else if (ChoiceKiosk == 2) {
                System.out.println("아이스크림 목록으로 이동합니다.");
                System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                System.out.println("[ Ice Cream MENU ]");

                while (true) {
                    for (int i = 0; i < super.IceCreamMenu.length ; i++) {
                        System.out.printf("%s \n", super.IceCreamMenu[i]);
                    }
                    List<Double> iceCreamPrice = super.IP();
                    List<String> IceCreamList = super.IL();
                    int no = sc.nextInt();
                    if (no == 1 || no == 2 || no == 3) {
                        Double iprice = iceCreamPrice.get((no - 1));
                        String icecream = IceCreamList.get((no - 1));
                        double_check doubleCheck = new double_check();
                        doubleCheck.Double_check(icecream, iprice);
                    } else if (no == 4) {
                        System.out.println("처음 화면으로 돌아갑니다.");
                        kiosk.kiosk();
                    } else {
                        System.out.println("잘못입력하셨습니다 다시 입력해주세요");
                    }
                }
            } else if (ChoiceKiosk == 3) {
                System.out.println("음료 목록으로 이동합니다.");
                System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
                System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                System.out.println("[ Drink MENU ]");

                while (true) {
                    for (int i = 0; i < super.DrinkMenu.length ; i++) {
                        System.out.printf("%s \n", super.DrinkMenu[i]);
                    }
                    List<Double> drinkPrice = super.DP();
                    int no = sc.nextInt();
                    if (no == 1 || no == 2 || no == 3|| no == 4|| no == 5|| no == 6) {
                        Double drprice = drinkPrice.get((no - 1));
                        String drink = DrinkL().get((no - 1));
                        double_check doubleCheck = new double_check();
                        doubleCheck.Double_check(drink, drprice);
                    } else if (no == 7) {
                        System.out.println("처음 화면으로 돌아갑니다.");
                        kiosk.kiosk();
                    } else {
                        System.out.println("잘못입력하셨습니다 다시 입력해주세요");
                    }
                }
            } else if (ChoiceKiosk == 4) {
                System.out.println("맥주 목록으로 이동합니다.");
                while (true) {
                    for (int i = 0; i < super.BeerMenu.length ; i++) {
                        System.out.printf("%s \n", super.BeerMenu[i]);
                    }
                    int no = sc.nextInt();
                    if (no == 1|| no == 2) {
                        String beer = BeerL().get((no - 1));
                        Double beerprice = BEERP().get((no - 1));
                        double_check doubleCheck = new double_check();
                        doubleCheck.Double_check(beer, beerprice);
                    } else if (no == 3) {
                        System.out.println("처음 화면으로 돌아갑니다.");
                        kiosk.kiosk();
                    } else  {
                        System.out.println("잘못 입력 하셨습니다 다시 입력 해주세요");
                    }
                }
            } else if (ChoiceKiosk == 5) {
                System.out.println("담아두신 상품목록으로 이동합니다.");
                Order order = new Order();
                order.order();
            } else if (ChoiceKiosk == 6) {
                choiceMenu.clear();
                priceMenu.clear();
                System.out.println("모든 주문을 취소합니다.");
                System.out.println("장바구니 : " + choiceMenu);
                kiosk.kiosk();
            } else if (ChoiceKiosk == 0) {
                Double sum2 = totalPrice.stream().reduce(0D, Double::sum);

                System.out.println("[ 총 판매금액 현황 ]");
                System.out.printf("현재까지 총 판매된 금액은 [ W " + sum2 + " ] 입니다.\n");
                System.out.println("[ 총 판매상품 목록 현황 ]");
                System.out.println("현재까지 총 판매된 상품 목록은 아래와 같습니다.");

                for (int i = 0; i < totalMenu.size(); i++) {
                    System.out.printf("%s \n", super.totalMenu.get(i));
                }
                System.out.println("1. 돌아가기");
                int no = sc.nextInt();
                kiosk.kiosk();
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
            }
        }
    }
}