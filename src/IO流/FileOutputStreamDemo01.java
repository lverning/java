package IO流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author： 吕二宁
 * @date： 2021-08-25 16:08
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("G:IO流.txt");

        //void write(int b)：将指定的字节写入此文件输出流
        fos.write(97);
        fos.close();
    }
}
