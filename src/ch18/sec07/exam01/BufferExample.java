package ch18.sec07.exam01;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws Exception {
        String origintlFilePath1 = "C:/Temp/짱구.jfif";
        String targetFilePath1 = "C:/Temp/targetFile1.jfif";

        FileInputStream fis = new FileInputStream(origintlFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);

        String originalFilePath2 = "C:/Temp/짱구.jfif";
        String targetFilePath2 = "C:/Temp/targetFile2.jfif";
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼 미사용:\t" + nonBufferTime + "ns");

        long bufferTime = copy(bis, bos);
        System.out.println("버퍼 사용:\t" + bufferTime + "ns");

        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }

    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();
        while (true) {
            int data = is.read();
            if (data == -1) break;
            os.write(data);
        }
        os.flush();
        long end = System.nanoTime();
        return (end - start);
    }
}
