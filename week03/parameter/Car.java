package week03.parameter;

import week03.Door;
import week03.Handler;
import week03.Tire;

public class Car {
    // 필드 영역

    // 1) 고유 데이터 영역
    String company; // 자동차 회사
    String model = "Gv80"; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    // 2) 상태 데이터 영역
    double speed;  // 자동차 속도 , km/h
    char gear; // 기어의 상태, P,R,N,D
    boolean lights = true; // 자동차 조명의 상태

    // 3) 객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handler handler;

    // 3) 생성자 영역
    // 기본 생성자
    public Car() {}

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

    // 자동차의 속도 .. 가변길이 메소드
    void carSpeed(double ... speeds) {
        for (double v : speeds) {
            System.out.println("v = " + v);
        }
    }
}
