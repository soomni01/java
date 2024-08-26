package ch05.lecture.p04string;

public class C09Substring {
    public static void main(String[] args) {
        // substring : 부분 문자열 추출
        // 원본 문자열 변경 안됨

        String s = "java programming language";
        String s1 = s.substring(5, 8); // pro
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s.substring(17, 23));

        String s2 = s.substring(17);
        String s3 = s.substring(17, s.length());

        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }
}
