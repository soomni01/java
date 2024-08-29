package programmers;

// 분수의 덧셈
public class Solution1 {
    public static void main(String[] args) {
        int number1 = 9;
        int denom1 = 2;
        int number2 = 1;
        int denom2 = 3;

        int x = number1 * denom2 + number2 * denom1;
        int y = denom1 * denom2;

        System.out.println(x);
        System.out.println(y);
        for (int i = 2; i <= x; i++) {
            if (x % i == 0 && y % i == 0) {
                System.out.println(i);
                x /= i;
                y /= i;

            }

        }
        System.out.println(x + "," + y);
    }
}
