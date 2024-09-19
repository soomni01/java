package ch18.lecture.p2input;

import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;

public class c02inputStream {
    public static void main(String[] args) {
        String name = "C:/Temp/output6.txt";
        try (InputStream is = new FileInputStream(name)) {

            int r = 0;

            while ((r = is.read()) != -1) {
                System.out.println(r);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
