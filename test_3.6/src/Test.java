import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program:test_3.6
 * @author:Nine_odes
 * @description:
 * @create:2020-03-06 20:50
 **/
public class Test {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
//    HashMap<String,String>hashMap = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民男神","李现");
        map.put("国民老公","王思聪");

        map.put("及时雨","宋江");
        map.put("国民男神","九歌");//如果有两个相同的key，会覆盖掉原来的旧值

        System.out.println(map);
        String value = map.get("及时雨2");
        System.out.println(value);
        System.out.println(map.containsValue("及时雨2"));

        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.remove("及时雨"));


        Set<Map.Entry<String,String>> set = map.entrySet();
        System.out.println(set);


        System.out.println("=======Map.Entry======");
        //实际当中的使用方法
        for (Map.Entry<String,String> set2:map.entrySet()) {
            System.out.println(set2.getKey() + ": " + set2.getValue());
        }

        int[] array = new int[10];
        for (int a:array) {

        }
    }

}
