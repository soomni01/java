package ch02.lecture.p02type;

public class C05Character {
    public static void main(String[] args) {
        // char (2byte)
        // 문자 하나 ( 작은 따옴표 사용 )
        // unicode
        char a = 'a'; //
        char b = '가'; //
        char c = '한'; //
        char d = '8'; //
//        char e = 'gk';

        char f = 65;
        System.out.println("f = " + f);

        char g = 45206;
        System.out.println("g = " + g);

        char h = 3743;
        System.out.println("h = " + h);

        char i = '\u0E9F';
        System.out.println("i = " + i);

//        char j = ''; //x 빈 문자는 불가능
    }
}
