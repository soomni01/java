package ch17.lecture.p04terminal;

import java.util.Arrays;

public class C02Reduce {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2};

        int result = 0;
        for (int n : arr) {
            result = apply(result, n);
        }
        System.out.println("result = " + result); // 합계

        // reduce
        int r2 = Arrays.stream(arr)
                .reduce(0, (a, b) -> a + b);
        System.out.println("r2 = " + r2);
        int r3 = Arrays.stream(arr)
                .reduce(0, (a, b) -> a + 1);
        System.out.println("r3 = " + r3);
        int r4 = Arrays.stream(arr)
                .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("r4 = " + r4);
        int r5 = Arrays.stream(arr)
                .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println("r5 = " + r5);

    }

    public static int apply(int a, int b) {
        return a + b;
    }
}