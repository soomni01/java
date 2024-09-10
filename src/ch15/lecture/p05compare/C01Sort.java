package ch15.lecture.p05compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C01Sort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(88);
        list.add(100);
        list.add(200);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
