package ch12.lecture.p04regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class C02Exercise {
    public static void main(String[] args) {
        // 사용자 입력을 받아서
        // 6개의 숫자로 이루어진 문자열인지 확인하는 코드
        Scanner scanner = new Scanner(System.in);

        String pattern = "[0-9][0-9][0-9][0-9][0-9][0-9]";

        while (true) {
            System.out.print("6개 숫자로 이루어진 문자 입력>");
            String input = scanner.nextLine();

            if (Pattern.matches(pattern, input)) {
                System.out.println("패턴에 일치합니다.");
            } else {
                System.out.println("패턴에 일치하지 않습니다.");
            }
        }

    }
}