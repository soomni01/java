package ch19.lecture.p1network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C02Computer1 {
    public static void main(String[] args) throws Exception {
        // server
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept(); // 기다림...

        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        try (bw; osw; os; socket; serverSocket) {
            bw.write("안녕 클라이언트!!");
            bw.flush();
        }

    }
}
