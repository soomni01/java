package ch18.lecture.p7file;

import java.io.File;

public class C04Mkdirs {
    public static void main(String[] args) {
        // mkdirs 여러 폴더 한 번에 만들기
        String path = "C:/Temp/fold1/fold2/fold3/fold4/fold5";
        File f1 = new File(path);
        boolean exists = f1.exists();

        System.out.println("exists = " + exists);

        if (!exists) {
            f1.mkdirs();
            System.out.println("디렉토리 생성됨");
        }
    }
}
