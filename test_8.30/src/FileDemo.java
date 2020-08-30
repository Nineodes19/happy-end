import java.io.File;

/**
 * @program:test_8.30
 * @author:Nine_odes
 * @description:
 * @create:2020-08-30 23:15
 **/
public class FileDemo {
    public static void main(String[] args) {
        String path = "E:\\3.JavaWeb\\";
        String name = "3.txt";
        String pathname = path+name;

        File file = new File(pathname);
        boolean res = file.exists();
        System.out.println("文件" + pathname + "是否存在：" + res);

        res = file.isDirectory();
        System.out.println("文件" + pathname + "是否是目录：" + res);

        res = file.isFile();
        System.out.println("文件" + pathname + "是否是文件：" + res);

        file.delete();
        if(!file.exists()){
            System.out.println("删除文件成功！！");
        }else{
            System.out.println("删除文件失败！！");
        }
    }
}
