import sun.util.resources.cldr.agq.CalendarData_agq_CM;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @program:test_7.8
 * @author:Nine_odes
 * @description:
 * @create:2020-07-08 10:59
 **/
public class UdpEchoServer {
    //创建一个服务器程序，首先需要一个Socket对象
    private DatagramSocket socket = null;

    //服务器启动的手需要和哪个端口号联系起来

    public UdpEchoServer(int port) throws SocketException {
        socket = new DatagramSocket(port);
        //这个操作不光把socket对象关联了一个端口号，同时也关联了一个IP地址
        //如果没有指定IP地址，关联的IP相当于是0.0.0.0
        //这个特殊的IP的意思是关联到当前这个主机所有的网卡的IP
        // 一台主机可能有多个IP，
        //这个操作一旦成功，就意味着此时从当前关联的网卡中收到的数据，操作系统就会按照端口 号来筛选，一旦端口号匹配，操作系统
        //就会把对应的数据交给这个程序来处理

        //这个操作也是很可能失败的，例如一个端口号被多个程序尝试关联，此时只有第一个能成功，后面的就会失败。

    }

    //实现服务器的启动逻辑
    public void start() throws IOException {
        System.out.println("服务器启动！");
        //一般的服务器都是需要7*24小时 持续工作的，这个号程序正常情况下是不会自己结束的
        while(true){
            //在这个一直执行的主循环中，主要执行以下逻辑：
            //1.读取请求并解析

            //此处的读取过程就是把数据放到DatagramPacket对象中
            //此处的解析过程和你简单，就是把这个byte[]中的数据转化为字符串
            DatagramPacket requestPacket = new DatagramPacket(new byte[4096],4096);
            socket.receive(requestPacket);//当服务器一启动的时候，就会立刻执行到receive，此时大概率客户端还没发呢
            //此时如果客户端发了数据过来，receive就能立刻把数据放到DatagramPacket的缓冲区中，如果没数据，此时receive方法就会阻塞
            //此时这个阻塞可能持续很久，一直到真正有客户端发数据过来
            String request = new String(requestPacket.getData(),0,requestPacket.getLength()).trim();
            //requestPacket.getDAta()得到内部的byte[]

            //IO操作的特点就是如此
            //一次IO要分为两个过程：
            //1.等 这个等待过程是比较耗时的
            //2.拷贝数据


            //2.根据请求计算相应（一些大型服务器，复杂主要就是复杂在第二步）
            String response = process(request);

            //3.把响应结果写回给客户端
            //      此处也需要构造一个DatagramPacket对象
            //      构造的时候需要把response中持有的额数据内容对应的缓冲区，给设置到DatagramPacket中
            //      除了要构造内容之外，还需要传入一个“客户端”对应的地址和端口号
            DatagramPacket responsePacket = new DatagramPacket(
                    response.getBytes(),response.getBytes().length,requestPacket.getSocketAddress()
            );
            //requestPacket.getSocketAddress()指定发送给谁,谁是客户端就发给谁
            //一次通信需要涉及到源IP端口，目的ip，目的端口
            socket.send(responsePacket);
            //加入一个日志，更方便用户来理解服务器的运行过程
            String  log = String.format("[%s:%d]; req: %s; resp: %s\n",
                    requestPacket.getAddress().toString(),requestPacket.getPort(),
                    request,response);
            System.out.println(log);

        }
    }

    private String process(String request) {
        //当前做的事一个回显服务器，客户端发啥，服务器就返回啥
        return request;
    }

    public static void main(String[] args) throws IOException {
        UdpEchoServer server = new UdpEchoServer(9090);
        server.start();
    }
}
