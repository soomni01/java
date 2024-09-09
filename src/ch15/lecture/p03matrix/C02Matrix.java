package ch15.lecture.p03matrix;

import com.sun.security.jgss.GSSUtil;

import java.util.List;

public class C02Matrix {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(7, 1, 6, 9);
        System.out.println(list1);
//        list1.add(10); // x

        List<List<Integer>> matrix = List.of(
                List.of(3, 1, 4, 5),
                List.of(99, 88, 77),
                List.of(-1, -10, -100));

        System.out.println(matrix.get(1).get(1)); // 88
        System.out.println(matrix.get(2).get(0)); // -1

//        matrix.get(0).add(9999); // x
//        matrix.add(List.of(1, 2, 3)); // x

    }
}