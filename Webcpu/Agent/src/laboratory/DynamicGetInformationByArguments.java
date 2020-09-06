package laboratory;

// 1. hostname
// 2. interval      上报频率: 以秒为单位
// 3. server ip
// 4. server udp port
public class DynamicGetInformationByArguments {
    // args 中携带的就是运行程序时，传入的参数信息
    public static void main(String[] args) {
        String hostname;
        int interval;
        String serverHost;
        int serverPort;

        if (args.length < 4) {
            System.out.println("请按照 hostname, interval server-host, server-port 的顺序，传入运行时参数");
            return;
        }

        hostname = args[0];
        // TODO: 当传入的第二个参数不是数字格式时，会出现异常，未处理
        interval = Integer.parseInt(args[1]);
        serverHost = args[2];
        serverPort = Integer.parseInt(args[3]);

        System.out.println("hostname = " + hostname);
        System.out.println("interval = " + interval);
        System.out.println("server-host = " + serverHost);
        System.out.println("server-port = " + serverPort);
    }
}
