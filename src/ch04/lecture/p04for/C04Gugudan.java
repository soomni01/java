package ch04.lecture.p04for;

public class C04Gugudan {
    public static void main(String[] args) {
        // 홀수단만 출력
        // 3, 5, 7, 9
        for (int j = 3; j <= 9; j += 2) {
            System.out.println(STR."\{j}단 **************");
            for (int i = 1; i <= 9; i++) {
                System.out.println(STR."\{j} X \{i}  = \{j * i}");
            }
        }
    }
}
