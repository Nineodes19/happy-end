package io;

import java.io.File;

/**
 * @program:test_9.27
 * @author:Nine_odes
 * @description:
 * @create:2020-09-27 20:34
 **/
public class FileDemo {
    public static void main(String[] args) {
        String path = "E:\\java_code\\";
        String name = "demo.txt";
        String pathname = path + name;

        File file = new File(pathname);
        boolean res = file.exists();
        System.out.println("文件" + pathname + "是否存在：" +res);

        res = file.isDirectory();
        System.out.println("文件" + pathname + "是目录吗？" + res);

        res = file.isFile();
        System.out.println("文件" + pathname + "是文件吗?" + res);

        file.delete();
        if(!file.exists()){
            System.out.println("删除文件成功！");
        }else{
            System.out.println("删除文件失败！");
        }
        res = file.exists();
        System.out.println("文件" + pathname + "是否存在：" +res);
    }
}
