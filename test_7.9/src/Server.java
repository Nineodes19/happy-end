import com.sun.deploy.trace.SocketTraceListener;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program:test_7.9
 * @author:Nine_odes
 * @description:
 * @create:2020-07-09 23:32
 **/
public class Server {
    //端口号
    private static final int PORT = 9999;
    private static final String CHARSET = "UTF-8";

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        ExecutorService POOL = Executors.newCachedThreadPool();
        try{
            while(true){
                Socket socket = serverSocket.accept();
                POOL.submit(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            BufferedReader reader = new BufferedReader(
                                    new InputStreamReader(socket.getInputStream())
                            );
                            String httpLine = reader.readLine();
                            System.out.println("===" +httpLine);
                            String[] httpLineArray = httpLine.split(" ");
                            String requestMethod = httpLineArray[0];
                            String requestUri = httpLineArray[1];
                            String requestVersion = httpLineArray[2];
                            String requestHeader;
                            Map<String,String> headers = new HashMap<>();
                            while((requestHeader = reader.readLine()) != null &&
                                    requestHeader.length() != 0){
                                String[] headerArray = requestHeader.split(":");
                                headers.put(headerArray[0].trim(),headerArray[1].trim());
                            }
                            PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                                    socket.getOutputStream(),CHARSET),true);
                            String content;
                            if("/037".equals(requestUri)){
                                writer.println("HTTP/1.1 307 Temporary Redirect");
                                writer.println("Location:http://45.40.254.164");
                                content = "";
                            }else if("/404".equals(requestUri)) {
                                writer.println("HTTP/1.1 404 Not Found");
                                content = "<h1>没有找到资源</h1>";
                            }else {
                                writer.println("Http/1.1 200  ok");
                                content = "<h1>My Http Server</h1>";
                            }
                            writer.println("Content-Type:text/html;charset=utf-8");
                            writer.println("Content-Length:" + content.getBytes(CHARSET).length);
                            writer.println();
                            writer.println(content.toString());
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
