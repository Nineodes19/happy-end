package io;

import java.io.File;
import java.io.IOException;

/**
 * @program:test_9.27
 * @author:Nine_odes
 * @description:
 * @create:2020-09-27 20:52
 **/
public class FileDemo1 {
    public static void main(String[] args) {
        String path = "E:\\java_code\\";
        String new_name = "demo1.txt";
        String pathname = path +new_name;

        File file = new File(pathname);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("文件"+ pathname + "创建失败");
                e.printStackTrace();
            }
        }else{
            System.out.println("文件" + pathname + "已经存在，不需要创建");
        }
    }
}
