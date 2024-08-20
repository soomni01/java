package ch03.lecture.p03compare;

public class C01Compare {
    public static void main(String[] args) {
        // 비교연산자
        // 같다(==), 같지않다(!=)
        // 크다(>), 크거나 같다(>=)
        // 작다(<), 작거나 같다(<=)

        // 연산결과는 boolean
        int a = 3;
        int b = 5;
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b); // false
        System.out.println(a > b); // false
        System.out.println(a < b); // true
        System.out.println(a <= b); // true
    }
}
