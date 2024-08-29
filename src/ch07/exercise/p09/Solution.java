package ch07.exericse.p09;

public class Solution {
    public static void main(String[] args) {
//        B b = new B();
//        B b = (B) new A(); // x
//        B b = new D();
        B b = new E();

//        method(new B());
//        method((B) new A()); // x
//        method(new D());
        method(new E());
        System.out.println("다음 코드");
    }

    static void method(B b) {

    }

}

// @formatter:off
class A{}
class B extends A{}
class C extends A{}

class D extends B{}
class E extends B{}

class F extends C{}