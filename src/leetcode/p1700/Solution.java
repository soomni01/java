package leetcode.p1700;


import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};
        System.out.println(s1.countStudents(students, sandwiches));
    }
}

class Solution1 {
    public int countStudents(int[] num1, int[] num2) {
        Queue<Integer> stuedents = new LinkedList<>();
        Queue<Integer> sandwiches = new LinkedList<>();

        for (int n : num1) {
            stuedents.offer(n);
        }
        for (int n : num2) {
            sandwiches.offer(n);
        }

        while (!stuedents.isEmpty()) {
            if (stuedents.peek().equals(sandwiches.peek())) {
                stuedents.poll();
                sandwiches.poll();
            } else {
                if (!stuedents.contains(sandwiches.peek())) {
                    return stuedents.size();
                } else {
                    int n = stuedents.poll();
                    stuedents.offer(n);
                }
            }

            System.out.println("학생" + stuedents);
            System.out.println("샌드위치" + sandwiches);
        }

        return 0;
    }
}
