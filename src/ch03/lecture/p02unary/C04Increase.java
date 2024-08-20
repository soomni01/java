package ch03.lecture.p02unary;

public class C04Increase {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println("a = " + a); // 11

        int c = a++;
        System.out.println("c = " + c); // 11
        System.out.println("a = " + a); // 12

        int d = ++a;
        System.out.println("d = " + d); // 13
        System.out.println("a = " + a); // 13

        // 위 코드는 읽기 어려우니 사용 하지 말 것
        int e = 11;
        int f = e;
        e++;
        System.out.println("f = " + f);
        System.out.println("e = " + e);

        e++;
        int g = e;
        System.out.println("g = " + g);
        System.out.println("e = " + e);
    }
}
