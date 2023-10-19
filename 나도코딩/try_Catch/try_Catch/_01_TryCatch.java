package 나도코딩.try_Catch.try_Catch;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류 (런타임 오류에는 에러, 예외가 있음)

        try {
//            System.out.println(3 / 0);
            int[] arr = new int[3];
            arr[5] = 100;
        } catch (Exception e) {
            System.out.println("이런 문제가 발생 => " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}