package ch05.lecture.p04string;

public class C03String {
    public static void main(String[] args) {
        String a = new String("java");
        String b = "java";
        String c = new String("java");
        String d = "java";

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // 문자열 비교시 == 사용하지 말 것!
        System.out.println(a == b);
        System.out.println(b == d);
        System.out.println(a == c);

        // 문자열 비교시 equals 사용!!
        System.out.println(a.equals(b));
        System.out.println(b.equals(d));
        System.out.println(a.equals(c));
    }
}
