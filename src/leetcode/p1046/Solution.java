package leetcode.p1046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int lastStoneWeight(int[] stones) {
        // int[] -> List<Integer>
        List<Integer> list = new ArrayList<>();
        for (int s : stones) {
            list.add(s);
        }

        // 가장 큰 돌 두개 찾아서 부딪혀 깨고 남은 거 다시 리스트에 넣기


        // 리스트에 하나의 돌이 남을 때까지

        while (list.size() > 1) {

            //      가장 큰 돌 두개 찾기
            //          1. sort
            //          2. 오른쪽 두개
            Collections.sort(list);

            //      큰 돌 두개 꺼내기(지우기)
            Integer big1 = list.remove(list.size() - 1);
            Integer big2 = list.remove(list.size() - 1);

            //      두 돌의 무게가 0이 아니면 차이(무게) 돌 다시 넣기
            int diff = big1 - big2;

            if (diff != 0) {
                list.add(diff);
            }
        }
        //


        if (list.isEmpty()) {
            return 0;
        }
        // 하나 남은 돌의 무게 리턴
        return list.get(0);
    }
}