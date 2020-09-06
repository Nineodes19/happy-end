package laboratory;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


// 暂时使用OS自带的telnet软件作为客户端来验证
public class TCPServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            while (true) {
                // TCP 状态    LISTEN
                Socket socket = serverSocket.accept();  // 和 TCP 三次握手是啥关系
                // TCP 状态    ESTABLISHED

                InputStream inputStream = socket.getInputStream();  // 输入字节流
                Scanner scanner = new Scanner(inputStream, "gbk");  // windows 终端的编码格式是 gbk
                String cmdLine = scanner.nextLine();
                System.out.println(cmdLine);
                // list
                // get <hostname>
                String[] group = cmdLine.split(" ");
                String command = cmdLine;
                if (group.length > 1) {
                    command = group[0];
                }

                System.out.println(command);

                // 把输出字节流封装成输出字符流，方便下面的代码编写
                Writer writer = new OutputStreamWriter(socket.getOutputStream(), "gbk");

                if (command.equals("list")) {
                    // 如果是 list 的要求，则直接给出所有的hostname，并发送给对方，同时关闭连接
                    List<String> hostnameList = new ArrayList<>();
                    hostnameList.add("windows-1");
                    hostnameList.add("linux-1");

                    StringBuilder response = new StringBuilder();
                    for (String hostname : hostnameList) {
                        response.append(hostname);
                        response.append("\r\n");
                    }

                    writer.write(response.toString());
                    writer.flush();
                    socket.close();
                } else if (command.equals("get")) {
                    // 因为需要不停的给对方推消息，会影响我们当前线程的工作
                    // 所以创建新的线程去执行（使用了下 lambda 表达式）
                    Thread thread = new Thread(() -> {
                        try {
                            // 每秒给对方发送一个 你好
                            while (true) {
                                writer.write("你好\r\n");
                                writer.flush();
                                TimeUnit.SECONDS.sleep(1);
                            }
                        } catch (IOException | InterruptedException e) {
                            e.printStackTrace();

                            // 发生了 IOException，代表一定是对方出错了或者关闭连接了
                            // 代表的意思就是对方退订了，则我们才关闭连接
                            try {
                                socket.close();
                            } catch (IOException e1) {
                                e1.printStackTrace();
                            }
                        }
                    });
                    thread.start();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
