package io;

import java.io.File;

/**
 * @program:test_9.28
 * @author:Nine_odes
 * @description:
 * @create:2020-09-28 12:09
 **/
public class FileDemo {
    public static void main(String[] args) {
        String path = "E:\\java_code\\";
        String dir_name = "demo_dir";
        String pathname = path + dir_name;

        File file = new File(pathname);
        if(!file.exists()){
            file.mkdir();
        }else{
            System.out.println("路径已经存在，不需创建");
        }
    }
}
