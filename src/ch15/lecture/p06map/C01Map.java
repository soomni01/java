package ch15.lecture.p06map;

import java.util.HashMap;
import java.util.Map;

public class C01Map {
    public static void main(String[] args) {
        // map : entry(key, value) 들을 저장
        // 같은 key를 가진 entry를 저장할 수 없음

        Map<String, String> map = new HashMap<>();

        // entry 추가
        // put
        map.put("java", "자바");
        map.put("react", "리액트");
        map.put("vue", "뷰");
        map.put("spring", "스프링");

        // entry 확인
        // size
        System.out.println(map.size());
        // containsKey : 해당 키가 있는지
        boolean b1 = map.containsKey("java");
        System.out.println("b1 = " + b1);
        boolean b2 = map.containsKey("css");
        System.out.println("b2 = " + b2);

        // containsValue : 해당 값이 있는지
        boolean b3 = map.containsKey("파이썬");
        System.out.println("b3 = " + b3);

        // entry 삭제
        map.remove("react");
        System.out.println(map.size());


        // 전체탐색
    }
}
