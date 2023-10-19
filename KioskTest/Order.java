package KioskTest;

public class Order extends MenuTest{
    public void order() throws InterruptedException {
        System.out.println(super.choiceMenu);
        while (true) {
            for (int i = 0; i < super.OrderMenu.length ; i++) {
                System.out.printf( super.OrderMenu[i]);
                System.out.println("[ Total ]");
                System.out.println("W" );
            }
            Kiosk kiosk = new Kiosk();
            int no = sc.nextInt();
            int stay = 0;
            if (no == 1) {
                System.out.println("주문이 완료되었습니다.");
                System.out.println("대기번호는 [" + stay + 1 + " ] 번 입니다.");
                System.out.println("3초 후 메뉴판으로 돌아갑니다.");
                Thread.sleep(3000);
                kiosk.kiosk();
            } else if (no == 2) {
                System.out.println("처음 화면으로 돌아갑니다.");
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
