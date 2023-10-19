package 나도코딩.try_Catch.WrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
        // Wrapper Class
        // int double float char 객체상태로 만들어서 사용하게 해줌

        Integer i = 123;
        Double d = 1.0;
        Character c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("---------------");

        System.out.println(i.doubleValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());

        System.out.println("---------------");

        String s = i.toString();
        System.out.println(s);
    }
}
