package study;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program:test_6.6
 * @author:Nine_odes
 * @description:
 * @create:2020-06-06 17:37
 **/
public class TcpEchoServer {
    private ServerSocket serverSocket = null;
    public TcpEchoServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }
    public void start() throws IOException {
        System.out.println("服务器启动");
        while(true){

            Socket clientSocket = serverSocket.accept();
            processConnect(clientSocket);
        }
    }

    private void processConnect(Socket clientSocket) {
        System.out.printf("[%s:%d] 客户端上线！\n",clientSocket.getInetAddress().toString(),clientSocket.getPort());
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))){
            String request = bufferedReader.readLine();
            if(request == null){
                System.out.printf("[%s:%d] 客户端下线！\n",clientSocket.getInetAddress().toString(),clientSocket.getPort());
                return;
            }
            String response = process(request);
            bufferedWriter.write(response+"\n");
            bufferedWriter.flush();
            String log = String.format("[%s:%d] 客户端下线！\n",clientSocket.getInetAddress().toString(),clientSocket.getPort());
            System.out.println(log);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private String process(String request) {
        return request;
    }
}
