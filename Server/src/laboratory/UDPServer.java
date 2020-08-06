package laboratory;

import javax.sql.DataSource;
import java.io.IOException;
import java.lang.management.OperatingSystemMXBean;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

/**
 * @program:Agent
 * @author:Nine_odes
 * @description:
 * @create:2020-07-30 21:11
 **/
public class UDPServer {
    //1.如何通过UDP Socket实现接收数据
    private static class ReportData{

    }
    //2.暂时存到Map<hostname,Queue<汇报上来的数据>>

    public static void main(String[] args) {
        try(DatagramSocket socket = new DatagramSocket(8888)){

            //1.准备好一个接收数据的空桶（犹豫数据是字节形式，准备byte[]
            byte[] buffer = new byte[1024];//太大浪费桶（空间），太小放不下

            Arrays.fill(buffer,0,buffer.length,(byte)0x0);
            //把buffer关掉一个创建处的DatagramPacket（数据报文）
            DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);

            //调用receive进行数据接受，该方法会一直阻塞，直到成功接收到数据
            socket.receive(packet);

            //数据已经被装入我们准备好的同中（buffer）
            //1.如果我关心数据来自哪个IP，哪个端口，怎么获取
            //2.我真正收到了多少数据

            //1.对方host信息
            String removehostname = packet.getAddress().getHostName();

            //对方的port信息
            int removeport = packet.getPort();

            //3.接受到的数据长度
            int length = packet.getLength();
            System.out.printf("接收道来自%s:%d的数据，长度是%d%n",removehostname,removeport,length);

            String message = new String(buffer,0,length,"UTF-8");
            //按照事先约定好的协议格式，拆开各个字段
            //备注：split方法传入的参数含义其实是正则表达式
            //在正则表达式中$有特殊含义，所以需要进行转义操作
            //所以，分割字符是\$
            //又犹豫，”\“本身就是转义，所以通过“\\"
            String[] group = message.split("\\$");
            //TODO：没有考虑如果收到不符合标准格式的消息怎么办
            String hostname = group[0];
            long timestamp = Long.parseLong(group[1]);
            double percent = Double.parseDouble(group[2]);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
