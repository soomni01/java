package ch15.lecture.p04set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("vue");
        set.add("react");
        set.add("jsp");
        set.add("sql");

        // 전체 탐색
        // 1. 향상된 for
        System.out.println("---향상된 for---");
        for (String item : set) {
            System.out.println(item);
        }

        // 2. forEach
        System.out.println("---forEach---");
        set.forEach(System.out::println);

        // 3, iterator 사용
        System.out.println("---iterator 사용---");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
