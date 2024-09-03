package ch16.lecture.p01lambda;

public class C02Anonymous {
    public static void main(String[] args) {
        MyInterface2 o = new MyInterface2() {
            @Override
            public void someAction() {
                System.out.println("추상메소드 재정의");
            }
        };
        o.someAction();

        MyInterface2 p =
                () -> {
                    System.out.println("오버라이드 추상 메소드");
                };
        p.someAction();
    }
}

interface MyInterface2 {
    void someAction();
}
