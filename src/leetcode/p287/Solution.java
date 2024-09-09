package leetcode.p287;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findDuplicate(int[] nums) {
        // 배열을 전체 탐색 하면서
        // 각 원소를 set에 넣고(add)
        // false를 리턴하면 그 값이 중복된 값이므로
        // return하고 종료

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            boolean b = set.add(n);
            if (!b) {
                return n;
            }
        }

        return 0;
    }
}