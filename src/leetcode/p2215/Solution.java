package leetcode.p2215;
//2215 2032 771 1684

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{2, 4, 6};
        System.out.println(s1.findDifference(nums1, nums2));
    }
}

class Solution1 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> list1 = new ArrayList<>();
        for (int s : nums1) {
            list1.add(s);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int s : nums2) {
            list2.add(s);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (list2.contains(nums1[i])) {

//                list2.remove();
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (list1.contains(nums2[i])) {
                list1.remove(nums2[i]);
            }
        }
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(list1);
        matrix.add(list2);
        return matrix;
    }
}