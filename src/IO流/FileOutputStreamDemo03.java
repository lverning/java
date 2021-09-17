package IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author： 吕二宁
 * @date： 2021-08-25 16:33
 */
public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        //追加写入true
        FileOutputStream fos = new FileOutputStream("G:IO流.txt",true);
        //写数据
        for (int i = 0; i<10; i++){
            fos.write("吕二宁".getBytes());
            fos.write("\n".getBytes());//换行
        }
        fos.close();
    }
}
 