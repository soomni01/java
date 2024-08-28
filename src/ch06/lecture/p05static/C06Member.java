package ch06.lecture.p05static;

public class C06Member {
}
// member : field, method, (생성자)

// static member에서 instance member에 접근 불가능
//  instance member는 static member에 접근 가능

class MyClass06 {
    static int number;
    int age;

    static void method1() {
        System.out.println(number); // ol
//        System.out.println(age);// not ok
    }

    void method2() {
        System.out.println(number);
        System.out.println(age);
    }
}
