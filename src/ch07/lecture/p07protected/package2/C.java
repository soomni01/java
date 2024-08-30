package ch07.lecture.p07protected.package2;

import ch07.lecture.p07protected.package1.A;

public class C {
    public void someMethod() {
        A a = new A();
        a.publicMethod();
//        a.protectedMethod();
//        a.packagePrivateMethod();
    }
}
