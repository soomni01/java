package ch12.lecture.p04regex;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

public class C01RegularExpression {
    public static void main(String[] args) {
        // regular expression (정규표현식)
        // 문자열의 패턴을 나타내는 코드

        // 관련 클래스 : java.util.regex.Pattern
        // matches : 패턴과 일치하는 지 확인하는 메소드

        // 문자 하나
        String p1 = "a";
        String s1 = "a";
        System.out.println(matches(p1, s1)); // true

        System.out.println(matches(p1, "aa")); // false
        System.out.println(matches("aa", "aa")); // true
        System.out.println(matches("aa", "bb")); // false

        // 문자 묶음
        String p2 = "[abc]";
        System.out.println(matches(p2, "a")); // true
        System.out.println(matches(p2, "b")); // true
        System.out.println(matches(p2, "c")); // true
        System.out.println(matches(p2, "abc")); // false

        String p3 = "[abc][abc][abc]";
        System.out.println(matches(p3, "abc")); // true
        System.out.println(matches(p3, "bbb")); // true
        System.out.println(matches(p3, "bca")); // true
        System.out.println(matches(p3, "a")); // false
        System.out.println(matches(p3, "ab")); // false
        System.out.println(matches(p3, "")); // false

        String p4 = "[abcdefghijklmnopqrstuvwxyz][abcdefghijklmnopqrstuvwxyz]";
        System.out.println(matches(p4, "ad")); // true
        System.out.println(matches(p4, "ko")); // true

        String p5 = "[a-z]";
        System.out.println(matches(p5, "a")); // true
        System.out.println(matches(p5, "k")); // true

        String p6 = "[a-z][0-9][0-9]";
        System.out.println(matches(p6, "a01")); // true
        System.out.println(matches(p6, "z98")); // true

        String p7 = "[a-z0-9][0-9][0-9]";
        System.out.println(matches(p7, "007")); // true
        System.out.println(matches(p7, "a89")); // true
        System.out.println(matches(p7, "zz9")); // false

        // 문자 제외
        String p8 = "[^0-9][0-9]";
        System.out.println(matches(p8, "99")); // false
        System.out.println(matches(p8, "a8")); // true
        System.out.println(matches(p8, "*7")); // true


    }
}
