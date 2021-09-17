package IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author： 吕二宁
 * @date： 2021-08-25 16:16
 */
public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("G:IO.txt");

        //void write(int b):将指定的字节写入此文件输出流
//        fos.write(97);
//        fos.close();
        //void write(byte[] b):将b.length字节从指定字节数组写入此文件输出流
        byte[]bytes = "abcde".getBytes();//返回字符串对应的字节数组
        fos.write(bytes,1,3);//从1索引开始到长度3结束 bcd
    }
}
