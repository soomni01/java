package ch18.lecture.p2input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C05Copy {
    public static void main(String[] args) {
        String original = "C:/Temp/짱구.jfif";
        String target = "C:/Temp/짱구2.jfif";

        try {
            InputStream is = new FileInputStream(original);
            OutputStream os = new FileOutputStream(target);
            try (is; os;) {
                byte[] data = new byte[100]; // 읽은 바이트(데이터) 저장
                int len = 0; // 읽은 바이트 수 저장

                while ((len = is.read(data)) != -1) {
                    os.write(data, 0, len);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
