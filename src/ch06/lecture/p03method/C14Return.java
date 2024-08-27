package ch06.lecture.p03method;

public class C14Return {
    public static void main(String[] args) {

    }
}

// return
// 1. 메소드 종료
// 2. 오른쪽 값 반환
class MyClass14 {
    public int method1() {
        boolean a = true;
        if (a) {
            return 3;
        }
        System.out.println("실행문...");
        return 5;
    }

    public void method2() {
        // return : 1. 메소드 종료

        boolean a = true;
        if (a) {
            return;
        }
        System.out.println("어떤 실행문..");
    }
}
