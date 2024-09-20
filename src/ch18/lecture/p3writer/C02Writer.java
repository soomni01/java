package ch18.lecture.p3writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C02Writer {
    public static void main(String[] args) {
        // 바이트 단위 IO Stream
        // InputStream, OutputStream

        // 문자 전용 IO Stream
        // Reader, Writer

        String name = "C:/Temp/output32.txt";

        try {
            Writer writer = new FileWriter(name);
            try (writer) {
                writer.write('안');
                writer.write('녕');
                writer.write('A');
                writer.write('B');
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
