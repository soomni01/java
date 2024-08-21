package ch04.lecture.p02switch;

public class C05Default {
    public static void main(String[] args) {
        // 1~10 (정수)
        int n = (int) (Math.random() * 10) + 1;
        System.out.println("n = " + n);

        switch (n) {
            case 5, 10 -> {
                System.out.println("5의 배수 입니다. ");
            }
            case 3, 6, 9 -> {
                System.out.println("3의 배수 입니다.");
            }
            default -> {
                System.out.println("그 외의 수들");
            }
        }
    }
}
