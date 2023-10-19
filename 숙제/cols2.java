//package 숙제;
//
//import java.util.*;
//
//public class cols2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // 저장할 자료구조
//        String colName = sc.next();
//
//        // 요리 제목
//        String name = sc.nextLine();
//
//        // 요리 레시피
//        String turn = sc.nextLine();
//        switch (colName) {
//            case "List":
//                ArrayList<String> arrayList = new ArrayList<>();
//                while (true) {
//                    String text = sc.nextLine();                     // 레시피 순서 입력
//                    if (Objects.equals(text, "끝")) {             // Objects.equals (text에 끝 이라는 문자열이 입력되면 실행)
//                        break;                                       // 레시피를 다 입력하면 "끝" 을 입력하여 ArrayList로 생성되는 1. 2. 3. 을 if를 이용하여 탈출 (이게 없으면 탈출하지 못함 사실상 무한루프)
//                    }
//                    arrayList.add(text);                             // arrayList 배열 생성, 생성해서 들어가는 내용은 sc.nextLine(); 으로 입력하는 방식
//                }
//                // 저장한 자료구조와 요리이름 출력
//                name = ("[ List로 저장된 " + name + " ]");
//                System.out.println(name);
//
//                // 입력한 문장 앞에 번호붙이기
//                for (int i = 0; i < arrayList.size() ; i++) {               // i가 배열(arrayList 크기(레시피를 입력한 만큼))보다 작은동안 실행
//                    int number = i+1;                                       // 0. ~~~ 이 나오면 안되니 i뒤에 +1을 함으로써 1. 2. 3. .... 진행됨
//                    System.out.println(number + "." + arrayList.get(i));
//                }
//                break;                                                      // case Map, Set으로 진행되면 안되니 탈출을 위해 break를 사용
//
//            case "Set":
//                LinkedHashSet<String> hashSet = new LinkedHashSet<>();
//
//                while (true) {
//                    String text = sc.nextLine();                     // 레시피 순서 입력
//                    if (Objects.equals(text, "끝")) {             // Objects.equals (text에 끝 이라는 문자열이 입력되면 실행)
//                        break;                                       // 레시피를 다 입력하면 "끝" 을 입력하여 ArrayList로 생성되는 1. 2. 3. 을 if를 이용하여 탈출 (이게 없으면 탈출하지 못함 사실상 무한루프)
//                    }
//                    hashSet.add(text);                             // arrayList 배열 생성, 생성해서 들어가는 내용은 sc.nextLine(); 으로 입력하는 방식
//                }
//                // 저장한 자료구조와 요리이름 출력
//                name = ("[ Set으로 저장된 " + name + " ]");
//                System.out.println(name);
//
//                Iterator iterator = hashSet.iterator();
//
//                // 입력한 문장 앞에 번호붙이기
//                for (int i = 0; i < hashSet.size() ; i++) {               // i가 배열(arrayList 크기(레시피를 입력한 만큼))보다 작은동안 실행
//                    int number = i+1;                                       // 0. ~~~ 이 나오면 안되니 i뒤에 +1을 함으로써 1. 2. 3. .... 진행됨
//                    System.out.println(number + "." + iterator.next());
//                }
//                break;
//
//            case "Map":
//                Map<>
//                while (true) {
//                    String text = sc.nextLine();                     // 레시피 순서 입력
//                    if (Objects.equals(text, "끝")) {             // Objects.equals (text에 끝 이라는 문자열이 입력되면 실행)
//                        break;                                       // 레시피를 다 입력하면 "끝" 을 입력하여 ArrayList로 생성되는 1. 2. 3. 을 if를 이용하여 탈출 (이게 없으면 탈출하지 못함 사실상 무한루프)
//                    }
//                    hashSet.add(text);                             // arrayList 배열 생성, 생성해서 들어가는 내용은 sc.nextLine(); 으로 입력하는 방식
//                }
//                // 저장한 자료구조와 요리이름 출력
//                name = ("[ Set으로 저장된 " + name + " ]");
//                System.out.println(name);
//
//                Iterator iterator = hashSet.iterator();
//
//                // 입력한 문장 앞에 번호붙이기
//                for (int i = 0; i < hashSet.size() ; i++) {               // i가 배열(arrayList 크기(레시피를 입력한 만큼))보다 작은동안 실행
//                    int number = i+1;                                       // 0. ~~~ 이 나오면 안되니 i뒤에 +1을 함으로써 1. 2. 3. .... 진행됨
//                    System.out.println(number + "." + iterator.next());
//                }
//                break;
//            default:
//                System.out.println("저장할 수 없는 자료구조입니다.");
//        }
//    }
//}
