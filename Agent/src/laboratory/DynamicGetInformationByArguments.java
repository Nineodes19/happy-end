package laboratory;

/**
 * @program:Agent
 * @author:Nine_odes
 * @description:
 * @create:2020-07-30 19:45
 **/
public class DynamicGetInformationByArguments {
    //args中携带的是运行程序时传入的参数信息
    public static void main(String[] args) {
        String hostname;
        int interval;
        String serverHost;
        int serverPort;
        if(args.length < 4){
            System.out.println("请按照hostname，interval，serverHost，serverPort的顺序传入");
            return;
        }
        hostname = args[0];
        interval = Integer.parseInt(args[1]);
        serverHost = args[2];
        serverPort = Integer.parseInt(args[3]);
        System.out.println("hostname = " + hostname);
        System.out.println("interval = "+ interval);
        System.out.println("serverHost = " + serverHost);
        System.out.println("serverPort =" + serverPort);
    }
}
