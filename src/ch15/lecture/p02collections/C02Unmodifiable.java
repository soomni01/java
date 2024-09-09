package ch15.lecture.p02collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02Unmodifiable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("spring");
        list.add("java");
        list.add("css");
        list.add("react");
        list.add("vue");

        // 수정 불가능한 컬렉션(list, set, map) 만들기
        List<String> unmodifiabled = Collections.unmodifiableList(list);
        System.out.println(list);
        System.out.println(unmodifiabled);

        Collections.sort(unmodifiabled);
        System.out.println(unmodifiabled);

    }
}
