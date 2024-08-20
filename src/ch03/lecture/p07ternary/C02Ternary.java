package ch03.lecture.p07ternary;

import java.util.Scanner;

public class C02Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이> ");
        int age = scanner.nextInt();

        String message = (age >= 13 && age <= 19) ? "청소년" : "청소년아님";
        System.out.println(message + " 이다.");
    }
}
