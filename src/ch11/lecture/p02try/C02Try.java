package ch11.lecture.p02try;

public class C02Try {
    public static void main(String[] args) {
        try {
            int[] a = {3, 4};
            int i = a[2];
            System.out.println("i = " + i);
        } catch (IndexOutOfBoundsException e) {
            // 어떤 일..
            e.printStackTrace();
        }
        System.out.println("다음 코드들..");
    }
}
