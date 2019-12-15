import java.net.MalformedURLException;
import java.net.URL;

/**
 * @program:test
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 19:52
 */
public class URLTest01 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.baidu.com:80/s/jsj.php");
        System.out.println("协议："+ url.getProtocol());
        System.out.println("域名|ip：" + url.getHost());
        System.out.println("端口:"+url.getPort());
        System.out.println("请求资源1：" + url.getFile());
        System.out.println("请求资源2：" + url.getPath());
    }
}
