package ch12.lecture.p04regex;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

public class C04Regex {
    public static void main(String[] args) {
        // \\ : \
        String p1 = "\\\\";
        System.out.println(matches(p1, "\\")); // true

        // . : 모든 문자
        String p2 = ".";
        System.out.println(matches(p2, "a")); // true
        System.out.println(matches(p2, "가")); // true
        System.out.println(matches(p2, "0")); // true

        String p3 = "..";
        System.out.println(matches(p3, "ab")); // true
        System.out.println(matches(p3, "가나")); // true
        System.out.println(matches(p3, "a가")); // true

        // \. : .
        String p4 = "\\.";
        System.out.println(matches(p4, ".")); // true
        System.out.println(matches(p4, "3")); // false
    }
}
