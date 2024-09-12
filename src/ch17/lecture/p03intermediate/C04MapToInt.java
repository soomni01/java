package ch17.lecture.p03intermediate;

import java.util.List;

public class C04MapToInt {
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "spring", "react", "bootstrap");

        list.stream()
                .mapToInt(e -> e.length())
                .forEach(System.out::println);
    }
}
