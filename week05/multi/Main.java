package week05.multi;

public class Main {
    public static void main(String[] args) {

        // 1st
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };

        // 2nd
        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };


        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task2);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
        // thread1이 실행하고 thread2가 실행되는게 아닌 2개의 쓰레드가 랜덤으로 실행된다.

    }
}