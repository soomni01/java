package ch17.exercise.p6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        // 고전적 방법
        double avg1 = 0.0;
        for (Member member : list) {
            avg1 += member.getAge();
        }
        avg1 /= list.size();
        ;
        System.out.println("avg = " + avg1);

        double avg = list.stream()
                .collect(
                        Collectors.averagingDouble(Member::getAge)
                );

        System.out.println("평균 나이: " + avg);
    }
}
