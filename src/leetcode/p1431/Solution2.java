package leetcode.p1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> kids = Arrays.stream(candies).boxed().toList();

        // 가장 많은 캔디 수(max) 구하기
        Integer max = kids.stream()
                .max(Integer::compareTo)
                .get();


        // 각 아이들의 캔디에 추가 캔디 더해서
        return kids.stream()
                .map(c -> c + extraCandies)


                // max 보다 크거나 같은지 확인
                .map(c -> c >= max)

                // 결과 List에
                .toList();

        // 크거나 같으면 true 추가, 아니면 false 추가 해서

        // 결과 List 리턴


    }
}