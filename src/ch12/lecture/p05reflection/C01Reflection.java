package ch12.lecture.p05reflection;

public class C01Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        // reflection : 클래스를 반영한 객체를 만들어 활용

        // Class 객체 생성해서 활용

        // Class 객체 만드는 법
        // 1. Class.forName()
        Class o1 = Class.forName("java.lang.String");
        // 2. Class명.class
        Class o2 = String.class;
        // 3. 객체명.getClass()
        String a = "";
        Class o3 = a.getClass();

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(o2));
        System.out.println(System.identityHashCode(o3));
    }
}
