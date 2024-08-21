package ch04.lecture.p01if;

import java.util.Scanner;

public class C04Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이> ");
        int age = scanner.nextInt();

        if (age >= 20) {
            System.out.println("성인입니다.");
        } else if (age >= 13) {
            System.out.println("청소년입니다.");
        } else if (age >= 6) {
            System.out.println("어린이입니다.");
        } else if (age >= 1) {
            System.out.println("유아입니다.");
        } else {
            System.out.println("나이를 잘못 입력하였습니다.");
        }
    }
}
