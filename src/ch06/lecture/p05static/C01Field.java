package ch06.lecture.p05static;

public class C01Field {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        MyClass01 o2 = new MyClass01();
        o1.age = 30;
        o2.age = 40;
        System.out.println(o1.age);
        System.out.println(o2.age);

        // 정적 필드는 인스턴스 없이 가능
        MyClass01.number = 50;
        System.out.println(MyClass01.number);
    }
}

class MyClass01 {
    int age; // instance field

    // static field(class field, 정적 필드)
    static int number;
}
