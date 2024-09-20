package ch18.lecture.p7file;

import java.io.File;

public class C03Mkdir {
    public static void main(String[] args) {
        // mkdir, mkdirs
        // : 디렉토리 만들기

        String path1 = "C:/Temp/fold1";
        File f1 = new File(path1);
        boolean exists = f1.exists();
        System.out.println("exists = " + exists);

        if (!exists) {
            f1.mkdir(); // 디렉토리 만들기
            System.out.println("디렉토리 생성됨");
        }
    }
}
