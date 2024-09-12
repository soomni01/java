package ch17.lecture.p04terminal;

import java.util.List;

public class C01ForEach {
    public static void main(String[] args) {
        // forEach : 스트림이 각 요소에 주어진 액션을 실행
        List<Integer> list = List.of(5, 10, 20, 1);

        list.stream()
                // 중간 연산들...
                .forEach(e -> System.out.println(e));

        List<Student1> s = List.of(
                new Student1("son", 90),
                new Student1("hong", 80),
                new Student1("lee", 70)
        );

        s.stream()
                .forEach(t -> t.setScore(t.getScore() + 5));
        s.forEach(System.out::println);
    }
}

class Student1 {
    private String name;
    private int score;
    // 생성자, getter, setter, toString

    public Student1(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
