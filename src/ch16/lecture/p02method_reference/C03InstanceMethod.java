package ch16.lecture.p02method_reference;

public class C03InstanceMethod {
    public static void main(String[] args) {
        MyClass3 o = new MyClass3();

        // instance method 호출
        //  객체명::메소드명

        MyInterface31 a = x -> o.action1(x);
        MyInterface31 b = o::action1;

        MyInterface32 c = (s, t) -> o.action2(s, t);
        MyInterface32 d = o::action2;
    }
}

class MyClass3 {
    void action1(int x) {
        System.out.println(x);
    }

    void action2(String s, String t) {
        System.out.println(s + t);
    }
}

interface MyInterface32 {
    void some(String s, String t);
}

interface MyInterface31 {
    void method1(int x);
}