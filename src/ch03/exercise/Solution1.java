package ch03.exercise;

public class Solution1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
//        int z = (++x) + (y--);
        ++x;
        int z = x + y;
        y--;

        System.out.println(z);
    }
}
