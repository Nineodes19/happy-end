package io;

import java.io.File;
import java.io.IOException;

/**
 * @program:test_9.27
 * @author:Nine_odes
 * @description:
 * @create:2020-09-27 20:55
 **/
public class FileDemo2 {
    public static void main(String[] args) {
        String path = "E:\\java_code\\";
        String new_name = "demo.txt";
        String pathname = path+new_name;

        File file = new File(pathname);
        if(file.exists()){
            file.delete();
            System.out.println("文件" + pathname + "存在，删除之");
        }else{
            try {
                file.createNewFile();
                System.out.println("文件" + pathname + "不存在，创建它");
            } catch (IOException e) {
                System.out.println("文件" + pathname + "创建失败");
                e.printStackTrace();
            }
        }
    }
}
