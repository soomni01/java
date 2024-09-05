package ch12.lecture.p03math;

// static import

import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.Arrays;

public class C02StaticMember {
    public static void main(String[] args) {
        double p = PI; // static field

        int m = Math.max(300, 500); // static method;

        int[] a = {5, 9, 1};
        int[] b = copyOf(a, a.length);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
