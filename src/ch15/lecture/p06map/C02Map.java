package ch15.lecture.p06map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02Map {
    public static void main(String[] args) {
        // 전체탐색
        Map<String, Integer> map = new HashMap<>();
        map.put("spring", 1000);
        map.put("react", 3000);
        map.put("java", 2000);
        map.put("vue", 1500);

        Set<String> keys = map.keySet();
        for (String key : keys) {
            Integer val = map.get(key);
            System.out.println(key + ":" + val);
        }

        // entrySet 이용
        System.out.println("-entrySet-");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println(key + ":" + val);
        }

        // forEach 메소드
        System.out.println("-forEach-");
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
