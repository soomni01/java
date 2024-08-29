package ch07.lecture.p04cast;

public class C02Cast {
    public static void main(String[] args) {
        Parent2 p = new Child21();
        Child21 c = (Child21) p; // 문제 없이 성공

        Parent2 q = new Child22();
        // 강제형변환
        // 프로그램 종료될 수 있음
        Child21 d = (Child21) q;

        System.out.println("프로그램 종료");
    }
}

// formatter:off
class Parent2 {
}

class Child21 extends Parent2 {
}

class Child22 extends Parent2 {
}
