package ch18.lecture.p2input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C01InputStream {
    public static void main(String[] args) {
        String name = "C:/Temp/output6.txt";
        // InputStream : 입력 스트림
        try (InputStream is = new FileInputStream(name)) {
            int r1 = is.read(); // 1byte 읽기
            System.out.println("r1 = " + r1);
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read()); //  더이상 읽을 내용이 없을 때 -1


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
