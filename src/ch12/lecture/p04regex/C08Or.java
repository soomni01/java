package ch12.lecture.p04regex;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

public class C08Or {
    public static void main(String[] args) {
        // | : or

        String p1 = "(a | 가)";
        System.out.println(matches(p1, "a"));
        System.out.println(matches(p1, "가"));
        System.out.println(matches(p1, "a가가a"));

        String p2 = "(ab|가나)+";
        System.out.println(matches(p2, "abab"));
        System.out.println(matches(p2, "ab가나"));
        System.out.println(matches(p2, "가나가나ab"));
        System.out.println(matches(p2, "가a나b")); // false
    }
}
