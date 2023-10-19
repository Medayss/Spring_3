package week03;

public class main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체생성

        // 메소드 호출 및 반환값을 저장
        double speed = car.gasPedal(100, 'd');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLights();
        System.out.println("lights = " + lights);

        System.out.println();
        System.out.println("car.gear = " + car.gear);
        System.out.println();

        car.carSpeed(100, 80);
        System.out.println();
        car.carSpeed(110, 120, 150);
    }
}
