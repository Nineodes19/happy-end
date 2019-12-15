import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @program:test
 * @author: Nine_odes
 * @description:
 * @create:2019-12-15 20:10
 */
public class URLReader {
    public static void main(String[] args) {
        try {
            URL gis = new URL("http://www.cqe.edu.cn");
            BufferedReader in = new BufferedReader(new InputStreamReader(gis.openStream()));
            String line;
            while((line = in.readLine()) != null){
                System.out.println(line);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
