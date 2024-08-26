package ch05.lecture.p04string;

public class C06CharAt {
    public static void main(String[] args) {
        String s = "java programming language";
        System.out.println(s.length());
        System.out.println(s.charAt(0)); // j
        System.out.println(s.charAt(1)); // a
        System.out.println(s.charAt((s.length() - 1)));

        char c = s.charAt(5);
        System.out.println(c); // p
    }
}
