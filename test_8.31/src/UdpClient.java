import java.net.DatagramPacket;

/**
 * @program:test_8.31
 * @author:Nine_odes
 * @description:
 * @create:2020-08-31 23:49
 **/
public class UdpClient {
    //定义发送数据报的目的地
    public static final int DEST_PORT = 30000;
    public static final String DEST_IP = "127.0.0.1";
    //定义每个数据报的最大大小为4K
    private static final int DATA_LEN = 4096;
    //定义为接受网络数据的字节数组
    byte[] inBuff = new byte[DATA_LEN];
    //创建接受恢复数据的DatagramPacket对象
    private DatagramPacket packet_in = new DatagramPacket(inBuff,inBuff.length);
    //定义一个用于发送的DatagramPacket对象
    private DatagramPacket packet_out = null;


}
