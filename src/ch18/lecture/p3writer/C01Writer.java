package ch18.lecture.p3writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01Writer {
    public static void main(String[] args) {
        String name = "C:/Temp/output31.txt";

        try {
            OutputStream os = new FileOutputStream(name);
            try (os) {
                os.write(65); // 1byte 쓰기 A
                os.write(66); // 1byte 쓰기 B
                os.write('C');

                os.write(236);
                os.write(149);
                os.write(136);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
