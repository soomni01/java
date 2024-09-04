package ch12.lecture.p01object;

public class C07Hashcode {
    public static void main(String[] args) {
        String a = "java";
        String b = "ja";
        String c = "va";
        String d = b + c;

        System.out.println(a.equals(d));
        System.out.println(a.hashCode());
        System.out.println(d.hashCode());

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(d));
    }
}
