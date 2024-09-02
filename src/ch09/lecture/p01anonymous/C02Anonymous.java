package ch09.lecture.p01anonymous;

public class C02Anonymous {
    public static void main(String[] args) {
        // 자식클래스 구현 + 인스턴스 생성
        Parent2 p = new Parent2() {
            // 필드, 메소드

            @Override
            public void someAction() {
                System.out.println("재정의된 메소드");
            }
        };

        p.someAction();
    }
}

abstract class Parent2 {
    abstract public void someAction();
}


