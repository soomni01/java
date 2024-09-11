package ch17.lecture.p02operation;

import java.util.List;
import java.util.stream.Stream;

public class C03IntermediateOperation {
    public static void main(String[] args) {
        // 중간 연산
        List<Integer> list = List.of(3, 1, 4, 1, 5, 9, 2);

        // limit
        System.out.println("-limit-");
        Stream<Integer> stream = list.stream();
        Stream<Integer> limit = stream.limit(3);
        limit.forEach(System.out::println);

        // sort
        System.out.println("-sorted-");
        Stream<Integer> stream1 = list.stream();
        Stream<Integer> sorted = stream1.sorted();
        sorted.forEach(System.out::println);

        // map
        System.out.println("-map-");
        Stream<Integer> stream2 = list.stream();
        Stream<Integer> stream3 = stream2.map(i -> i * 2);
        stream3.forEach(System.out::println);

        // distinct
        System.out.println("-distinct-");
        Stream<Integer> stream4 = list.stream();
        Stream<Integer> distinct = stream4.distinct();
        distinct.forEach(System.out::println);

        // skip
        System.out.println("-skip-");
        Stream<Integer> stream5 = list.stream();
        Stream<Integer> skip = stream5.skip(2);
        skip.forEach(System.out::println);

        //
    }
}
