package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @program:test_4.7
 * @author:Nine_odes
 * @description:
 * @create:2020-04-07 17:10
 **/
public class TestDemo {


    public static void main(String[] args) {
        Object o=new Object(){
            public boolean equals(Object obj){
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }
    public static void main1(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hello");

        map.put(1,"Hello");
        map.put(3,"java");
        map.put(2,"GH");
        System.out.println(map);
        System.out.println(map.get(99));
        System.out.println(map.get(2));
        for (Integer key:map.keySet()){
            System.out.println(key);
        }
        for (String value:map.values()){
            System.out.println(value);
        }

        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
