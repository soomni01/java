package ch08.lecture.p01interface;

public class C04Polymorphism {
    public static void main(String[] args) {
        method1(new MyClass41());
        method1(new MyClass42());
    }

    public static void method1(MyInterface4 param) {
        param.someMethod();
    }
}

interface MyInterface4 {
    void someMethod();
}

class MyClass41 implements MyInterface4 {
    @Override
    public void someMethod() {
        System.out.println("MyClass41.someMethod");
    }
}

class MyClass42 implements MyInterface4 {
    @Override
    public void someMethod() {
        System.out.println("MyClass42.someMethod");
    }
}