package ch17.lecture.p02operation;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class C0TerminalOperation {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 1, 7, 2, 8, 9);
        Stream<Integer> stream = list.stream();

        long count = stream.count();
        System.out.println("count = " + count);

        // min
        Stream<Integer> stream1 = list.stream();
        Optional<Integer> min = stream1.min(Integer::compareTo);
        Integer i = min.get();
        System.out.println("i = " + i);

        // max
        Stream<Integer> stream2 = list.stream();
        OptionalInt max = stream2.mapToInt(Integer::intValue).max();
        System.out.println("max = " + max.getAsInt());

        // forEach
        Stream<Integer> stream3 = list.stream();
        stream3.forEach(System.out::println);
    }
}
