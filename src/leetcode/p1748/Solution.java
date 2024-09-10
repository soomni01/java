package leetcode.p1748;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        // 배열 전체 탐색 후
        // (어떤 수, 몇개) 있는 지 센 후
        for (int n : nums) {
            if (map.containsKey(n)) {
                // map에 이미 있으면
                // (n, map.get(n) + 1)
                map.put(n, map.get(n) + 1);
            } else {
                // map에 없으면
                // (n, 1) 를 추가
                map.put(n, 1);
            }
        }

        // map을 전체 탐색 해서
        // value가 1인 key들의 합을
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer val = entry.getValue();

            if (val == 1) {
                sum += key;
            }
        }

        // 구해서 return

        return sum;
    }
}