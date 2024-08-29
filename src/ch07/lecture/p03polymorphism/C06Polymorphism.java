package ch07.lecture.p03polymorphism;

import java.util.Scanner;

public class C06Polymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Object o = scanner;
        String v = o.toString();
        int i = o.hashCode();

//        o.nextLine() // 안됨
    }
}
