package ch18.lecture.p3writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class C03Writer {
    public static void main(String[] args) {
        String name = "C:/Temp/output33.txt";

        try {
            Scanner scanner = new Scanner(System.in);
            Writer writer = new FileWriter(name);

            try (scanner; writer) {
                while (true) {
                    System.out.print("입력>");
                    String line = scanner.nextLine();

                    if (line.equals("종료")) {
                        break;
                    }

                    writer.write(line);
                    writer.write('\n');
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}