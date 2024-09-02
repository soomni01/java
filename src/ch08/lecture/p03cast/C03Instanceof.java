package ch08.lecture.p03cast;

public class C03Instanceof {
    public static void main(String[] args) {
        MyInterface3 o = new Child3();
        System.out.println(o instanceof Child3); // true
        System.out.println(o instanceof Parent3); // true
        System.out.println(o instanceof MyInterface3); // true

        MyInterface3 p = new Parent3();
        System.out.println(p instanceof Child3); // false
        System.out.println(p instanceof Parent3); // true
        System.out.println(p instanceof MyInterface3); // true
    }
}

// @formatter:off
interface  MyInterface3 {}
class Parent3 implements MyInterface3 {}
class Child3 extends Parent3 {}
