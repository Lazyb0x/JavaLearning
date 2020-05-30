package io.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 将一个文件压缩成ZIP文件
 * @author Lazyb0x
 *
 */
public class ZipPacking {
    public static void main(String[] args) {
        File file = new File("./README.md");

        FileInputStream fis = null;
        ZipOutputStream zos = null;

        try {
            fis = new FileInputStream(file);
            zos = new ZipOutputStream(new FileOutputStream("./mytest.zip"));
            // 创建压缩文件中的条目（对应压缩文件中的一个文件）
            System.out.println("entry: " + file.getName());
            ZipEntry entry = new ZipEntry("test/" + file.getName());
            // 将条目添加到压缩文件中
            zos.putNextEntry(entry);
            // 写入当前条目所对应的内容
            byte[] buff = new byte[1024];
            int len = 0;
            while((len = fis.read(buff)) != -1) {
                zos.write(buff, 0, len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                zos.close();
                System.out.println("压缩完成");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
