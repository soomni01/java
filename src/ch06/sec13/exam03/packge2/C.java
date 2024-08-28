package ch06.sec13.exam03.packge2; // 패키지가 다름

import ch06.sec13.exam03.packge1.A;

public class C {
    public C() {
        // 객체 생성
        A a = new A();

        // 필드값 변경
        a.field1 = 1;
//        a.field2 = 1; // x
//        a.field3 = 1; // x

        // 메소드 호출
        a.method1();
//        a.method2(); // x
//        a.method3(); // x
    }
}
