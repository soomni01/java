package ch12.lecture.p02wrapper;

public class C06Wrapper {
    public static void main(String[] args) {
        // wrapper class 의
        // 유용한 필드와 메소드 소개

        // int 의 가장 큰 값
        System.out.println(Integer.MAX_VALUE);
        // int 의 가장 작은 값
        System.out.println(Integer.MIN_VALUE);

        // NaN, Infinity 확인
        double a = 5.0 / 0.0; // Infinity
        System.out.println(Double.isInfinite(a));

        double b = 5.0 % 0.0; // NaN
        System.out.println(Double.isNaN(b));

        // compare : 비교 메소드
        // 리턴값 : 같으면 0, 작으면 음수, 크면 양수
        Integer c = 5000;
        Integer d = 7000;
        System.out.println(c <= d);
        System.out.println(c.compareTo(d)); // 음수
        System.out.println(d.compareTo(c)); // 양수

        Double e = 3.14;
        Double f = 7.1234;
        System.out.println(e <= f);
        System.out.println(e.compareTo(f)); // 음수
        System.out.println(f.compareTo(e)); // 양수
    }
}
