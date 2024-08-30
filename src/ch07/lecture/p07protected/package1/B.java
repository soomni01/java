package ch07.lecture.p07protected.package1;

public class B {
    public void someMethod() {
        A a = new A();
        a.publicMethod();
        a.protectedMethod();
        a.packagePrivateMethod();
    }
}
