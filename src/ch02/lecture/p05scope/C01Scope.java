package ch02.lecture.p05scope;

public class C01Scope {
    public static void main(String[] args) {
        // {} : 코드 블럭
        // 선언된 변수는 코드 블럭 내에서만 사용 가능

        int a = 3;
        System.out.println("a = " + a);

        if (true) {
            int b = 5;
            System.out.println("b = " + b);
            System.out.println("a = " + a);
        }
//        System.out.println("b = " + b); // x

        int c;
        c = 10;
        System.out.println("c = " + c);
        if (true) {
            System.out.println("c = " + c);
        }
        System.out.println("c = " + c);
    }

    public static void method() {
//        System.out.println("a = " + a);
    }
}
