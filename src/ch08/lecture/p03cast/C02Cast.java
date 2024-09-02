package ch08.lecture.p03cast;

public class C02Cast {
    public static void main(String[] args) {
        MyInterface2 o = new MyClass21();
        if (o instanceof MyClass21) {
            // 만약 o가 가리키는 객체가 MyClass21 타입이면
            MyClass21 a = (MyClass21) o; // ok
        }

        if (o instanceof MyClass22) {
            // 만약 o가 가리키는 객체가 MyClass22 타입이면
            MyClass22 b = (MyClass22) o; // not ok (ClassCastException)
        }
        System.out.println("다음 코드");
    }
}

// @formatter:off
interface MyInterface2 {}
class MyClass21 implements MyInterface2 {}
class MyClass22 implements MyInterface2 {}