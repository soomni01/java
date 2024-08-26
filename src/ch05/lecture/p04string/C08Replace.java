package ch05.lecture.p04string;

public class C08Replace {
    public static void main(String[] args) {
        // replace : 부분 문자열을 다른 문자열로 교체
        // 원본이 바뀌지 않음
        String s = "java programming language, python language";
        String t = s.replace("language", "언어");

        System.out.println(s);
        System.out.println(t);
    }
}
