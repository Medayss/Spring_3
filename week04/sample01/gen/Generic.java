package week04.sample01.gen;

// 1. 제네릭은 클래스 또는 메소드에 사용 가능
// <> 안에 들어가야 할 타입을 명시 Generic<String> stringGeneric = new Generic<>(); 밑에 명시함
// public class Generic<T> 꺽쇠 안에 반드시 T일 필요는 없지만 개발자들의 약속이라 T를 보편적으로 사용 / T, U, E 등을 사용
public class Generic<T> {
    // 2. 내부 필드에 String
    private T t;
    // 3. 메서드의 return 타입도 String
    public T get() {
        return this.t;
    }
    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // 4. 메인 부분 / 객체를 만들면서 T 는 String 임을 선언 / 제네릭을 통해서 구현한 클래스를 사용한 부분
        Generic<String> stringGeneric = new Generic<>();
        // 5. 제네릭이 전부 String으로 선언되었기에 메인 바깥부분 T들도 다 "Hellp World" 가 들어감
        stringGeneric.set("Hello World");

        String tValueTurnOutWithString = stringGeneric.get();

        System.out.println(tValueTurnOutWithString);
    }
}
