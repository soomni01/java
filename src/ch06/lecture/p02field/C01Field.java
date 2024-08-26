package ch06.lecture.p02field;

public class C01Field {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        MyClass01 b = new MyClass01();
        // 객체명.필드명
        System.out.println("a.age = " + a.age); // 5
        System.out.println("b.age = " + b.age); // 5

        System.out.println("a.name = " + a.name); // 모니터
        System.out.println("b.name = " + b.name); // 모니터

        a.age = 55;
        System.out.println("a.age = " + a.age); // 55
        System.out.println("b.age = " + b.age); // 5

        b.name = "키보드";
        System.out.println("a.name = " + a.name); // 모니터
        System.out.println("b.name = " + b.name); // 키보드
    }
}

class MyClass01 {
    // field : 각 객체(인스턴스)가 가질 수 있는 값 목록
    int age = 5;
    String name = "모니터";

}
