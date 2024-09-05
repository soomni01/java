package ch12.lecture.p02wrapper;

public class C03Wrapper {
    public static void main(String[] args) {
        int a = 3000;
        int b = 3000;

        System.out.println(a == b);

        Integer c = a;
        Integer d = b;

        System.out.println(c == d);

        // 참조타입 비교는 equals
        System.out.println(c.equals(d));

        System.out.println(c.hashCode());
        System.out.println(d.hashCode());

        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
    }
}
