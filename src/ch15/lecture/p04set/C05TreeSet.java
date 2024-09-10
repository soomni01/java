package ch15.lecture.p04set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C05TreeSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(987);
        set1.add(876);
        set1.add(432);
        set1.add(123);
        set1.add(432);

        System.out.println(set1);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(987);
        set2.add(876);
        set2.add(432);
        set2.add(123);
        set2.add(432);
        System.out.println(set2);

        TreeSet<String> set3 = new TreeSet<>();
        set3.add("java");
        set3.add("spring");
        set3.add("react");
        set3.add("sql");
        set3.add("css");
        System.out.println(set3);
        System.out.println(set3.getFirst());
        System.out.println(set3.getLast());

    }
}
