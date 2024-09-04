package ch12.lecture.p01object;

import java.util.HashSet;

public class C09HashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("java");
        set.add("css");

        int s1 = set.size();
        System.out.println("s1 = " + s1);

        set.add("java");
        System.out.println(set.size());

        set.add(new String("java"));
        System.out.println(set.size());
    }
}
