package ch19.lecture.p1network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class C05Client {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("172.30.1.84", 9999);
        System.out.println("[연결됨!!]");

        // 키보드 입력을 server로 보내기
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
        PrintStream ps = new PrintStream(bos);

        Scanner scanner = new Scanner(System.in);

        try (scanner; ps; bos; os; socket) {
            System.out.println("이름 입력>");
            String name = scanner.nextLine();
            ps.println(name);
            ps.flush();

            while (true) {
                System.out.print(">");
                String input = scanner.nextLine();

                if (input.equals("종료")) {
                    break;
                }

                ps.println(input);
                ps.flush();
            }
            System.out.println("종료!!");
        }
    }
}
