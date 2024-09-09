package ch15.lecture.p04set;

import java.util.HashSet;

public class C03Set {
    public static void main(String[] args) {
        // 중복 허용 안됨
        var set = new HashSet<String>();
        set.add("java");
        set.add("vue");
        set.add("css");
        boolean b1 = set.add("git");
        boolean b2 = set.add("vue"); // 안들어감

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        System.out.println(set);
        System.out.println(set.size());

        // null 저장도 최대 한 번만
        boolean b3 = set.add(null);
        boolean b4 = set.add(null);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);
        System.out.println(set);
        System.out.println(set.size());
    }
}
