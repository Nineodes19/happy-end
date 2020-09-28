package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program:test_9.28
 * @author:Nine_odes
 * @description:
 * @create:2020-09-28 16:42
 **/
public class StringServer {
    public void service(){
        int i = 1;
        try{
            ServerSocket sercer = new ServerSocket(8080,3);
            while(true){
                if(i <= 3){
                    Socket socket = sercer.accept();
                    System.out.println("第" + i+ "个客户连接成功！");
                    new Thread(new ServerThread(socket,i)).start();
                    i++;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new StringServer().service();
    }
}
