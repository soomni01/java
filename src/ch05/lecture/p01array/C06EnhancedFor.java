package ch05.lecture.p01array;

public class C06EnhancedFor {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 99;
        arr[1] = 88;
        arr[2] = 77;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }

        // 향상된 for
        System.out.println("--enhanced for --");

        for (int n : arr) {
            System.out.println("n = " + n);
        }
    }
}