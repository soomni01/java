package ch02.lecture.p04conversion;

public class C05TypeConversion {
    public static void main(String[] args) {
        // 연산시 큰 타입으로 자동변환

        int a = 3;
        int b = 5;
        int c = a + b; // ok

        int d = 3;
        long e = 5;
        long f = d + e; // long

        int g = 3;
        long h = 40_0000_0000L;
        long i = g + h;
        System.out.println("i = " + i);

        int j = 9;
        double k = 3.14;
        double l = j + k; // double
        System.out.println("l = " + l);
    }
}
