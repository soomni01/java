package ch11.lecture.p01exception;

public class C01NullPointerException {
    public static void main(String[] args) {
        String s = "java";
        System.out.println(s.length()); // ok

        // NullPointerException
        String t = null;
        System.out.println(t.length()); // x

        System.out.println("다음 코드");
    }
}
