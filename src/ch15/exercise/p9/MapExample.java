package ch15.exercise.p9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        Integer maxScore = 0;
        String maxName = "";
        double totalScore = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            Integer score = entry.getValue();

            totalScore += score;

            if (maxScore < score) {
                maxScore = score;
                maxName = name;
            }
        }

        double avg = totalScore / map.size();

        System.out.println("avg = " + avg);
        System.out.println(maxName + ":" + maxScore);
    }
}