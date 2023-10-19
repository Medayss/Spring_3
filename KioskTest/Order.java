package KioskTest;

public class Order extends MenuTest{
    public void order() throws InterruptedException {
        while (true) {
            Double sum1 = super.priceMenu.stream().reduce(0D, Double::sum);
            System.out.println("아래와 같이 주문하시겠습니까?");
            System.out.println(super.choiceMenu);
            System.out.println("[ Total ]");
            System.out.printf("W : " + sum1 + "\n" );
            System.out.println("1. 확인     2. 취소");
            Kiosk kiosk = new Kiosk();
            int no = sc.nextInt();
            int i = 0;
            i += 1;
            if (no == 1) {
                System.out.println("주문이 완료되었습니다.");
                System.out.println("대기번호는 [ " + i + " ] 번 입니다.");
                System.out.println("(3초 후 메뉴판으로 돌아갑니다.)");

                Thread.sleep(3000);
                kiosk.kiosk();
            } else if (no == 2) {
                System.out.println("1초 후 처음 화면으로 돌아갑니다.");
                Thread.sleep(1500);
                kiosk.kiosk();
            } else if (no == 3) {
                System.out.println("처음 화면으로 돌아갑니다.");
                kiosk.kiosk();
            } else  {
                System.out.println("잘못입력하셨습니다 다시 입력해주세요");
            }
        }
    }
}
