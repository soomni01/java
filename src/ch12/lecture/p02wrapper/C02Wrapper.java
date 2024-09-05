package ch12.lecture.p02wrapper;

public class C02Wrapper {
    public static void main(String[] args) {
        Integer a = 5;

        // 오래전...
        // 직접 unboxing
        int b = a.intValue();

        // 현재
        // auto unboxing
        int c = a;
    }
}
