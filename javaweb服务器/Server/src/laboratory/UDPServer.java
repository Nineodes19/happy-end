package laboratory;

import com.sun.xml.internal.bind.v2.TODO;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.*;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-09-29 08:35
 **/
public class UDPServer {

    private static class ReportData{
        String hostname;
        long timestamp;
        double percent;
    }
    private static Map<String,Queue<ReportData>> map = new Hashtable<>();
    //如何通过UDP Socket来实现接收数据
    //暂时存到Map<hostname,Queue<汇报上来的数据>>
    public static void main(String[] args) {

        try(DatagramSocket socket = new DatagramSocket(8888)){
            byte[] buffer = new byte[1024];//太大的话浪费空间，太小的话放不下
            //把buffer关联到一个创建好的DatagramPacket中
            while (true) {
                //把buffer中原来的数据清空掉
                Arrays.fill(buffer,0,buffer.length,(byte)0x0);

                DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);

                //调用receive进行数据的接收，该方法会一直阻塞，直到成功接受数据
                socket.receive(packet);

                //数据已经被装入道准备好的buffer中
                //1.如果关心数据来自哪个IP，哪个端口，怎么获取
                //2.真正受到多少数据
                String hostName = packet.getAddress().getHostName();
                int port = packet.getPort();
                int length = packet.getLength();

                //把数据从字节类型转为字符类型
                String message = new String(buffer,0,length,"UTF-8");
                String[] group = message.split("\\$");//在正则表达式中$有特殊含义，因此要先对其做转义操作String中，单斜杠也有转义含义，因此双斜杠表示一个$转义
//            TODO:完全没有考虑如果收到不符合标准格式的数据怎么办
                String hostname = group[0];
                long timestamp = Long.parseLong(group[1]);
                double percent = Double.parseDouble(group[2]);

                ReportData reportData = new ReportData();
                reportData.hostname = hostname;
                reportData.timestamp = timestamp;
                reportData.percent = percent;

                Queue<ReportData> queue = map.computeIfAbsent(hostname,k->new LinkedList<>());
//                if(queue == null){
//                    //第一次上报数据，还没有分配存储空间
//                    //因此需要申请空间
//                    queue = new LinkedList<>();
//                    map.put(hostName,queue);
//                }
                queue.offer(reportData);
                for(Map.Entry<String,Queue<ReportData>> entry : map.entrySet()){
                    System.out.println(entry.getKey() +":");
                    System.out.println(entry.getValue().size());
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
