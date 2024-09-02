package ch08.lecture.p02etc;

public class C03StaticMethod {
    public static void main(String[] args) {
        MyInterface3.someMethod();
    }
}

interface MyInterface3 {
    // public static final field

    // public abstract method

    // public default method
    // : 몸통이 있는 메소드

    // public static method
    // : 몸통(body, cole block)이 있는 static(class) 메소드
    static void someMethod() {
        System.out.println("MyInterface3.someMethod");
    }
}
