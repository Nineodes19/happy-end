package laboratory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-10-15 13:24
 **/
public class TCPServer {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8888)){
            //TCP状态 listen
            Socket socket = serverSocket.accept();
            //TCP状态 established

            InputStream inputStream = socket.getInputStream();
            //windows 终端的代码格式是gbk
            Scanner scanner = new Scanner(inputStream,"gbk");
            String cmdLine = scanner.next();
            //list
            //get<hostname>
            String[] group = cmdLine.split(" ");
            String command = cmdLine;
            if(group.length >1){
                command = group[0];
            }

            System.out.println(command);

            Writer writer =new OutputStreamWriter(socket.getOutputStream(),"gbk");
            if(command.equals("list")){
                //
                List<String> hostnameList = new ArrayList<>();
                hostnameList.add("windows-1");
                hostnameList.add("linux-1");

                StringBuilder response = new StringBuilder();
                for(String hostname : hostnameList){
                    response.append(hostname);
                    response.append("\r\n");
                }
                writer.write(response.toString());
                writer.flush();
                socket.close();
            }else if(command.equals("get")){
                //因为要不停的给对方推消息，会影响当前线程的工作
                //所以创建新的线程去执行
                Thread thread = new Thread(()->{
                    try{
                        //没秒给对方发送
                        while(true){
                            writer.write("你好\r\n");
                            writer.flush();
                            TimeUnit.SECONDS.sleep(1);
                        }
                    }catch (IOException | InterruptedException e){
                        e.printStackTrace();
                        //发生了IOException，代表一定是对方出错了或者关闭链接了
                        //代表的意思就是对方退订了，不需要继续查看信息了，则我们关闭链接
                        try{
                            socket.close();
                        }catch (IOException e1){
                            e1.printStackTrace();
                        }
                    }
                });
                thread.start();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
