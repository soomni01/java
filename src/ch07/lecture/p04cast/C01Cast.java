package ch07.lecture.p04cast;

public class C01Cast {
    public static void main(String[] args) {
        Parent1 o = new Child11(); // 자동형변환
        Child12 p = new Child12();
        Parent1 q = p; // 자동형변환

        Child11 r = (Child11) o; // 안됨 -> 강제 형변환(cast)
        Child12 s = (Child12) q; // 안됨 -> 강제 형변환(casting)

        System.out.println("프로그램 종료");
    }
}

// @formatter:off
class Parent1 {}
class Child11 extends Parent1 {}
class Child12 extends Parent1 {}

// @formatter:on

