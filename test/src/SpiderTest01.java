import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @program:test
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 19:57
 */
public class SpiderTest01 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.jd.com");
        InputStream is = url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        String msg = null;
        while(null !=(msg = br.readLine())){
            System.out.println(msg);
        }
        br.close();
    }
}
