package ch02.lecture.p04conversion;

public class C04TypeConversion {
    public static void main(String[] args) {
        // 자동형변환 : 문자형(char) -> 정수형(int, long)
        // 강제형변환 : 정수형(int, long) -> 문자형(char)

        char a = '한';
        int b = a; // 자동형변환
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        long c = b;
        System.out.println("c = " + c);

        //
        a = (char) b; // 자동형변환 x, 강제형변환 ok
        System.out.println("a = " + a);
    }
}
