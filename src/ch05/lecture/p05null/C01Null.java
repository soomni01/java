package ch05.lecture.p05null;

public class C01Null {
    public static void main(String[] args) {
        // null : 참조하는(가리키는) 객체(instance)가 없다.
        int[] a = new int[3];

        System.out.println(0); // null
        System.out.println(1); // null
        System.out.println(2); // null

//        a[0].length(); // NullPointerexception

        System.out.println("프로그램 종료");
    }
}
