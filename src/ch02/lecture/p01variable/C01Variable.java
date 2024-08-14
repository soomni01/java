package ch02.lecture.p01variable;

public class C01Variable {
    public static void main(String[] args) {
        // 한 줄 주석
        /* 
        여러 줄 주석
         */
        System.out.println("hello");
//        System.out.println("world");

        // 변수(variable) : 값을 저장하는 이름이 있는 공간
        // 타입(int) 변수명(a)
        int a = 10;
        System.out.println(a);
        a = 20;
        System.out.println(a);
        // 타입에 맞는 값만 넣을 수 있음
//         a = 3.14;

        // 정수를 저장할 수 있는 b라는 이름의 저장공간 생성
        int b;

        // 초기화 되지 않은 변수를 사용할 수 없음
//        System.out.println(b);

        b = 3;
        System.out.println(b);

        // # 정수를 담을 수 있는 c 변수를 선언하고
        // c에 100을 넣고
        // 출력하기
        int c;
        c = 100;
        System.out.println(c);
        int d = 200;
        System.out.println(d);
    }
}
