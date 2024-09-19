package ch18.lecture.p1io;

import java.io.*;
import java.util.Scanner;

public class C04OutputStream {
    public static void main(String[] args) {

        String name = "C:/Temp/output4.txt";
        // try-with-resources
        try (
                OutputStream os = new FileOutputStream(name);
                InputStream is = new FileInputStream("");
                Scanner scanner = new Scanner("");
        ) {

            os.write(99);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            OutputStream os = new FileOutputStream("");
            InputStream is = new FileInputStream("");
            Scanner scanner = new Scanner("");
            try (os; is; scanner) {
                // os, is, scanner로 작업
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}