package ch07.lecture.p05abstract;

public class C02AbstractMethod {
    public static void main(String[] args) {
        Mammal2 a = new Bear2();
        Mammal2 b = new Horse2();
        a.walk();
        b.walk();
    }
}

// abstract method(추상 메소드)
//  : 코드 블럭이 없는 메소드

// 추상 메소드를 가진 클래스는 꼭 추상 클래스
abstract class Mammal2 {
    abstract public void walk();
}

class Bear2 extends Mammal2 {
    // 상위 클래스의 추상메소드를 재정의 하지 않으면 컴파일 오류!
    @Override
    public void walk() {
        System.out.println("곰이 걷는다.");
    }
}

class Horse2 extends Mammal2 {
    @Override
    public void walk() {
        System.out.println("말이 걷는다.");
    }
}