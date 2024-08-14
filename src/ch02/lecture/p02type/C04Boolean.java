package ch02.lecture.p02type;

public class C04Boolean {
    public static void main(String[] args) {
        // boolean (1byte)
        // true, false
        boolean a = true;
        boolean b = false;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        if (a) {
            System.out.println("참일 때 실행1");
        } else {
            System.out.println("거짓일 때 실행1");
        }

        if (b) {
            System.out.println("참일 때 실행2");
        } else {
            System.out.println("거짓일 때 실행2");
        }
    }
}
