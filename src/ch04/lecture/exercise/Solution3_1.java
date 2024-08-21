package ch04.lecture.exercise;

public class Solution3_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i += 3) {
            sum += i;
        }
        System.out.println(sum);
    }
}
