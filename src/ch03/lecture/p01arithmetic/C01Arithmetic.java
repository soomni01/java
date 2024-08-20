package ch03.lecture.p01arithmetic;

public class C01Arithmetic {
    public static void main(String[] args) {
        // 산술연산자
        // +, -, *, /, %

        System.out.println(3 + 5); // 8
        System.out.println(5 - 3); // 2
        System.out.println(5 * 4); // 20
        System.out.println(8 / 2); // 4

        // 3.5(x) 3(o), integer끼리 연산결과는 integer
        System.out.println(7 / 2); // 3

        // % : 나머지 연산(remainder, modulus)
        System.out.println(7 % 2); // 1
        System.out.println(8 % 3); // 2
        System.out.println(10 % 5); // 0

        int a = 10;
        int b = 3;

        System.out.println(a % b); //

        int c = a % b;
        System.out.println("c = " + c);
    }
}
