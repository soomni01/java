package programmers;

import java.util.Arrays;

public class Exmaple {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num_list = {1, 2, 3, 4, 5};
        int[] result = solution.solution(num_list);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(num_list));
    }
}

