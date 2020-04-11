import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

/**
 * @program:test_4.11
 * @author:Nine_odes
 * @description:
 * @create:2020-04-11 22:17
 **/
public class TestDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民男神","李现");
        map.put("jiu","jiuge");
        //key和value的值可以为空
        map.put("null","null");
        System.out.println(map);

        String S = map.get("jiu");
        System.out.println(S);
        String s1 = map.get("bit");
        System.out.println(s1);

        map.remove("国民女神");
        System.out.println(map);
    }
}
