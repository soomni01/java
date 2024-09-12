package ch17.lecture.p04terminal;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class C05Collect {
    public static void main(String[] args) {
        // collect : 하나의 객체로 담아냄

        List<Integer> list = List.of(3, 1, 4, 1, 5, 9, 2);
        List<Integer> list2 = list.stream()
                .map(n -> n * 2)
                .collect(toList());
        System.out.println("list2 = " + list2);

        List<Integer> list3 = list.stream()
                .map(n -> n * 3)
                .toList();
        System.out.println("list3 = " + list3);

        Set<Integer> set4 = list.stream()
                .map(n -> n * 4)
                .collect(toSet());
        System.out.println("set4 = " + set4);

        Map<Double, Integer> map5 = list.stream()
                .map(n -> n * 5)
                .collect(toMap(e -> e * Math.random(), e -> e));
        System.out.println("map5 = " + map5);


    }
}
