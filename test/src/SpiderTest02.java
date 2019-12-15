import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @program:test
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 20:03
 */
public class SpiderTest02 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.dianping.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64;x64) AP");
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String msg = null;
        while(null != (msg = br.readLine())){
            System.out.println(msg);
        }
        br.close();

    }
}
