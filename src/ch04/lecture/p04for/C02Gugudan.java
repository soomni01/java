package ch04.lecture.p04for;

import java.util.Scanner;

public class C02Gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();

        if (2 <= dan && dan <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(STR."\{dan} X \{i} = \{dan * i}");
            }
        } else {
            System.out.println("잘 못 입력하였습니다.");
        }
    }
}
