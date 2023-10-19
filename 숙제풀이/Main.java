package 숙제풀이;

public class Main {
    public static void main(String[] args) {

        Calculator calculator  = new Calculator(new AddOperation());
        System.out.println(calculator.calculate(20, 20));

        calculator.setOperation(new DivideOperation());
        System.out.println(calculator.calculate(40,20));
    }
}
