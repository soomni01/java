package ch05.lecture.p04string;

public class C05Length {
    public static void main(String[] args) {
        // length : 문자열의 길이 리턴
        String a = ""; // 0
        String b = " "; // 1
        String c = "a"; // 1
        String d = "abc"; // 3
        String e = "ab"; // 4
        String f = "a b c"; // 5

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());
        System.out.println(d.length());
        System.out.println(e.length());
        System.out.println(f.length());
    }
}
