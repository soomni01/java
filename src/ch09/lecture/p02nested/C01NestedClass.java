package ch09.lecture.p02nested;

public class C01NestedClass {
    public static void main(String[] args) {
        MyClass1 a = new MyClass1();
        MyClass1.Nested1 b = a.new Nested1();
    }
}

class MyClass1 {
    // class
    class Nested1 {
        // 필드
        // 생성자
        // 메소드
    }

    // 필드
    // 생성자
    // 메소드
    void someMethod() {
        Nested1 o = new Nested1();
    }
}
