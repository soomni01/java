package ch04.lecture.p02switch;

public class C03Switch {
    public static void main(String[] args) {
        // 1~6 정수
        int n = (int) (Math.random() * 6) + 1;

        System.out.println("n = " + n);
        switch (n) {
            case 1, 3, 5 -> {
                System.out.println("홀수");
            }
            case 2, 4, 6 -> {
                System.out.println("짝수");
            }

        }
    }
}
