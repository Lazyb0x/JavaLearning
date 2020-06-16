package network.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 简单的 TCP Socket 服务器
 * 来自 https://www.liaoxuefeng.com/wiki/1252599548343744/1305207629676577
 * @author Lazyb0x
 *
 */
public class SocketServer {
    public static void main(String[] args) throws IOException {
        // 监听端口
        ServerSocket ss = new ServerSocket(6666);

        for (;;) {
            // 等待建立连接
            Socket sock = ss.accept();
            System.out.println("connected from " + sock.getRemoteSocketAddress());
            Thread t = new Handler(sock);
            t.start();
        }
    }
}

class Handler extends Thread {
    Socket sock;

    public Handler(Socket sock) {
        this.sock = sock;
    }

    @Override
    public void run() {
        try (InputStream input = this.sock.getInputStream()) {
            try (OutputStream output = this.sock.getOutputStream()) {
                handle(input, output);
            }
        } catch (Exception e) {
            try {
                this.sock.close();
            }
            catch (IOException ioe) {
            }
        }
    }

    private void handle(InputStream input, OutputStream output) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));

        writer.write("hello\n");
        // 强制把缓冲区的内容发出去
        // 默认是缓冲区满了才会发
        writer.flush();

        for (;;) {
            String s = reader.readLine();
            if (s.equals("bye")) {
                writer.write("bye\n");
                writer.flush();
                break;
            }
            writer.write("OK: " + s + "\n");
            writer.flush();
        }
    }
}