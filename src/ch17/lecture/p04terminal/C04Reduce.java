package ch17.lecture.p04terminal;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class C04Reduce {
    public static void main(String[] args) {
        // sum, avg, count, min, max
        List<Integer> list = List.of(3, 1, 4, 1, 5, 9, 2);

        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sum = " + sum);

        double average = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("average = " + average);

        Optional<Integer> max = list.stream()
                .max(Integer::compareTo);
        System.out.println("max.get() = " + max.get());

        Optional<Integer> min = list.stream()
                .min(Integer::compareTo);
        System.out.println("min.get() = " + min.get());

        long count = list.stream()
                .count();
        System.out.println("count = " + count);
    }
}
