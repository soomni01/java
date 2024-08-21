package ch04.exercise;

public class Solution4 {
    public static void main(String[] args) {
        while (true) {
            int num = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            System.out.println(STR."(\{num}, \{num2})");

            if ((num + num2) == 5) {
                break;
            }
        }
    }
}
