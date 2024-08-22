package ch05.lecture.p01array;

public class C07Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 99;
        arr[1] = 88;
        arr[2] = 77;

        // 배열의 길이와 초기값을 한 번에
        int[] brr;
        brr = new int[]{55, 44, 33, 22};

        String[] s;
        s = new String[]{"We", "are", "the", "world!"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
            System.out.println(s[i].length());
        }


        for (int n : brr) {
            System.out.println("n = " + n);
        }

    }
}
