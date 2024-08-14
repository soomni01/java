package ch02.lecture.p02type;

public class C01Type {
    public static void main(String[] args) {
        // java data type 2가지

        // 1. primitive type 8가지
        //    byte : 1바이트 정수
        //    short : 2바이트 정수
        //    int : 4바이트 정수 *
        //    long : 8바이트 정수 *
        //    float : 4바이트 실수
        //    double : 8바이트 실수 *
        //    boolean : 1바이트 논리 *
        //    char : 2바이트 문자

        // 2. reference type 무한대 ( 참조 타입 )
        //    primitive type 빼고 모두

        /////////////////////
        // primitive type
        // 정수형 (byte(1), short(2), int(4), long(8))
        byte b1;
        b1 = 127;
        byte b2;
        b2 = -128;

//        byte b3 = 128; // x
//        byte b4 = -129; // x
        
        int v1 = 214783467;
        System.out.println("v1 = " + v1);

        System.out.println(v1 + 1);

    }
}
