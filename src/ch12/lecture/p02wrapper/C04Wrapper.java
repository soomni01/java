package ch12.lecture.p02wrapper;

public class C04Wrapper {
    public static void main(String[] args) {
        Integer a = 3000;
        Integer b = 3000;

        System.out.println(a.equals(b));

        int c = 5000;
        int d = 7000;

        System.out.println(c < d);

        Integer e = c;
        Integer f = d;
        System.out.println(e < f);
    }
}
