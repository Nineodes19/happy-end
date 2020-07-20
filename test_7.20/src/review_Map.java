import java.util.*;
public class review_Map {
    public static void main(String[] args) {
        Map<String,String> mapDemo = new HashMap<>();

        //put()添加元素
        mapDemo.put("拳皇","大漠孤烟");
        mapDemo.put("枪王","一枪穿云");
        mapDemo.put("剑圣","夜雨声烦");
        mapDemo.put("斗神","一叶之秋");
        mapDemo.put(null,null);



        System.out.println("mapDemo中是否包含键“hello”：" + mapDemo.containsKey("hello"));
        System.out.println("mapDemo中是否包含值“夜雨声烦”： "+ mapDemo.containsValue("夜雨声烦"));

        for (Map.Entry<String,String> map : mapDemo.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }

        System.out.println(mapDemo);
    }
}
