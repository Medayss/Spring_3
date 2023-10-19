package 나도코딩.try_Catch.try_Catch;

import java.io.FileWriter;
import java.io.IOException;

public class _03_Throws {
    public static void main(String[] args) {
        try {
            WriteFile();
        } catch (IOException e) {
            System.out.println("메인 메소드에서 해결");
        }
    }

    public static void WriteFile() throws IOException {         // 메소드를 실행한 곳으로 에러를 던진다.
//        try {
//            FileWriter writer = new FileWriter("test.txt");
//            throw new IOException("파일쓰기 실패");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메소드 내에서 자체 해결");
//        }

        FileWriter writer = new FileWriter("test.txt");  // 문제 발생 15줄로 던지기
        throw new IOException("파일쓰기 실패");
    }
}
