package ch03.lecture.p01arithmetic;

public class C06Double {
    public static void main(String[] args) {
        // Infinity : 양의 무한대
        // -Infinity : 음의 무한대

        // 정수 연산시 0으로 나눌 수 없음
//        System.out.println(3 / 0); // 오류!

        // 실수 연산시 0으로 나누면 Infinity
        System.out.println(3.0 / 0.0);
        System.out.println(-3.0 / 0.0);

        double a = 3.0 / 0; // Infinity
        System.out.println("a = " + a);
        a = a + 1000000000000L;
        System.out.println("a = " + a);

        // NaN (Not A Number)
        System.out.println(3.0 % 0); // NaN

        double b = 3.0 % 0;
        b = b * 1;
        System.out.println("b = " + b);

        // Infinity 인지 확인
        System.out.println(Double.isInfinite(a)); // true
        System.out.println(Double.isInfinite(3.0)); // false

        // NaN 인지 확인
        System.out.println(Double.isNaN(b)); // true
        System.out.println(Double.isNaN(3.0)); // false

        //Finity 인지
        System.out.println(Double.isFinite(a)); // false
        System.out.println(Double.isFinite(b)); // false
        System.out.println(Double.isFinite(3.0)); //true

        // -0.0
        double c = 0.0;
        double d = -0.0;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println(3 / c); // Infinity
        System.out.println(3 / d); // -Infinity
    }
}
