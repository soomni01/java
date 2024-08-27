package ch06.lecture.p03method;

public class C12Return {
    public static void main(String[] args) {
        MyClass12 a = new MyClass12();
        int b = a.method1();
        System.out.println("b = " + b);

        System.out.println(a.method1() * 10);

        int c = a.method1() * 100;
        System.out.println("c = " + c);
    }
}

class MyClass12 {
    public int method1() {
        return 3;
    }
}