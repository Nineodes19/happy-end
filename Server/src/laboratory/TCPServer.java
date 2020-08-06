package laboratory;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            while (true) {
                // TCP 状态    LISTEN
                Socket socket = serverSocket.accept();  // 和 TCP 三次握手是啥关系
                // TCP 状态    ESTABLISHED

                InputStream inputStream = socket.getInputStream();
                Scanner scanner = new Scanner(inputStream, "UTF-8");
                String cmdLine = scanner.nextLine();
                // list
                // get <hostname>
                String[] group = cmdLine.split(" ");
                String command = cmdLine;
                if (group.length > 1) {
                    command = group[0];
                }

                System.out.println(command);

                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
