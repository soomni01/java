package ch02.lecture.p06scanner;

import java.util.Scanner;

public class C07Scanner {
    public static void main(String[] args) {
        // 두 실수를 띄어서 입력 받은 후 더한 값 출력
        // nextDouble
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 수 띄어서 입력>");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();

        System.out.println("더한 결과>" + (n1 + n2));
    }
}
