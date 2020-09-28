package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

/**
 * @program:test_9.28
 * @author:Nine_odes
 * @description:
 * @create:2020-09-28 16:45
 **/
public class StringClient {
    private String name = String.valueOf(new Random().nextInt(999999));

    public void chat(){
        try{
            Socket socket = new Socket("localhost",8080);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("请输入数据：");
                String send = sc.nextLine();
                out.writeUTF("客户端[" + name + "]:" + send);
                String accept = in.readUTF();
                System.out.println(accept);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new StringClient().chat();
    }
}
