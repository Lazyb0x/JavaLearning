package io.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyFileInputStream {
    public static void main(String[] args) throws IOException {
        bufferRead();
    }

    /**
     * 逐个字节的读取
     * 
     * @throws IOException
     */
    public static void singleByte() throws IOException {

        InputStream input = null;

        try {
            input = new FileInputStream("./README.md");

            int n = 0;
            while ((n = input.read()) != -1) {
                System.out.print(n + " ");
            }
        } finally {
            if (input != null) {
                input.close();
            }
        }

        input.close();
    }

    public static void bufferRead() throws IOException {
        try (InputStream input = new FileInputStream("./README.md")) {
            byte[] buffer = new byte[1000];
            int n;
            // read(byte[] b, offser, length) 缓冲的字节数组，偏移量：数组开始记录的位置，长度：缓冲区的长度
            while ((n = input.read(buffer, 0, buffer.length)) != -1) {
                System.out.println("read " + n + " bytes.");
            }
        }
    }
}
