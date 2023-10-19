package 나도코딩.try_Catch.ArryList;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (List, Set, Map)
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("철수");
        list.add("민지");
        list.add("호동");
        list.add("만두");
        list.add("갈비");

        // 데이터 조회 (인덱스 기준으로 조회)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("--------------------");

        list.remove(3); // 데이터 삭제 (인덱스 번호를 작성해도 되고, "만두" 라고 작성해도 됨)
        System.out.println(list);
        list.remove(list.size() - 1); // 데이터 삭제 (list.size() - 1 을 넣으면 list에 있는 데이터 중 마지막(3번 자리에 있는 갈비)이 삭제됨
        System.out.println(list);
        list.set(2, "냉면");  // 데이터 수정 (호동 -> 냉면)
        System.out.println(list);
        System.out.println(list.get(2));

        // 순회 (for each)
        for (String s :         // 타입과 변수명
                list) {         // 조회 할 변수
            System.out.println(s);      // 실행 시킬 로직
        }
    }
}
