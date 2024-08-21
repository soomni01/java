package ch04.exercise;

public class Solution3 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i += 3;
        }
        System.out.println(sum);
    }
}
