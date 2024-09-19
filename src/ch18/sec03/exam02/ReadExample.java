package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) throws IOException {
        try (InputStream is = new FileInputStream("C:/Temp/test2.db")) {

            byte[] data = new byte[100];

            while (true) {
                int count = is.read(data);

                if (count == -1) {
                    break;
                }

                for (int i = 0; i < count; i++) {
                    System.out.println(data[i]);
                }

            }
        }
    }
}