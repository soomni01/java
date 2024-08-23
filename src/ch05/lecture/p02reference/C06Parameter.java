package ch05.lecture.p02reference;

import java.sql.SQLOutput;

public class C06Parameter {
    public static void main(String[] args) {
        int[] arr = {4, 5};
        method1(arr);

        System.out.println(arr[0]); // 44
    }

    public static void method1(int[] a) {
        System.out.println(a[0]);
        a[0] = 44;
        System.out.println(a[0]);
    }
}
