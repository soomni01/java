package ch18.exercise.p10;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {

            Reader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);

            try (br; in) {

                System.out.print("원본 파일 경로:");
                String sourceFileName = br.readLine();
                System.out.print("복사 파일 경로:");
                String copyFileName = br.readLine();

                File sourceFile = new File(sourceFileName);
                File copyFile = new File(copyFileName);

                if (sourceFile.exists()) {
                    // copyFile의 디렉토리가 없으면 만들기
                    File dir = copyFile.getParentFile();
                    if (!dir.exists()) {
                        dir.mkdirs();
                    }

                    // 복사
                    FileInputStream fis = new FileInputStream(sourceFile);
                    FileOutputStream fos = new FileOutputStream(copyFile);

                    BufferedInputStream is = new BufferedInputStream(fis);
                    BufferedOutputStream os = new BufferedOutputStream(fos);

                    try (os; is; fos; fis) {
                        is.transferTo(os);
                        os.flush();
                    }

                    System.out.println("복사가 성공되었습니다.");
                } else {
                    System.out.println("원본 파일이 존재하지 않습니다.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}