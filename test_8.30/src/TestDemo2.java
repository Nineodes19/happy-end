import java.io.File;
import java.io.IOException;

/**
 * @program:test_8.30
 * @author:Nine_odes
 * @description:
 * @create:2020-08-30 23:30
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        String path = "E:\\3.JavaWeb\\";
        String new_name = "demo1.txt";
        String pathname = path +new_name;

        File file = new File(pathname);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("文件" + pathname + "创建失败!!");
            }finally {
                System.out.println("文件已经创建！！");
            }
        }else{
            System.out.println("文件" + pathname + "已经存在，不需创建");
        }
    }
}
