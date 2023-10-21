package KioskTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuTest {

    // 메뉴판 메소드화
    String[] mainMenu = {"1. 버거         ㅣ 앵거스 비프 통살을 다져만든 버거", "2. 아이스크림    ㅣ 매장에서 신선하게 만드는 아이스크림", "3. 음료         ㅣ 매장에서 직접 만드는 음료", "4. 맥주         ㅣ 뉴욕 브루클린 브루어리에서 양조한 맥주", "\n[ OREDR MENU ]", "5. 주문하기    ㅣ 장바구니를 확인 후 주문합니다.", "6. 취소하기    ㅣ 진행중인 주문을 취소합니다."};
    String[] BurgersMenu = {"1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거", "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", "3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", "4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", "5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거", "6. 처음으로 돌아가기"};
    String[] IceCreamMenu = {"1. Shake of the week   | W 5.9 | 바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피", "2. Red Bean Shake    | W 6.5 | 신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크", "3. Floats | W 5.9 | 루트 비어, 퍼플 카우, 크림시클", "4. 처음으로 돌아가기"};
    String[] DrinkMenu = {"1. Fresh Brewed Iced Tea   | R : W 3.9 | 매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈절)", "2. Fresh Brewed Iced Tea    | W 3.4 | 직접 유기농 홍차를 우려낸 아이스티", "3. Fifty / Fifty | W 3.5 | 레몬에이드와 아이스티의 만남", "4. Fountain Soda | W 2.7 | 코카콜라, 코카콜라 제로, 스프라이트 환타 오렌지, 환타 그레이프", "5. Abita Root Beer | Bottle : W 4.4 | 청량감 있는 독특한 미국식 무알콜 탄산음료", "6. Bottled Water | W 1.0 ㅣ 지리산 암반대수층으로 만든 프리미엄 생수", "7. 처음으로 돌아가기"};
    String[] BeerMenu = {"1. ShackMeister Ale          | W 9.8 | 쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주", "2. Magpie Brewing Co.    | Pale Ale, Draft : W 6.8 | ", "3. 처음으로 돌아가기"};
    // 인스턴스화

    static Scanner sc = new Scanner(System.in);
    // 재확인
    String doubleCheck = "위 메뉴를 장바구니에 추가하시겠습니까?";

    // 필드 생성 -> 생성자 생성 -> 메소드 생성
    // Static은 Static끼리 연결이 되어 인스턴스 생성없이 사용이 가능하지만 옆 코드는 안붙였기에 인스턴스 생산

    // 생성자 : 객체가 만들어질 때 자동으로 호출되는 메서드

    // 인스턴스를 생산할 때 반드시 실행되어야 할 메서드를 넣어준다

    // 장바구니
    static List<String> choiceMenu = new ArrayList<>();
    static List<Double> priceMenu = new ArrayList<>();
    static String resetMenu;

    public List<String> BL() {
        List<String> bl = new ArrayList<>();
        bl.add("ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        bl.add("SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        bl.add("Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        bl.add("Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        bl.add("Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        return bl;
    }

    public List<Double> BP() {
        List<Double> bp = new ArrayList<>();
        bp.add(6.9D);
        bp.add(8.9D);
        bp.add(9.4D);
        bp.add(6.9D);
        bp.add(5.4D);
        return bp;
    }

    public List<String> BR() {
        List<String> br = new ArrayList<>();
        br.add("토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        br.add("베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        br.add("몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        br.add("포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        br.add("비프패티를 기반으로 야채가 들어간 기본버거");
        return br;
    }

    public List<String> IL() {
        List<String> il = new ArrayList<>();
        il.add("Shake of the week   | W 5.9 | 바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피");
        il.add("Red Bean Shake    | W 6.5 | 신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크");
        il.add(" Floats | W 5.9 | 루트 비어, 퍼플 카우, 크림시클");
        return il;
    }

    public List<Double> IP() {
        List<Double> ip = new ArrayList<>();
        ip.add(5.9D);
        ip.add(6.5D);
        ip.add(5.9D);

        return ip;
    }

    public List<String> DrinkL() {
        List<String> dl = new ArrayList<>();
        dl.add("Fresh Brewed Iced Tea   | W 3.9 | 매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈절)");
        dl.add("Fresh Brewed Iced Tea    | W 3.4 | 직접 유기농 홍차를 우려낸 아이스티");
        dl.add("Fifty / Fifty | W 3.5 | 레몬에이드와 아이스티의 만남");
        dl.add("Fountain Soda | W 2.7 | 코카콜라, 코카콜라 제로, 스프라이트 환타 오렌지, 환타 그레이프");
        dl.add("Abita Root Beer | Bottle : W 4.4 | 청량감 있는 독특한 미국식 무알콜 탄산음료");
        dl.add("Bottled Water | W 1.0 ㅣ 지리산 암반대수층으로 만든 프리미엄 생수");
        return dl;
    }

    public List<Double> DP() {
        List<Double> dp = new ArrayList<>();
        dp.add(3.9D);
        dp.add(3.4D);
        dp.add(3.5D);
        dp.add(2.7D);
        dp.add(4.4D);
        dp.add(1.0D);
        return dp;
    }

    public List<String> BeerL() {
        List<String> beel = new ArrayList<>();
        beel.add("ShackMeister Ale          | W 9.8 | 쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주");
        beel.add("Magpie Brewing Co.    | Pale Ale, Draft : W 6.8 | ");
        return beel;
    }

    public List<Double> BEERP() {
        List<Double> dp = new ArrayList<>();
        dp.add(9.8D);
        dp.add(6.8D);

        return dp;
    }
}