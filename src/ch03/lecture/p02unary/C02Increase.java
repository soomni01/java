package ch03.lecture.p02unary;

public class C02Increase {
    public static void main(String[] args) {
        // 증가연산자
        // ++
        // 피연산자의 값에 1 더한 후 피연산자에 다시 할당
        int a = 1;
        ++a;

        System.out.println("a = " + a);

        ++a;

        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);
    }
}
