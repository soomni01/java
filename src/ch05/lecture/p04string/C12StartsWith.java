package ch05.lecture.p04string;

public class C12StartsWith {
    public static void main(String[] args) {
        String s = "java language";
        int i = s.indexOf("java"); // 0
        if (i == 0) {
            System.out.println("시작 문자열");
        }
        boolean j = s.startsWith("java"); // true
        if (j) {
            System.out.println("시작 문자열");
        }

        int k = s.indexOf("age"); // s.length() - "age".length()
        System.out.println("k = " + k);
        System.out.println(s.length() - "age".length());

        boolean l = s.endsWith("age"); // true
        System.out.println("l = " + l);
    }
}
