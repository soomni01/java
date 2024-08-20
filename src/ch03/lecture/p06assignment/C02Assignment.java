package ch03.lecture.p06assignment;

public class C02Assignment {
    public static void main(String[] args) {
        // = : 오른쪽 값 왼쪽 변수에 대입
        // += : (왼쪽값과 오른쪽 값을 더해서) 왼쪽 변수에 대입
        // -= : (왼쪽 값에서 오른쪽값을 빼서) 왼쪽 변수에 대입
        // *= : (왼쪽 값과 오른쪽값을 곱해서) 왼쪽 변수에 대입
        // /= : (왼쪽 값에서 오른쪽값을 나눠서) 왼쪽 변수에 대입
        // %= : (왼쪽 값에서 오른쪽값을 나눈 나머지를) 왼쪽 변수에 대입

        int a = 10;
        int b = 3;

        a += b; // a = a + b
        System.out.println("a = " + a);

        int c = 10;
        int d = 3;
        c -= d; // c = c - d
        System.out.println("c = " + c);

        int e = 10;
        int f = 3;
        e *= f; // e = e * f
        System.out.println("e = " + e);


        int g = 10;
        int h = 3;
        g /= h; // g = g / h
        System.out.println("g = " + g);

        int i = 10;
        int j = 3;
        i %= j; // i = i % j
        System.out.println("i = " + i);


    }
}