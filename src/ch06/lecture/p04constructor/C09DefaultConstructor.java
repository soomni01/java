package ch06.lecture.p04constructor;

public class C09DefaultConstructor {
    public static void main(String[] args) {
        MyClass091 o1 = new MyClass091();
        MyClass092 o2 = new MyClass092();
    }
}

class MyClass091 {
    // 생성자를 작성하지 않으면
    // 파라미터 없는 생성자(no-args constructor, 기본생성자)가 자동으롲 작성됨
    MyClass091() {

    }
}

class MyClass092 {
    // 파라미터 있는 생성자 작성시
    // 기본생성자 자동으로 추가되지 않음
    MyClass092(int a) {

    }

    // 파라미터 없는 생성자 필요시
    // 작성해야함
    MyClass092() {

    }
}
