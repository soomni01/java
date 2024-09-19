package ch14.lecture.p3synchronized;

public class C01Thread {
    private static int value = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                value++;
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                value++;
            }

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("value = " + value);

        // 여러 쓰레드가
        // 같은 객체의 상태를 바꿀 때 매우 주의해야함!!
        // -> 하지마라!


    }
}