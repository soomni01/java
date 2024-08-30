package ch08.lecture.p01interface;

import java.io.Closeable;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.util.Iterator;
import java.util.Scanner;

public class C06Polymorphism {
    public static void main(String[] args) {
        String s = "java";
        Serializable o = s;
        CharSequence p = s;
        Comparable q = s;
        Constable r = s;
        ConstantDesc t = s;

        Scanner scanner = new Scanner("");
        Object v1 = scanner;
        Closeable v2 = scanner;
        AutoCloseable v3 = scanner;
        Iterator v4 = scanner;
    }
}
