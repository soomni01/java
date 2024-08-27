package ch06.lecture.p03method;

public class C05Parameter {
    public static void main(String[] args) {
        MyClass05 a = new MyClass05();
        a.method2(5);
        a.method2(10);
        a.method2(99); // 99 argument(인수), parameter

        int b = 999;
        a.method2(b);

        a.method3(33, "흥민");
        a.method3(44, "홀란드");

        a.method3(33, "흥민");
    }
}

class MyClass05 {
    // () : 파라미터(parameter, 인자, 매개변수) 목록
    // argument(인수)
    // 타입 파라미터명, 타입 파라미터명, ....
    public void method1(int age, String myName, int[] scores, String[] studentNames) {
        // 변수 선언, 값 대입, 제어문, 연산식...
    }

    public void method2(int age) {
        System.out.println("실행 코드들...");
        System.out.println("age = " + age);
    }

    public void method3(int age, String name) {
        System.out.println(STR."\{age}세 \{name}님");
    }
}
