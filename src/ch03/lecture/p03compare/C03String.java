package ch03.lecture.p03compare;

public class C03String {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";

        // 크다, 작다 할 수 없음
//        System.out.println(a > b);

        // 같다, 같지않다 할 수 있음
        // 하지만 하면 안됨!!!!!
        System.out.println(a == b); //false

        String c = "html";
        String d = "ht";
        String e = "ml";
        String f = d + e;

        System.out.println("c = " + c); // html
        System.out.println("f = " + f); // html

        System.out.println(c == f); // false
        System.out.println(c.equals(f)); //true
    }
}
