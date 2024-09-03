package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int[] reverse = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            reverse[i] = num_list[num_list.length - (i + 1)];
        }
        return reverse;
    }
}