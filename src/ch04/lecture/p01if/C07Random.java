package ch04.lecture.p01if;

import java.util.Random;

public class C07Random {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6 중 하나의 숫자 출력
        int num = (int) (Math.random() * 6) + 1;
        System.out.println("num = " + num);

        // Random 클래스 사용
        Random random = new Random();
        int j = random.nextInt(6) + 1;
        System.out.println("j = " + j);
    }
}
