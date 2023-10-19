package week03.abs;

public abstract class Car {
    String company;
    String color;
    double speed;

    public double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }
    public abstract void horn();
}