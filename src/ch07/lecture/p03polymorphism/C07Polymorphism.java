package ch07.lecture.p03polymorphism;

import java.util.Scanner;

public class C07Polymorphism {
    public static void main(String[] args) {
        String a = "java";
        Scanner scanner = new Scanner(System.in);

        print(a);
        print(scanner);
    }

    public static void print(Object o) {
        String s = o.toString();
        int i = o.hashCode();

        System.out.println("s = " + s);
        System.out.println("i = " + i);

    }
}
