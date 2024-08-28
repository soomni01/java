package ch06.lecture.p06final;

public class C02Final {
    public static void main(String[] args) {
        method1(80);
        method2(88);
    }

    static void method1(int a) {
        System.out.println(a);
        a = 90;
        System.out.println(a);
    }

    static void method2(final int a) {
        System.out.println(a);
//        a = 99; // 불가
        System.out.println(a);
    }
}