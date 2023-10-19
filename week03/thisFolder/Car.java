package week03.thisFolder;

import week03.Door;
import week03.Handler;
import week03.Tire;

public class Car {
    static final String company = "GENESIS"; // 자동차 회사
    String model = "Gv80"; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear = 'P'; // 기어의 상태, P,R,N,D
    boolean lights = true; // 자동차 조명의 상태

    Tire tire = new Tire();
    Door door;
    Handler handler;

    // (1) : 오버로딩
    public Car(String model) {
        this(model, "Blue", 50000000);
    }

    // (2)
    public Car(String model, String color) {
        this(model, color, 100000000);
    }

    // (3)
    // 3번째 를 이용해서 전부 객체를 만들어줌 1,2 번쨰 들에 입력값을 넣는 것을 제외한 나머지 것들은 여기로 옴
    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // 메서드 영역
    double gasPedal(double kmh, char type) {
        changeGear(type); // 가속도 폐달을 밟으면 자동으로 기어가 변한다.
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵");
    }

    Car returnInstance() {
        return this;
    }
}
