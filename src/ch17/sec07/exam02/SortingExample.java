package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("홍길동", 30));
        studentList.add(new Student("홍길동", 10));
        studentList.add(new Student("홍길동", 20));

        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(s -> System.out.println(s.getName() + ":" + s.getScore()));
        System.out.println();

        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    }
}
