package leetcode.p119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> next = new ArrayList<>();

        next.add(1);

        for (int i = 1; i <= rowIndex + 1; i++) {
            for (int j = i - 1; j > 0; j--) {
                next.set(j, next.get(j - 1) + next.get(j));
            }
        }

        next.add(1);

        return next;
    }
}
