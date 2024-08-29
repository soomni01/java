package ch07.lecture.p03polymorphism;

public class C04Polymorphism {
    public static void main(String[] args) {
        Child041 c41 = new Child041();
        c41.method1();
        c41.method41();

        Child042 c42 = new Child042();
        c42.method1();
        c42.method42();

        Parent04 p4 = c41;
        Parent04 p5 = c42;

        p4.method1();
//        p4.method41(); // 실행못함

        p5.method1();
//        p5.method42(); // 실행못함
    }
}

class Parent04 {
    public void method1() {
        System.out.println("Parent04.method1");
    }
}

class Child041 extends Parent04 {
    // method1

    public void method41() {
        System.out.println("Child041.method41");
    }
}

class Child042 extends Parent04 {
    // method1

    public void method42() {
        System.out.println("Child042.method42");
    }
}
