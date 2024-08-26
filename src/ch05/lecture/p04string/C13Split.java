package ch05.lecture.p04string;

public class C13Split {
    public static void main(String[] args) {
        // split : 문자열을 나누는 메소드
        String s = "java,css,spring,react";
        String[] t = s.split(",");
        System.out.println(t[0]); // java
        System.out.println(t[1]); // css
        System.out.println(t[2]); // spring
        System.out.println(t[3]); // react

        String u = "java css html";
        String[] v = u.split(" ");
        System.out.println(v[0]); // java
        System.out.println(v[1]); // css
        System.out.println(v[2]); // html

        String w = "java css";
        String[] x = w.split("");
        System.out.println(x[0]); // j
        System.out.println(x[3]); // a
        System.out.println(x[4]); // " "
        System.out.println(x[7]); // s

        String y = "java  css";
        String[] z = y.split(" ");
        System.out.println(z[0]); // java
        System.out.println(z[1]); // ""
        System.out.println(z[2]); // css

        String[] a = y.split(" +"); // 정규표현식
        System.out.println(a[0]); // java
        System.out.println(a[1]); // css

    }
}
