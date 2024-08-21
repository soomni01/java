package ch04.lecture.p02switch;

public class C01Switch {
    public static void main(String[] args) {
        // Switch (조건문, 분기문)

        // 1, 2, 3
        int n = (int) (Math.random() * 3) + 1;

        // byte, short, char, int, String, enum
        switch (n) {
            case 1 -> {
                System.out.println("첫번째 수 출력");
            }
            case 2 -> {
                System.out.println("두번째 수 출력");
            }
            case 3 -> {
                System.out.println("세번째 수 출력");
            }
        }
    }
}
