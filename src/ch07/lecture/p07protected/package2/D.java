package ch07.lecture.p07protected.package2;

import ch07.lecture.p07protected.package1.A;

public class D extends A {
    // publicMethod
    // protectedMethod
    // packagePrivateMethod
    public void someMethod() {
        publicMethod(); // ok
        protectedMethod(); // ok
//        packagePrivateMethod(); // x
    }
}
