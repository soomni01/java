package ch18.lecture.p1io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C03OutputStream {
    public static void main(String[] args) {
        String name = "C:/Temp/output3.txt";
        OutputStream os = null;
        try {
            os = new FileOutputStream(name);

            os.write(33);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 생성된 스트림을 사용 완료 후 꼭 닫아야함
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}