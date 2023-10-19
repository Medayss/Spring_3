package week04.sample01;

// 예외 클래스를 만들어서 예외를 정의
public class OurBadException extends Exception {
    public OurBadException(){
        super("위험한 행동 시 예외처리 할 것");
    }
}
