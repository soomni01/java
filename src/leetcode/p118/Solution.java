package leetcode.p118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> next = new ArrayList<>();

        next.add(1);

        for (int i = 1; i <= numRows + 1; i++) {
            for (int j = i - 1; j > 0; j--) {
                next.set(j, next.get(j - 1) + next.get(j));
            }
        }

        next.add(1);
          

        return new ArrayList<>();
    }
}