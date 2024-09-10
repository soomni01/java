package leetcode.p2206;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // 배열을 전체 탐색 해서
        for (int num : nums) {
            Integer v = map.getOrDefault(num, 0);
            map.put(num, v + 1);
        }
       

        // map을 전체 탐색해서 value가 홀수인 것이 있으면
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
