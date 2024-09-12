package ch17.lecture.p03intermediate;

import java.util.List;

public class C03Map {
    public static void main(String[] args) {
        // map : 다른 값으로 변환(mapping)

        List<String> list = List.of("손흥민", "홍명보", "이강인", "황희찬", "린가드");

        list.stream()
                .map(e -> e.substring(1))
                .forEach(System.out::println);

        System.out.println();

        list.stream()
                .map(e -> e.substring(0, 1))
                .forEach(System.out::println);
    }
}
