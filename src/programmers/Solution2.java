package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 중앙값 구하기
public class Solution2 {
    public static void main(String[] args) {
        int money = 5500;
        int[] arr = new int[2];
        int answer = 0;

        arr[0] = money / 5500;
        arr[1] = money % 5500;
        

        System.out.println(arr);

    }
}
