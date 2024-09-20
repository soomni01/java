package ch18.lecture.p5filter;

import java.io.*;

public class C04Chain {
    public static void main(String[] args) throws IOException {
        String name = "C:/Temp/output54.txt";

        OutputStream os = new FileOutputStream(name);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        PrintWriter pw = new PrintWriter(osw);

        pw.println("hello world");

        pw.close();
        osw.close();
        os.close();
    }
}
