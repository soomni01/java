package ch17.exercise.p8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> map1 = new HashMap<>();
        // 고전적방법
        for (Member m : list) {
            String job = m.getJob();
            if (map1.containsKey(job)) {
                List<Member> members = map1.get(job);
                members.add(m);
            } else {
                List<Member> members = new ArrayList<>();
                map1.put(job, members);
                members.add(m);
            }
        }
        System.out.println(map1);

        System.out.println();
        // stream
        Map<String, List<Member>> map2 = list.stream()
                .collect(Collectors.groupingBy(Member::getJob));
        System.out.println(map2);
    }
}