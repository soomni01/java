package ch07.lecture.p01inheritance;

public class C01Inheritance {
    public static void main(String[] args) {
        SubMyClass02 o = new SubMyClass02();
        o.age = 33;
        o.method1();
    }
}

// 상위클래스, 부모클래스, 슈퍼클래스
class SuperMyClass01 {
    int age;

    void method1() {
        System.out.println("MyClass01.method1");
    }
}

// 하위클래스, 자식클래스, 서브클래스
class SubMyClass02 extends SuperMyClass01 {
    // age, method1
}
