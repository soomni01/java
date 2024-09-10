package leetcode.p1512;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // 배열을 전체 탐색해서
        // 각 수가 몇개인지 저장(map)
        for (int num : nums) {
            map.putIfAbsent(num, 0);
            map.computeIfPresent(num, (k, v) -> v + 1);
        }

        // map을 전체 탐색하면서
        // value로 vC2 을 구해서 더하기
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();

            int c = value * (value - 1) / 2;
            sum += c;
        }


        return sum;
    }
}