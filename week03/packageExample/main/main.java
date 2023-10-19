package week03.packageExample.main;

import week03.packageExample.pk1.Car;

public class main {
    public static void main(String[] args) {
//        // 클래스의 일부분이며 하위패키지를 도트(.)로 구분한다.
//        week03.packageExample.pk1.Car car1 = new week03.packageExample.pk1.Car();
//        week03.packageExample.pk2.Car car2 = new week03.packageExample.pk2.Car();
//
//        car1.horn();
//        car2.horn();

        // import 를 이용하여 다른 패키지 호출하기
        Car car = new Car();
        car.horn();

        // class이름이 같아서 pk2는 import로 호출 불가
        week03.packageExample.pk2.Car car2 = new week03.packageExample.pk2.Car();
        car2.horn();
    }
}
