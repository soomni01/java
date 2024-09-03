package ch16.lecture.p01lambda;

public class C04FunctionalInterface {
    public static void main(String[] args) {

    }
}

// Functional Interface
@FunctionalInterface
interface MyInterface4 {
    void method1();
}

// x
//@FunctionalInterface>
interface MyInterface42 {

}

// x
//@FunctionalInterface
interface MyInterface43 {
    void method1();

    void method2();
}

// @formatter:off
@FunctionalInterface
interface MyInterface44 {
    void method1(); // 결국 추상 메소드는 한 개이므로 가능
    int MX_VALUE = 100;
    default void method2() {}
    private void method3() {}
    static void method4() {}
    private static void method5() {}
}