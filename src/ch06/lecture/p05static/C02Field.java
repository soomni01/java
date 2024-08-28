package ch06.lecture.p05static;

public class C02Field {
    public static void main(String[] args) {
        MyClass02.age = 60;
        MyClass02.name = "son";

        System.out.println("MyClass02.age = " + MyClass02.age);
        System.out.println("MyClass02.name = " + MyClass02.name);

        System.out.println(System.err);
        System.out.println(System.in);
    }
}

class MyClass02 {
    static int age;
    static String name;
}
