package ch08.lecture.p02etc;

public class C04PrivateMethod {
}

interface MyInterface4 {
    default void method1() {
        System.out.println("어떤 코드1");
        extracted();
    }

    default void method2() {
        extracted();
        System.out.println("어떤 코드4");
    }


    private void extracted() {
        System.out.println("어떤 코드2");
        System.out.println("어떤 코드3");
    }
}