package 나도코딩.try_Catch.try_Catch;

public class _02_Throw {
    public static void main(String[] args) {
        int age = 17; // 만 17세
        try {
            if (age < 19) {
//                System.out.println("안팔아");
                throw new Exception("안팔아");
            } else {
                System.out.println("팔게요");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
