import java.io.File;
import java.io.IOException;

/**
 * @program:test_8.30
 * @author:Nine_odes
 * @description:
 * @create:2020-08-30 23:35
 **/
public class TestDemo3 {
    public static void main(String[] args) {
        String path = "E:\\3.JavaWeb\\";
        String new_name = "demo.txt";
        String pathname = path + new_name;
        File file = new File(pathname);
        if(file.exists()){
            file.delete();
            System.out.println("文件" + pathname + "存在，删除之");
        }else {
            try {
                file.createNewFile();
                System.out.println("文件" + pathname + "不存在，创建之");
            } catch (IOException e) {
                System.out.println("文件" + pathname + "创建失败");
                e.printStackTrace();
            }

        }
    }
}
