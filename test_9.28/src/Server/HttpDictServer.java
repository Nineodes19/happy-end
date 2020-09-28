package Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * @program:test_9.28
 * @author:Nine_odes
 * @description:
 * @create:2020-09-28 16:21
 **/
public class HttpDictServer {
    private static Map<String,String> maps= new HashMap<>();
    static{
        maps.put("dog","狗");
        maps.put("cat","猫");
        maps.put("fish","鱼");
        maps.put("bird","鸟");
        maps.put("pig","猪");
    }

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        System.out.println("服务器启动了。。。");
        boolean isShow = true;
        while(true){
            try{
                Socket client = server.accept();
                String clientName = client.getInetAddress().getLocalHost().toString();
                if(isShow){
                    System.out.println("客户端：" + clientName + "已连接到服务器");
                }
                isShow = false;
                BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

                String key = br.readLine();
                String value = maps.get(key);

                if(null != key){
                    if(null == value){
                        value = "default";
                        System.out.println("客户端输入的是：" + key + ",服务器返回的是默认值：default");
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
                        bw.write(value + "\n");
                        bw.flush();
                    }else{
                        System.out.println("客户端输入的是：" + key + ",服务器翻译后是：" + value);
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
                        bw.write(value + "\n");
                        bw.flush();
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
