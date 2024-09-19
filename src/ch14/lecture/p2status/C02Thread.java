package ch14.lecture.p2status;

public class C02Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("쓰레드1");
            }
        });
        t1.start();

        t1.join(); //t1 쓰레드가 끝나고
        for (int i = 0; i < 100; i++) {
            System.out.println("메인쓰레드");
        }
    }
}
