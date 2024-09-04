package ch09.lecture.p02nested;

public class C03LocalClass {
}

class MyClass3 {
    // 인스턴스 중첩 클래스
    // 스태틱 중첩 클래스

    void someMethod() {
        // 로컬 클래스
        class Nested1 {
            // 필드, 생성자, 메소드
        }

        Nested1 o = new Nested1();
    }
}
