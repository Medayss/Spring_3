package week04.sample01;

public class OurClass {
    private final boolean just = true;

    // throws : 예외를 던지다 / 발생시키다
    public void thisMethodIsDangerous () throws OurBadException {                       // 이 로직이 위험하다면 메소드(thisMethodIsDangerous) 뒤에 throws OurBadException 를 달아줘서 flag를 달아놓는다
        // custom logic
        if (just) {                                                                     // just가 true 이기에 항상 들어온다
            throw new OurBadException();                                                // 새로운 OurBadException 을 만들어서 던진다, 발생시킨다.
        }
    }
}
