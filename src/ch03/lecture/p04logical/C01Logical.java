package ch03.lecture.p04logical;

public class C01Logical {
    public static void main(String[] args) {
        // 논리연산자
        // and, or, xor, not

        // and (&&)
        // 두 피연산자가 모두 true 일 때만 결과 true
        // 그외는 false

        System.out.println("and------------");
        System.out.println(true && true); // true
        System.out.println(true && false); // fasle
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // or (||)
        // 두 피연산자가 모두 false 일 때만 결과 false
        // 그 외는 true
        System.out.println("or-------------");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // xor (배타적논리합) (^) (caret)
        // 두 피연산자가 다르면 true, 같으면 false
        System.out.println("xor-------------");
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false

        // not (!)
        // 결과는 피연산자의 반대
        System.out.println("not-------------");
        System.out.println(!true); // false
        System.out.println(!false); //true
    }
}
