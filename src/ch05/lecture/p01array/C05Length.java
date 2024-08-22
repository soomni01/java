package ch05.lecture.p01array;

public class C05Length {
    public static void main(String[] args) {
        int i = 5;

        int[] arr = new int[10];
        int l = arr.length;
        System.out.println("l = " + l);

        int[] brr = new int[5];
        System.out.println(brr.length);

        int[] crr = new int[7];
        System.out.println(crr.length);

        int[] drr = new int[3];
        drr[0] = 5;
        drr[1] = 7;
        drr[2] = 9;

        for (int j = 0; j < drr.length; j++) {
            System.out.println(drr[j]);
        }
    }
}