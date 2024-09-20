package ch18.lecture.p4reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C01Reader {
    public static void main(String[] args) throws IOException {
        // Reader : 문자 전용 InputStream

        String name = "C:/Temp/output33.txt";
        Reader reader = new FileReader(name);
        int c1 = reader.read();

        System.out.println("c1 = " + c1);

        char c2 = (char) c1;
        System.out.println("c2 = " + c2);

        reader.close();
    }
}
