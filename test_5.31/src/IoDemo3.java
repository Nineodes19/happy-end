import sun.awt.image.BufImgSurfaceData;

import java.io.*;

/**
 * @program:test_5.31
 * @author:Nine_odes
 * @description:
 * @create:2020-05-31 15:04
 **/
public class IoDemo3 {
    public static void main(String[] args) throws IOException {
        //1.打开文件读内容
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(
//                new FileInputStream("E:\\ideajpg\\004.jpg")
//        );
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
//                new FileOutputStream("E:\\ideajpg\\004_1.jpg")
//        );
//
//        //2.读取文件并写入道另一个文件，也可以用户指定一个缓冲区
//        byte[] buffer = new byte[1024];
//        int len = 0;
//        while((len = bufferedInputStream.read(buffer)) != -1){
//            bufferedOutputStream.write(buffer,0,len);
//        }
//        //3.关闭文件，释放资源
//        //  针对buffered版本的流对象进行关闭时，也会自动关闭
//        //  内部包含的InputStream和OutputStream对象
//        //  本质上我们是希望关闭动作释放文件描述符表中的对应表项
//        //  此处代码中BufferedInputStream和FileInputStream其实对应的是同一个文件，同一个表项
//        bufferedInputStream.close();
//        bufferedOutputStream.close();

        //为了处理异常，让代码更严谨，仍然可以使用try（）形式处理
        try(BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("E:\\ideajpg\\004.jpg"));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                    new FileOutputStream("E:\\ideajpg\\004_1.jpg"));
        ){

        }
    }
}
