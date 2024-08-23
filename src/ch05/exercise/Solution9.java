package ch05.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int student = 0;
        int[] scores = new int[0];

        while (run) {
            System.out.print("""
                    -----------------------------------------------------
                    1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료
                    -----------------------------------------------------
                    """);
            System.out.print("선택> ");

            int menu = scanner.nextInt();

            switch (menu) {
                case 1 -> {
                    System.out.print("학생수> ");
                    student = scanner.nextInt();
                    scores = new int[student];
                }
                case 2 -> {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "]> ");
                        scores[i] = scanner.nextInt();
                    }
                }
                case 3 -> {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "]: " + scores[i]);
                    }
                }
                case 4 -> {
                    double sum = 0.0;
                    Arrays.sort(scores);
                    for (int i = 0; i < scores.length; i++) {
                        sum += scores[i];
                    }
                    System.out.println("최고 점수:" + scores[scores.length - 1]);
                    System.out.println("평균 점수:" + sum / student);
                }
                case 5 -> {
                    System.out.print("프로그램 종료");
                    run = false;
                }


            }
        }
    }
}
