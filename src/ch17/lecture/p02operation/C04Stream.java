package ch17.lecture.p02operation;

import java.util.List;
import java.util.stream.Stream;

public class C04Stream {
    public static void main(String[] args) {
        List<Integer> list = List.of(8, 1, 9, 2, 10, 3);

        // 최종연산이 있어야, 중간 연산도 실행됨
        Stream<Integer> stream = list.stream(); // 스트림 만들기
        Stream<Integer> peek = stream.peek(System.out::println);// 중간연산
        peek.min(Integer::compareTo);// 최종연산


        // 한 번 사용된 stream을 재사용할 수 없음
        Stream<Integer> stream1 = list.stream();// 스트림 만들기
        stream1.max(Integer::compareTo); // 최종연산

        stream1.min(Integer::compareTo); // 재사용 불가
        System.out.println("다음 코드");
    }
}
