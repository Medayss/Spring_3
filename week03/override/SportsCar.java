package week03.override;

public class SportsCar extends Car{
    String engine;
    public void booster() {
        System.out.println("엔진 " + engine + " 부앙~\n");
    }

    public SportsCar(String engine) {
        this.engine = engine;
    }

    // 애노테이션(annotaion)
    @Override  // 부모한텐 브레이크를 밟으면 속도가 0이 되도록 받았지만 Override를 통해 재정의 함 재정의 하고 싶으면 Override를 사용할 것
    public double brakePedal() {
        speed = 100;
        System.out.println("스포츠카에 브레이크란 없다");
        return speed;
    }

    @Override
    public void horn() {
        booster();
    }
}
