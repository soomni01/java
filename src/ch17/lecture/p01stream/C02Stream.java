package ch17.lecture.p01stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C02Stream {
    public static void main(String[] args) {
        // stream 만들기

        List<String> list = List.of("son", "kim", "lee", "hong", "hwang");
        Stream<String> stream1 = list.stream();

        Set<String> set = Set.of("java", "css", "jsp", "react");
        Stream<String> stream2 = set.stream();

        Map<String, Integer> map = Map.of("java", 300, "c", 200, "python", 700);
        map.entrySet().stream();

        String[] arr1 = {"추석", "설날", "단오", "크리스마스", "석가탄신일"};
        Stream<String> stream4 = Arrays.stream(arr1);

        int[] arr2 = {100, 300, 500, 700};
        IntStream stream5 = Arrays.stream(arr2);
    }
}
