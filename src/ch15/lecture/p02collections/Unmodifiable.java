package ch15.lecture.p02collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Unmodifiable {
    public static void main(String[] args) {
        // 수정 가능한 리스트
        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("spring");
        list1.add("css");
        Collections.sort(list1);

        // 수정 불가능한 리스트
        List<String> list2 = List.of("java", "spring", "css");
        Collections.sort(list2);

    }
}
