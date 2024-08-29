package ch07.lecture.p02override;

import ch06.sec13.exam03.packge2.C;

public class C03Super {
    public static void main(String[] args) {
        Child03 c = new Child03();
        c.method1();
    }
}

class Parent03 {
    public void method1() {
        System.out.println("매우 기~~~~~인 코드들...");
    }
}

class Child03 extends Parent03 {
    @Override
    public void method1() {
        // 상위 클래스 멤버 접근할 수 있는 키워드
        super.method1();
        System.out.println("또 다른 코드들");
    }
}
