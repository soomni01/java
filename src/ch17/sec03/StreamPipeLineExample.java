package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        // 방법1
//        Stream<Student> studentStream = list.stream();
//        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
//        double avg = scoreStream.average().getAsDouble();

        // 한 번에 (method chaining)
        double avg = list.stream() // 1. 스트림 만들기
                .mapToInt(student -> student.getScore()) // 2. 중간 연산
                .average() // 3. 최종 연산
                .getAsDouble(); // 기타 등등...

        System.out.println("평균 점수: " + avg);
    }
}
