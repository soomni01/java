package ch03.lecture.p04logical;

public class C04ShortCircuit {
    public static void main(String[] args) {
        // short-circuiting
        // 논리연산(&&. ||)시
        // 왼쪽 피연산자에 의해 결과가 예측될 시
        // 오른 피연산자를 연산하지 않음
        
        boolean a = false && false;

        int b = 5;
        int c = 5;
        boolean d = ((b++) < 0) && ((c++) < 0);

        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int e = 5;
        int f = 5;
        boolean g = (e++) < 0 & (f++) < 0;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
