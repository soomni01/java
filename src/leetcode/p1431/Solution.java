package leetcode.p1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> kids = Arrays.stream(candies).boxed().toList();

        // 가장 많은 캔디 수(max) 구하기
        Integer max = 0;

        for (Integer candy : kids) {
            max = Math.max(max, candy);
        }

        // 각 아이들의 캔디에 추가 캔디 더해서 max 보다 크거나 같은지 확인

        // 결과 List에
        List<Boolean> result = new ArrayList<>();
        // 크거나 같으면 true 추가, 작으면 false 추가 해서
        for (Integer candy : kids) {
            result.add((candy + extraCandies) >= max);
        }
        // 결과 List 리턴
        return result;
    }
}
