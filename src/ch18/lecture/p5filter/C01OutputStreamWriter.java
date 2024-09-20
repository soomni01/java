package ch18.lecture.p5filter;

import java.io.*;

public class C01OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        String name = "C:/Temp/output51.txt";
        OutputStream os = new FileOutputStream(name);
        os.write(0xEC);
        os.write(0x95);
        os.write(0x88);

        Writer writer = new OutputStreamWriter(os);
        writer.write("녕");

        writer.close();
        os.close();
    }
}
