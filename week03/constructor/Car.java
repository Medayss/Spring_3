package week03.constructor;

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
    public Car(String modelName) {
        model = modelName;
        System.out.println("첫 번째 생성자");
    }

    // (2)
    public Car(String modelName, String colorName) {
        model = modelName;
        color = colorName;
        System.out.println("두 번째 생성자");
    }

    // (3)
    public Car(String modelName, String colorName, double priceValue) {
        model = modelName;
        color = colorName;
        price = priceValue;
        System.out.println("세 번째 생성자");
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
}
