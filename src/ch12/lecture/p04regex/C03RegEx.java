package ch12.lecture.p04regex;

import static java.util.regex.Pattern.*;

public class C03RegEx {
    public static void main(String[] args) {
        // 이미 정의된 클래스
        // \d : [0-9]
        // \w : [a-zA-Z_0-9]
        // \s : 공백문자

        // ※ : 역슬래시는 \\ 로 표현

        String p1 = "\\d\\d\\d";
        System.out.println(matches(p1, "123")); //true
        System.out.println(matches(p1, "22")); // false
        System.out.println(matches(p1, "6789")); // false
        System.out.println(matches(p1, "679")); // true

        String p2 = "\\d\\s\\d";
        System.out.println(matches(p2, "9 1")); // true
        System.out.println(matches(p2, "999")); // false

        String p3 = "\\w\\w\\w";
        System.out.println(matches(p3, "_9a"));
        System.out.println(matches(p3, "abc"));
        System.out.println(matches(p3, "012"));

        // 한글
        String p4 = "[가-힣][가-힣]";
        System.out.println(matches(p4, "흥민")); // true
        System.out.println(matches(p4, "홀란드")); // false
        System.out.println(matches(p4, "강인")); // true
        System.out.println(matches(p4, "ab")); // false

        String p5 = "\\p{IsHangul}";
        System.out.println(matches(p5, "가")); // true
        System.out.println(matches(p5, "손")); // true
        System.out.println(matches(p5, "흥민")); // false
        System.out.println(matches(p5, "a")); // false
        System.out.println(matches(p5, "0")); // false
    }
}