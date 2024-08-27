package ch06.lecture.p03method;

public class C11Return {
    public static void main(String[] args) {
        
    }
}

class MyClass11 {
    public void method1() {

    }

    // 메소드에 return type이 있는 경우
    // 꼭 코드 실행 중 return 문이 실행되도록 해야함
    public int method2() {
        System.out.println("어떤 명령문...");
        boolean a = true;

        if (a) {
            return 3;
        }
        return 4;

    }
}