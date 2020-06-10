package io.file;

import java.io.File;
import java.io.IOException;

public class FilePath {
    public static void main(String[] args) throws IOException{
        File f = new File("..");
        // 返回构造方法传入的路径
        System.out.println(f.getPath());
        // 返回绝对路径
        System.out.println(f.getAbsolutePath());
        // 返回规范路径
        System.out.println(f.getCanonicalPath());
    }
}
