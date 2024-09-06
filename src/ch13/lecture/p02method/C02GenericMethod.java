package ch13.lecture.p02method;

import java.util.Arrays;

public class C02GenericMethod {
    public static void main(String[] args) {
        String[] arr1 = {"java", "css", "react"};
        String[] arr2 = Arrays.<String>copyOf(arr1, arr1.length);

        Integer[] arr3 = {5, 1, 0};
        Integer[] arr4 = Arrays.<Integer>copyOf(arr3, arr3.length);

        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        System.out.println("Arrays.toString(arr4) = " + Arrays.toString(arr4));

    }
}
