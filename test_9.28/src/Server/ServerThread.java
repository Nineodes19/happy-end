package Server;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @program:test_9.28
 * @author:Nine_odes
 * @description:
 * @create:2020-09-28 16:39
 **/
public class ServerThread implements Runnable {
    private int index;
    private Socket socket;

    public ServerThread(Socket socket,int index ) {
        this.index = index;
        this.socket = socket;
    }

    //任务是为一个用户提供服务
    @Override
    public void run() {
        try{
            try{
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                while(true){
                    String accept = in.readUTF();
                    System.out.println("第" + index + "个客户端发出消息：" + accept);
                }
            }finally {
                socket.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
