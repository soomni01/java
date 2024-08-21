package ch04.lecture.p05break;

public class C01Break {
    public static void main(String[] args) {
        // break; 가장 가까운 반복문(for, while) 종료

        for (int i = 0; i < 5; i++) {
            System.out.println(i);

            if (true) {
                break;
            }
        }
    }
}
