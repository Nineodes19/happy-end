import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

/**
 * @program:test
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 20:22
 */
public class chatClient {
    public static void main(String[] args) throws Exception{
        int c;
        Socket sl;
        InputStream slIn;
        DataInputStream dis;
        sl = new Socket("localhost",5600);
        slIn= sl.getInputStream();
        dis = new DataInputStream(slIn);
        String st = new String(dis.readUTF());
        System.out.println(st);
        slIn.close();
        sl.close();
    }
}
