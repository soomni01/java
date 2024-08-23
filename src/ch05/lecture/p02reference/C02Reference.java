package ch05.lecture.p02reference;

public class C02Reference {
    public static void main(String[] args) {
        int[] arr = {7, 8};
        int[] brr = {7, 8};
        int[] crr = arr;

        System.out.println("arr[0] = " + arr[0]); // 7
        System.out.println("brr[0] = " + brr[0]); // 7
        System.out.println("crr[0] = " + crr[0]); // 7

        arr[0] = 71;
        brr[0] = 72;
        crr[0] = 73;

        System.out.println("arr[0] = " + arr[0]); // 73
        System.out.println("brr[0] = " + brr[0]); // 72
        System.out.println("crr[0] = " + crr[0]); // 73
    }
}
