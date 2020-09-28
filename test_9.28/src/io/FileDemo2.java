package io;

import java.io.File;

/**
 * @program:test_9.28
 * @author:Nine_odes
 * @description:
 * @create:2020-09-28 12:24
 **/
public class FileDemo2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\简历");
        if(file.exists() && file.isDirectory()){
            //将file目录中的所有内容名称存储到File数组中
            File[] result = file.listFiles();
            for(File file2 : result){
                System.out.println(file2);
            }
        }
    }
}
