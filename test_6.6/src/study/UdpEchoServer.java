package study;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @program:test_6.6
 * @author:Nine_odes
 * @description:
 * @create:2020-06-06 14:42
 **/
public class UdpEchoServer {
    //创建一个服务器程序，首先需要一个Socket对象
    private DatagramSocket socket = null;

    //服务器程序启动的时候需要和哪个端口号关联起来
    public UdpEchoServer(int port) throws SocketException {
        //这个操作，不光把socket对象关联了一个端口号，同时也关联了一个IP地址
        //如果没有特殊指定IP的话，关联的IP相当于0.0.0.0
        //这个特殊IP的意思是关联到当前这个主机所有网卡的IP
        //主机上任何一个网卡收到的数据都是可能被当前的程序获取到的
        //大部分服务器启动的时候都应该要关联0.0.0.0
        socket = new DatagramSocket(port);

    }

    //实现服务器的启动逻辑
    public void start() throws IOException {
        System.out.println("服务器启动");
        //一般的服务器都是需要7*24小时持续工作的， 这个程序正常情况下是不会自己结束的
        while (true) {
            //在这个一直执行的主循环中，主要要执行以下逻辑：
            //1.读取请求并解析
            //      此处的读取过程就是被数据放到DatagramPacket对象中
            //      此处的解析过程很简单，把这个byte[]中的数据转成字符串
            DatagramPacket requestPacket = new DatagramPacket(new byte[4096],4096);
                //当服务器一启动的时候，就会立刻执行到receive，此时大概率客户端还没发数据过来呢
                //此时如果客户端发了数据过来，receive就能立刻把数据当道DatagramPacket的缓冲区中
                //如果没数据，此时receive方法就会阻塞
                //此时这个阻塞可能持续很久，一直到真正有客户端发数据过来
            socket.receive(requestPacket);
            //请求的解析过程getData()得到了内部的byte[]数组
            String request = new String(requestPacket.getData(),0,requestPacket.getLength()).trim();
            //2.根据请求计算响应【一些大型服务器，复杂主要就是复杂在第二部上】
            String response = process(request);
            //3.把响应结果写会给客户端
            //      此处也需要构造一个DatagramPacket对象
                    // 构造的时候需要把response中持有的数据内容保存的缓冲区
            DatagramPacket responsePacket = new DatagramPacket(
                    response.getBytes(),response.getBytes().length,requestPacket.getSocketAddress()
            );
            //1.指定数据报中的数据是啥
            //2.指定把这个包发给谁（谁是客户端就发给谁）

            socket.send(responsePacket);
            //加入一个日志，更方便用户来理解服务器的运行过程
            String log = String.format("[%s:%d] req: %s; resp: %s",
                    requestPacket.getAddress().toString(),requestPacket.getPort(),
                    request,response);
            System.out.println(log);

        }


    }
    public String process(String request){
        //回显服务器，客户端发啥，服务器返回啥
        return request;
    }

    public static void main(String[] args) throws IOException {
//        UdpEchoServer server = new UdpEchoServer(9090);
//        server.start();
//        class Student{
//            public String name = "jiuge";
//            public int age = 20;
//            public int height = 167;
//        }
//        Student student = new Student();
//        String s = String.format("[%s,%d,%d]",student.name,student.age,student.height);
//        System.out.println(s);
    }
}