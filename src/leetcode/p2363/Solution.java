package leetcode.p2363;

import java.util.*;

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        List<List<Integer>> result = new ArrayList<>();

        if (items1.length == 0 && items2.length == 0)
            return result;


        for (int[] i : items1) {
            map.put(i[0], i[1]);
        }

        for (int[] i : items2) {

            if (map.containsKey(i[0])) {

                map.put(i[0], map.get(i[0]) + i[1]);

            } else {

                map.put(i[0], i[1]);
            }
        }

        for (int key : map.keySet()) {
            List<Integer> list = new ArrayList<>();
            list.add(key);
            list.add(map.get(key));
            result.add(list);
        }


        return result;
    }
}