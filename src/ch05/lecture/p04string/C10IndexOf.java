package ch05.lecture.p04string;

public class C10IndexOf {
    public static void main(String[] args) {
        // indexOf : 특정 문자열이 있는 위치(index) 리턴
        String s = "java programming language";
        int n1 = s.indexOf("java"); // 0
        System.out.println("n1 = " + n1);

        int n2 = s.indexOf("pro"); // 5
        System.out.println("n2 = " + n2);

        int n3 = s.indexOf("a"); // 1
        System.out.println("n3 = " + n3);

        // 해당 문자열이 없는 경우 -1 리턴
        int n4 = s.indexOf("python"); // -1
        System.out.println("n4 = " + n4);

        int n5 = s.indexOf("css");
        if (n5 == -1) { // n5 >= 0
            System.out.println("css는 없음");
        } else {
            System.out.println("css 있음");
        }
    }
}
