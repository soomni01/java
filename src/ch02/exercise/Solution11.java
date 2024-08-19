package ch02.exercise;

public class Solution11 {
    public static void main(String[] args) {
        int v1 = 1;
        System.out.println("v1 = " + v1);
        if (true) {
            int v2 = 2;
            if (true) {
                int v3 = 2;
                System.out.println("v1 = " + v1);
                System.out.println("v2 = " + v2);
                System.out.println("v3 = " + v3);
            }
            System.out.println("v1 = " + v1);
            System.out.println("v2 = " + v2);
//            System.out.println("v3 = " + v3); // 오류 발생
        }
        System.out.println("v1 = " + v1);
//        System.out.println("v2 = " + v2); // 오류 발생
    }
}
