package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
    private D d;

    public D() {
        super();
    }

    public void method1() {
        this.field = "value";
        this.method();
    }

    // 직접 객체 생성해서 사용하는 것은 안됨
    public void method2() {
//        A a = new A(); // x
//        a.field = "value"; // x
//        a.method(); // x
    }
}
