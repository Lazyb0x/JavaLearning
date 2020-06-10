package features.jdk7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * try(resource)的语法，只需要编写try语句，让编译器自动为我们关闭资源。
 * 假如 try(resource = ...) 中的对象实现了 java.lang.AutoCloseable 接口，
 * 就自动加上 finally 语句并调用 close() 方法。
 * 就像 C# 的 using 语句。
 * @author Lazyb0x
 *
 */
public class TryResource {
    public static void main(String[] args) throws IOException {
        try (InputStream input = new FileInputStream("./README.md")) {
            byte[] buffer = new byte[1000];
            int n;
            while ((n = input.read(buffer)) != -1) {
                System.out.println("read " + n + " bytes.");
            }
        }
        // 不用使用 input.close() 方法来关闭输入流了。
    }
}
