package io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @program:test_9.28
 * @author:Nine_odes
 * @description:
 * @create:2020-09-28 12:12
 **/
public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\java_code\\";
        String name = "demo.txt";
        String pathname = path + name;

        File file = new File(pathname);
        if(!file.exists()){
            file.createNewFile();
        }
        System.out.println("文件 " + name + "size: " + file.length());
        System.out.println("文件 " + name + "最近修改时间：" + new Date(file.lastModified()));


    }
}
