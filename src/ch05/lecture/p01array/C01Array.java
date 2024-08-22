package ch05.lecture.p01array;

public class C01Array {
    public static void main(String[] args) {
        int a;
        a = 3;
        System.out.println("a = " + a);

        a = 4;
        System.out.println("a = " + a);

        int[] b;
        b = new int[5];
        b[0] = 1;
        b[1] = 20;
        b[3] = 99;

        System.out.println("b[0] = " + b[0]);
        System.out.println("b[1] = " + b[1]);
        System.out.println("b[2] = " + b[2]);
        System.out.println("b[3] = " + b[3]);

        b[0] = 11;
        System.out.println("b[0] = " + b[0]);
        System.out.println("b[1] = " + b[1]);
        System.out.println("b[2] = " + b[2]);
        System.out.println("b[3] = " + b[3]);

        // 배열 (array) : 여러 값을 가지는 자료형(자료구조)
    }
}
