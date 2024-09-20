package ch18.lecture.p7file;

import java.io.File;

public class C02Directory {
    public static void main(String[] args) {
        String path = "C:/Temp";
        File f1 = new File(path);

        boolean exists = f1.exists();
        long length = f1.length();
        boolean directory = f1.isDirectory();

        System.out.println("exists = " + exists);
        System.out.println("length = " + length);
        System.out.println("directory = " + directory);

        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println("file.getName() = " + file.getName());
        }
    }
}
