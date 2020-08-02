/**
 * @program:test_8.2
 * @author:Nine_odes
 * @description:坐标移动
 * @create:2020-08-02 18:05
 **/
import java.util.*;
/**
 * A表示向左移动
 * D表示向右移动
 * W表示向上移动
 * S表示向下移动
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            String[] strings = s.split(";");
            int x =0,y =0;
            for(String string:strings){
                if(string.charAt(0) == 'D' && string.substring(1).matches("[0-9]+"))
                    x += Integer.parseInt(string.substring(1));
                if(string.charAt(0) == 'W' && string.substring(1).matches("[0-9]+"))
                    y += Integer.parseInt(string.substring(1));
                if(string.charAt(0) == 'S' && string.substring(1).matches("[0-9]+"))
                    y -= Integer.parseInt(string.substring(1));
                if(string.charAt(0) == 'A' && string.substring(1).matches("[0-9]+"))
                    x -= Integer.parseInt(string.substring(1));
            }
            System.out.println(x+","+y);
        }
        sc.close();

    }
}
