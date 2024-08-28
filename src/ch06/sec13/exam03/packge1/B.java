package ch06.sec13.exam03.packge1; // 패키지가 동일

public class B {
    public void method() {
        // 객체 생성
        A a = new A();

        // 필드값 변경
        a.field1 = 1;
        a.field2 = 1;
//        a.field3 = 1; // x

        // 메소드 호출
        a.method1();
        a.method2();
//        a.method3(); // x
    }
}
