package ch06.lecture.p06final;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class C03Final {
    public static void main(String[] args) {
        final int[] a = {3, 4};
//        a = new int[]{5, 6}; // 불가
        a[0] = 33; // a의 값이 바뀐 것이 아니라 a가 가리키는 인스턴스의 값이 바뀐것이므로 가능
        System.out.println(Arrays.toString(a));
    }

    static void method1(final int[] a) {
//        a = new int[]{99, 88}; // 불가
        a[1] = 99;
    }
}
