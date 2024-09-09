package leetcode.p1200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        var list = new ArrayList<Integer>();
        for (int num : arr) {
            list.add(num);
        }


        var result = new ArrayList<List<Integer>>();

        // 가장 작은 차이 구하기
        // 1. 정렬
        Collections.sort(list);
        // 2. 전체 탐색 하면서 인접한 두 수의 차 중 가장 작은 것 찾기
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            int num1 = list.get(i);
            int num2 = list.get(i + 1);

            int diff = num2 - num1;

            min = Math.min(min, diff);
        }

        // 전체 탐색하면서
        // 인접한 두 수의 차가 min과 같으면 result에 넣기
        for (int i = 0; i < list.size() - 1; i++) {
            int num1 = list.get(i);
            int num2 = list.get(i + 1);

            if ((num2 - num1) == min) {
                result.add(List.of(num1, num2));
            }
        }

        return result;

    }
}