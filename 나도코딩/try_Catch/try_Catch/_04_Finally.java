package 나도코딩.try_Catch.try_Catch;

public class _04_Finally {
    public static void main(String[] args) {
        try {
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");
//            System.out.println("택시에 탑승한다.");
        } catch (Exception e) {
            System.out.println("문제 발생 : " + e.getMessage());
        } finally {
            System.out.println("택시의 문을 닫는다");
        }
    }
}
