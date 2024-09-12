package ch17.exercise.p5;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );

        System.out.println("-고전적 반복문-");
        for (String item : list) {
            if (item.toLowerCase().contains("java")) {
                System.out.println(item);
            }
        }

        System.out.println("-Stream API-");
        list.stream()
                .filter(e -> e.toLowerCase().contains("java"))
                .forEach(System.out::println);
    }
}
