package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program:test_9.28
 * @author:Nine_odes
 * @description:
 * @create:2020-09-28 12:58
 **/
public class FileDemo4 {
    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("E:\\ideajpg\\001.jpg");

        //创建文件输出流以指定的名称写入文件
        FileOutputStream fout = new FileOutputStream("E:\\ideajpg\\055.jpg");
        int len = 0;
        byte[] buff = new byte[1024];
        while((len = fin.read(buff)) != -1){
            fout.write(buff,0,len);
        }
        fin.close();
        fout.close();
    }
}
