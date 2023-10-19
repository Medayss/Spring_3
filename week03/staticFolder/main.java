package week03.staticFolder;

public class main {
    public static void main(String[] args) {
        // 클래스 필드 company 확인
        System.out.println(Car.company + "\n");     // 제네시스 기존 세팅 값 제네시스
        // 클래스 필드 변경 및 확인
        Car.company = "Audi";
        System.out.println(Car.company + "\n");     // 아우디 8번째 줄에서 바꾼 아우디

        // 클래스 메소드 호출
        String companyName = Car.setCompany("Benz");        // setCompany를 이용해 company에 벤츠를 넣고 Car.java 62번째 줄에 의해 companyName에 벤츠가 들어감
        System.out.println("companyName = " + companyName);

        System.out.println();
        // 참조형 변수 사용
        Car car = new Car(); // 객체 생성

        car.company = "Ferrari";                    // 사용 권장 x
        System.out.println(car.company + "\n");

        String companyName2 = car.setCompany("Lamborghini");
        System.out.println("companyName2 = " + companyName2);
    }
}
