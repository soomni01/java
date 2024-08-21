package ch04.lecture.p04for;

public class C03Gugudan {
    public static void main(String[] args) {
        for (int j = 2; j <= 9; j++) {
            System.out.println(STR."\{j}단 **************");
            for (int i = 1; i <= 9; i++) {
                System.out.println(STR."\{j} X \{i}  = \{j * i}");
            }
        }
    }
}
