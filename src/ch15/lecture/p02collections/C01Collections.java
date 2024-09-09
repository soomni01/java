package ch15.lecture.p02collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C01Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("spring");
        list.add("react");
        list.add("html");

        System.out.println(list);

        // 섞기
        Collections.shuffle(list);
        System.out.println(list);

        // 정렬
        Collections.sort(list);
        System.out.println(list);

        // 순서뒤집기
        Collections.reverse(list);
        System.out.println(list);

        // 가장 큰 값 찾기
        String max = Collections.max(list);
        System.out.println("max = " + max);

        // 가장 작은 값 찾기
        String min = Collections.min(list);
        System.out.println("min = " + min);
    }
}
