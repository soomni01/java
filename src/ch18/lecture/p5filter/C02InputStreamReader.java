package ch18.lecture.p5filter;

import java.io.*;

public class C02InputStreamReader {
    public static void main(String[] args) throws IOException {
        String name = "C:/Temp/output33.txt";
        InputStream is = new FileInputStream(name);
        int b1 = is.read();
        int b2 = is.read();
        int b3 = is.read();

        //
        Reader reader = new InputStreamReader(is);
        int c1 = reader.read();
        System.out.println("c1 = " + (char) c1);

        reader.close();
        is.close();
    }
}
