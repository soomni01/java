package ch07.lecture.p04cast;

public class C05Instanceof {
    public static void main(String[] args) {
        A a = new B();

        if (a instanceof B) {
            B b = (B) a;
            // B의 메소드 실행...
        }

        if (a instanceof B b) {
            // B의 메소드 실행...
        }


        if (a instanceof C) {
            C c = (C) a;
            // C의 메소드 실행 코드들...
        }

        if (a instanceof C c) {
            // C의 메소드 실행 코드들...
        }
    }
}
