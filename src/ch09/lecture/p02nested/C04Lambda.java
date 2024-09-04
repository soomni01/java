package ch09.lecture.p02nested;

public class C04Lambda {
    public static void main(String[] args) {
        // lambda : 익명클래스 정의와 객체 생성을 한 번에...
        // @formatter:off
        MyInterface4 o = () -> System.out.println("람다");
        // @formatter:on
        o.some();

        class Nested4 implements MyInterface4 {
            @Override
            public void some() {
                System.out.println("Nested4.some");
            }
        }

        Nested4 a = new Nested4();
        a.some();

    }
}

@FunctionalInterface
interface MyInterface4 {
    void some();
}
