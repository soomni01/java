package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 다른 사람 풀이 보기
class Solution {
    public int[] solution(int n) {

        boolean run = true;
        List<Integer> list = new ArrayList<>();

        while (run) {
            if (n == 1) {
                System.out.println("종료");
                run = false;
            } else {
                for (int i = 2; i <= n; i++) {
                    if (n % i == 0) {
                        n /= i;
                        if (!list.contains(i)) {
                            list.add(i);
                        }
                        System.out.println(n + ", " + i);
                        break;
                    }
                }
            }
        }
        System.out.println(list.size());
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution programmers = new Solution();

        System.out.println(programmers.solution(12));
//        System.out.println(programmers.solution("p2o4i8gj2"));
//        System.out.println(programmers.solution("abcde0"));
    }
}
