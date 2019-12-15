import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program:test
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 20:25
 */
public class chatServer {
    public static void main(String[] args) {
        ServerSocket s = null;
        Socket sl;
        String sendString = "Hello Net World";
        OutputStream slout;
        DataOutputStream dos;
        try {
            s = new ServerSocket(5600);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while(true){
            try {
                sl = s.accept();
                slout = sl.getOutputStream();
                dos = new DataOutputStream(slout);
                dos.write(Integer.parseInt(sendString));
                slout.close();

                sl.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
