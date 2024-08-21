package ch04.exercise;

public class Solution5 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                int cal = 4 * x + 5 * y;
                if (cal == 60) {
                    System.out.println(STR."(\{x}, \{y})");
                }
            }
        }
    }
}
