package ch12.lecture.p02wrapper;

import ch08.sec09.InterfaceC;

public class C01Wrapper {
    public static void main(String[] args) {
        int a = 1;
        Integer b = new Integer(3);

        // 기본타입 a가 가진 값을
        // 참조타입 c로 변환 (직접 boxing)
        Integer c = Integer.valueOf(a);

        // 기본타입 a를 참조타입 d로 변환(auto boxing)
        Integer d = a;

        Long e = 5L; // auto boxing
        long f = 5; // 기본 타입이므로 가능

        Double g = 3.14;
        Boolean h = true;

        Object i = 9.1234;
    }
}
