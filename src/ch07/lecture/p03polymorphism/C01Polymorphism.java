package ch07.lecture.p03polymorphism;

public class C01Polymorphism {
    public static void main(String[] args) {
        Child011 o1 = new Child011();
        Parent01 o2 = o1; // ok

        Parent01 o3 = new Child011(); // ok
        Parent01 o4 = new Child012(); // ok
    }
}

class Parent01 {

}

class Child011 extends Parent01 {

}

class Child012 extends Parent01 {

}
