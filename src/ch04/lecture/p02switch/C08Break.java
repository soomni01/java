package ch04.lecture.p02switch;

public class C08Break {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 3) + 1;
        System.out.println("n = " + n);

        switch (n) {
            case 1:
                System.out.println("첫째");
            case 2:
                System.out.println("둘째");
                break;
            case 3:
                System.out.println("셋째");
                break; // 생략 가능
        }
    }
}
