import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program:test_5.31
 * @author:Nine_odes
 * @description:
 * @create:2020-05-31 15:38
 **/
public class IoDemo4 {
    public static void main(String[] args) {
        testNoBuffer();
    }

    private static void testNoBuffer() {
        long beg = System.currentTimeMillis();
        try(FileInputStream fileInputStream = new FileInputStream("E:\\ideajpg\\002.jpg");
            FileOutputStream fileOutputStream = new FileOutputStream("E:\\ideajpg\\002_1.jpg")){
            byte[] buffer = new byte[1024];
            int len = 0;
            while((len = fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
