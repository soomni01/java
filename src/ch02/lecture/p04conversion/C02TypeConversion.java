package ch02.lecture.p04conversion;

public class C02TypeConversion {
    public static void main(String[] args) {
        // 실수 간
        // float(4), double(8)
        float a = 3.14F;
        double b = a; // 자동형변환 ok

        double c = 3.14;
        float d = (float) c; // 자동형변환 x, 강제형변환

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
