package ch15.lecture.p03matrix;

import java.util.ArrayList;
import java.util.List;

public class C01Matrix {
    public static void main(String[] args) {
        var list1 = new ArrayList<Integer>();
        list1.add(6);
        list1.add(3);
        list1.add(9);
        list1.add(2);

        var list2 = new ArrayList<Integer>();
        list2.add(200);
        list2.add(300);
        list2.add(400);

        var list3 = new ArrayList<Integer>();
        list3.add(-3);
        list3.add(-1);
        list3.add(-4);

        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(list1);
        matrix.add(list2);
        matrix.add(list3);

        System.out.println(matrix.get(0).get(0)); // 6
        System.out.println(matrix.get(2).get(1)); // -1

        matrix.get(1).add(700);

        System.out.println(matrix.get(1).get(3)); // 700

    }
}