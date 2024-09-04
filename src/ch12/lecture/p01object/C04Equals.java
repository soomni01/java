package ch12.lecture.p01object;

public class C04Equals {
    public static void main(String[] args) {
        String a = "java";
        String b = "ja";
        String c = "va";
        String d = b + c;

        System.out.println(a);
        System.out.println(d);

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(d));

        System.out.println(a == d); // false
        System.out.println(a.equals(d)); // true
    }
}
