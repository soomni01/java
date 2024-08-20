package ch03.lecture.p04logical;

import java.util.Scanner;

public class C03Or {
    public static void main(String[] args) {
        // 2의 배수 또는 5의 배수
        Scanner scanner = new Scanner(System.in);
        System.out.print("수>");
        int num = scanner.nextInt();

        boolean result = (num % 2 == 0) || (num % 5 == 0);
        if (result) {
            System.out.println("2 또는 5의 배수입니다.");
        } else {
            System.out.println("2 또는 5의 배수가 아닙니다.");
        }
    }
}
