package ch06.lecture.p06final;

public class C04InstanceField {
}

class MyClass04 {

    // final instance field(변수)는 생성자에서(또는 직접)초기화해야함

    int a; // 초기값  0
    final int b = 3; // 한번은 무조건 한 번은 할당
    final int c;

    MyClass04() {
        c = 9;
    }

    MyClass04(String a) {
        c = 99;
    }
}