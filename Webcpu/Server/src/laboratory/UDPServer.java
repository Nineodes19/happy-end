package laboratory;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class UDPServer {
    private static class ReportData {
        String hostname;
        long timestamp;
        double percent;
    }

    // 1. 如何通过 UDP Socket 实现接收数据
    // 2. 暂时存到 Map<hostname, Queue<汇报上来的数据>>
    private static Map<String, CycleQueue<ReportData>> map = new ConcurrentHashMap<>();

    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("开始清点档案柜");
                    for (Map.Entry<String, CycleQueue<ReportData>> entry : map.entrySet()) {
                        System.out.print(entry.getKey() + ": ");
                        System.out.println(entry.getValue().size());
                        try {
                            entry.getValue().pop();
                        } catch (RuntimeException e) {
                        }
                    }

                    TimeUnit.MILLISECONDS.sleep(50);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ReaderThread readerThread = new ReaderThread();
        readerThread.start();

        try (DatagramSocket socket = new DatagramSocket(8888)) {
            // 准备好一个接收数据的空桶（由于数据是字节形式的，所以我们准备 byte[]）
            byte[] buffer = new byte[1024]; // 太大浪费桶（空间），太小会放不下

            while (true) {
                // buffer 之前，需要先把 buffer 中原来的数据全部清 0/设置为 0x0
                Arrays.fill(buffer, 0, buffer.length, (byte)0x0);

                // 把 buffer 关联一个创建处的 DatagramPacket(数据报文)
                DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);

                // 调用 receive 进行数据的接收，该方法会一直阻塞，知道成功接受到数据
                socket.receive(packet);

                // 数据已经被装入我们准备好的桶之中(buffer)
                // 1. 如果我关心数据来自 哪个 ip，哪个 端口，怎么获取。
                // 2. 我真正收到了多少数据。

                // 1. 对方的 host 信息
                String remoteHost = packet.getAddress().getHostName();
                // 2. 对方的 port 信息
                int remotePort = packet.getPort();
                // 3. 接收到的数据的长度（字节为单位）
                int length = packet.getLength();

                System.out.printf("接受到来自 %s:%d 的数据，长度是 %d%n", remoteHost, remotePort, length);

                // 把数据从字节类型转成字符类型
                String message = new String(buffer, 0, length, "UTF-8");

                // 按照事先约定好的协议格式，拆开各个字段
                // 备注: split() 方法传入的参数含义其实是正则表达式
                // 在正则表达式中 $ 有特殊含义，所以需要先对其进行转义操作
                // 所以，分割字符是 \$
                // 又由于，"\" 本身就是转义含义，所以，通过 "\\" 表示一个 \
                String[] group = message.split("\\$");
                // TODO: 完全没有考虑如果收到不符合标准格式的消息怎么办？

                String hostname = group[0];
                long timestamp = Long.parseLong(group[1]);
                double percent = Double.parseDouble(group[2]);

                System.out.printf("收到的消息是: hostname = %s, timestamp = %d, percent = %f%n", hostname, timestamp, percent);

                ReportData reportData = new ReportData();
                reportData.hostname = hostname;
                reportData.timestamp = timestamp;
                reportData.percent = percent;

                CycleQueue<ReportData> queue = map.computeIfAbsent(hostname, k -> new CycleQueue<>(5));
                /*
                if (queue == null) {
                    // 第一次过来上报，柜子上还没有分配你的抽屉
                    // 所以，我们需要先申请抽屉，并放入柜子中
                    queue = new LinkedList<>();
                    map.put(hostname, queue);
                }
                */
                queue.push(reportData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
