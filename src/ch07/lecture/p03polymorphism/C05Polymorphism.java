package ch07.lecture.p03polymorphism;

public class C05Polymorphism {
    public static void main(String[] args) {
        String s = "java";
        boolean b = s.isEmpty();

        Object o = s;
        int i = o.hashCode();
        String v = o.toString();
//        o.isEmpty(); // 안됨
    }
}
