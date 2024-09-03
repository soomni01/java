package ch16.lecture.p02method_reference;

public class C04InstanceMethod {
    public static void main(String[] args) {
        //  1.2. : 파라미터 순서가 같을 때


        //   3. 특정 타입의 인스턴스 메소드
        //      타입명::메소드명
        //    : 첫번째 파라미터의 인스턴스 메소드 호출 시
        //       두번째 파라미터가 같은 순서로 사용되면....

        MyInterface4 o = (a, b) -> a.action(b);
        MyInterface4 p = MyClass4::action;
    }
}

class MyClass4 {
    void action(int a) {
        System.out.println(a);
    }
}

interface MyInterface4 {
    void some(MyClass4 o, int x);
}