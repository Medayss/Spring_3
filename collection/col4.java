package collection;

import java.util.LinkedList;
import java.util.Queue;

public class col4 {
    public static void main(String[] args) {
        // Queue : FIFO
        // add, peak, poll
        // Queue : 생성자가 없는 인터페이스 <-

        Queue<Integer> intQueu = new LinkedList<>(); // Queue 선언, 생성

        intQueu.add(1);
        intQueu.add(5);
        intQueu.add(9);

        // 인덱스 출력 (isEmpty 를 사용하면 인덱스값이 출력되고 사라짐)
        while (!intQueu.isEmpty()) {
            System.out.println(intQueu.poll());
        }

        // 추가
        intQueu.add(1);
        intQueu.add(5);
        intQueu.add(9);
        intQueu.add(10);

        // peak
        System.out.println(intQueu.peek());
        System.out.println(intQueu.size());
    }
}
