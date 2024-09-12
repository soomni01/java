package ch17.lecture.p04terminal;

import java.util.List;
import java.util.Optional;

public class C03Reduce {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 1, 4, 1, 5, 9, 2);
        Optional<Integer> sum1 = list.stream()
                .reduce(Integer::sum);
        Integer s1 = sum1.get();
        System.out.println("s1 = " + s1);

        List<Integer> emptyList = List.of();

        Optional<Integer> sum2 = emptyList.stream()
                .reduce(Integer::sum);
//        Integer s2 = sum2.get(); // Exception
        Integer s2 = sum2.orElse(0);
        System.out.println("s2 = " + s2);
    }
}