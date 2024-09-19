package ch18.lecture.p1io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02OutputStream {
    public static void main(String[] args) throws IOException {
        String name = "C:/Temp/output2.txt";
        OutputStream os = new FileOutputStream(name);

        // int : 4bytes -21억~21억
        // byte : 1byte (-128~127)
        os.write(-128);
        os.write(201234567);

    }
}
