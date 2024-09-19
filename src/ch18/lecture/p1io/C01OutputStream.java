package ch18.lecture.p1io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01OutputStream {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Temp\\output1.txt";

        // 출력 스트림
        OutputStream os = new FileOutputStream(fileName);

        os.write(200); // 1byte
        os.write(100); // 1byte

        System.out.println("종료...");
    }
}
