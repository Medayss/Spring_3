package 숙제;

import java.util.*;

public class cols {
    public static void main(String[] args) {

//   **자료구조 요리 레시피 메모장 만들기**
        Scanner sc = new Scanner(System.in);
//        - 입력값
//                - 저장할 자료구조명을 입력합니다. (List / Set / Map)
        String colName = sc.next();
//                - 내가 좋아하는 요리 제목을 먼저 입력합니다.
        String name = sc.nextLine();
//                - 이어서 내가 좋아하는 요리 레시피를 한문장씩 입력합니다.
        switch (colName) {
            case "List":
                ArrayList<String> strList = new ArrayList<>();
                while (true) {
                    // 한 줄씩 입력 받아서 strList에 저장하게끔
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {                    // 끝 이라는 문자를 입력받기 전까지 계속 입력받음
                        break;
                    }
                    strList.add(text);
                }

                name = "[ List로 저장된 " + name + "]"; // 괄호로 감싸준 제목
                System.out.println(name);
                // strList를 한 줄씩 출력
                for (int i = 0; i < strList.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + strList.get(i));
                }
                break;
            case "Map":
                Map<Integer, String> strMap = new HashMap<>();
                int lineNumber = 1;

                while (true) {
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strMap.put(lineNumber++, text);
                }

                name = "[ Map으로 저장된 " + name + "]"; // 괄호로 감싸준 제목
                System.out.println(name);
                for (int i = 0; i < strMap.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + strMap.get(i+1));
                }
                break;
            case "Set":
                LinkedHashSet<String> strSet = new LinkedHashSet<>();                   // HashSet은 레시피가 무작위로 출력되지만 LinkedHashSet은 순서대로 출력됨

                while (true) {
                    // 한 줄씩 입력 받아서 strSet에 저장하게끔
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strSet.add(text);
                }

                name = "[ Set으로 저장된 " + name + "]"; // 괄호로 감싸준 제목
                System.out.println(name);

                Iterator iterator = strSet.iterator();

                // strSet을 한 줄씩 출력
                for (int i = 0; i < strSet.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + iterator.next());
                }
                break;
            default:
                System.out.println("저장할 수 없는 자료구조입니다.");
        }
    }
}
