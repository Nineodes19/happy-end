package io;

import java.io.File;

/**
 * @program:test_9.28
 * @author:Nine_odes
 * @description: 递归列出desktop目录中的全部组成
 * @create:2020-09-28 12:28
 **/
public class FileDemo3 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\简历\\");
        listAllFiles(file);
    }
    public static void listAllFiles(File file){
        if(file.isDirectory()){
            File[] result = file.listFiles();
            if(result != null){
                for (File file1 : result){
                    listAllFiles(file1);
                }
            }
        }else{
            System.out.println(file);
        }
    }
}
