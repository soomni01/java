package ch02.lecture.p04conversion;

public class C06TypeConversion {
    public static void main(String[] args) {
        // byte, short, int 끼리의 연산의 결과는 int
        byte a = 3;
        byte b = 5;
        byte c = (byte) (a + b);

        // 정수끼리의 연산 결과는 정수
        int d = 5;
        int e = 3;
        int f = d / e; // 1.666666 (x), 1 (o)
        System.out.println("f = " + f);

    }
}
