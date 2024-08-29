package ch07.lecture.p04cast;

public class C03Instanceof {
    public static void main(String[] args) {
        Parent3 a = new Child31();

        // true
        if (a instanceof Child31) {
            Child31 b = (Child31) a; // ok
        }

        // false
        if (a instanceof Child32) {
            Child32 c = (Child32) a; // not ok
        }
        System.out.println("다음 코드");
    }
}

// @formatter:off
class Parent3 {}
class Child31 extends Parent3 {}
class Child32 extends Parent3 {}