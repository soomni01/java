package ch04.lecture.p04for;

public class C05Gugudan {
    public static void main(String[] args) {
        // 9~2 단으로 역순 출력
        for (int j = 9; j >= 2; j--) {
            System.out.println(STR."\{j}단 **************");
            for (int i = 1; i <= 9; i++) {
                System.out.println(STR."\{j} X \{i}  = \{j * i}");
            }
        }
    }
}
