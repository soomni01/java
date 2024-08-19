package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C01Scanner {
    public static void main(String[] args) {
        // Scanner : 입력 소스를 훑으며 입력받음
        Scanner scanner = new Scanner(System.in); //System.in - 키보드 입력

        System.out.print("입력>");
        String str = scanner.nextLine(); // 한 줄 입력받음

        System.out.println("출력>" + str);

    }
}
