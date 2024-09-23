package ch19.lecture.p1network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class C02Computer2 {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("172.30.1.76", 9999);

        InputStream is = socket.getInputStream();
        // InputStreamReader는 문자 읽기 전용
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        try (br; isr; is; socket) {
            String line = br.readLine();
            System.out.println("line = " + line);
        }
    }
}
