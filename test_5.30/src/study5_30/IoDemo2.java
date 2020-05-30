package study5_30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program:test_5.30
 * @author:Nine_odes
 * @description:
 * @create:2020-05-30 16:21
 **/
//拷贝图片
    //图片是一个二进制文件
    //读取图片中的每个字节，写入道一个新文件中
public class IoDemo2 {

    /**
     * 流对文件的操作不仅仅是读和写两个操作，其实还有两个操作
     * 打开：先打开之后，才能读写（构造InputStream/OutPutStream对象相当于是打开）
     * 关闭：读写完毕之后需要关闭（对象被回手或者显示调用close相当于关闭）
     *
     * 主流的编程语言对于文件的操作都是这四个典型步骤
     */

    //IOException是FileOutException的父类
    public static void copyImage(){
        //打开文件,在构造方法中来指定打开哪个文件
        //可以用一个file文件来指定，也可以直接用一个路经字符串来指定
        //  对于InputStream来说，如果文件不存在，直接就会抛出异常
        //  对于OutputStream来说，如果文件不存在，就会尝试创建文件

        FileInputStream fileInputStream = null;

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("E:\\ideajpg\\007.jpg");
            fileInputStream = new FileInputStream("E:\\ideajpg\\001.jpg");
            //读取文件（E:\idea.jpg)
            // read()版本试试一次读一个字节，读到的内容会放到返回值中
            //read（byte[]）版本是一次读N个字节，N取决于byte[]的长度，会尽量尝试把数字填满
            //          byte[]相当于是用户指定的缓冲区，返回值表示实际读到的字节数，如果返回-1，表示读取完毕
            //read（byte[],int offset,int len）版本是针对上一个版本的加强版本
            byte[] buffer = new byte[1024];
            int len = 0;

            //这样的循环读取就能保证把整个文件读完
            //这个代码的含义是，先调用read，把返回值写入len变量中
            //再拿len和-1进行比较
//        while((len = fileInputStream.read(buffer)) != -1){
//
//        }

            //把文件内容写入到另一个新文件中
            while (true) {
                len = fileInputStream.read(buffer);
                if (len == -1) {
                    break;
                }
                fileOutputStream.write(buffer, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //读写完成之后，一定要关闭文件
            //关闭顺序无所谓
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException| NullPointerException e) {
                e.printStackTrace();
            }
        }


    }

    /**
     * -128 --》  +127
     *      0 ---》 255【一个字节能表示的范围】
     * -32768---》 +32767
     *      0——》65535【两个字节能表示的范围】
     * -21亿---》 +21亿
     *      0 --》 42亿9千万【四个字节能表示的范围】

     */

    public static void copyInage2(){
        try(FileInputStream fileInputStream = new FileInputStream("");
            FileOutputStream fileOutputStream = new FileOutputStream("")){
            byte[] buffer = new byte[1024];
            int len = 0;
            while((len = fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        copyImage();

    }
}
