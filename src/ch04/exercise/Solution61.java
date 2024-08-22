package ch04.exercise;

public class Solution61 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------------");
        for (int i = 4; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("-------------------------");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------------");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("-------------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        int i = 0;

        for (int j = 0; j < 5; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.print(i % 10);
                i++;
            }
            System.out.println();
        }

    }
}
