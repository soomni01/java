package ch14.lecture.p1thread;

import java.awt.*;

public class C03Runnable {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("띠링");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
