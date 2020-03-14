package collection;

import java.util.*;

/**
 * @program:test_3.14
 * @author:Nine_odes
 * @description:
 * @create:2020-03-14 11:39
 **/
public class TestDemo1 {


    public static void main(String[] args) {
        Collection<String> collection =  new ArrayList<>();
        System.out.println(collection.isEmpty());
        ((ArrayList<String>) collection).add("hello");
        ((ArrayList<String>) collection).add("jiuge");
        collection.remove("jiuge");
        collection.clear();
        Object[] arr = collection.toArray();
        System.out.println(Arrays.toString(arr));
    }
    public static void main2(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("血雨探花","花城");
        map.put("白衣祸世","白无相");
        map.put("黑水沉舟","贺玄");
        map.put("青灯夜游","戚容");
        map.put("太子悦神","谢怜");
        map.put("将军折剑","裴茗");
        map.put("少君倾酒","师青玄");
        map.put("公主自刎","雨师篁");

        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.print(entry.getKey() + ":");
            System.out.println(entry.getValue());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(map.get("太子悦神"));
        System.out.println(map.containsKey("神武大帝"));
        System.out.println(map.containsValue("君吾"));
        System.out.println(map.size());
        map.put("神武大帝","君吾");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.print("[" + entry.getKey() + ":");
            System.out.println(entry.getValue() + "]");
        }
    }
    public static void main1(String[] args){
        Collection<String> list = new ArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        System.out.println("添加字符串 i love you之后：");
        list.add("I");
        list.add("love");
        list.add("you");
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        //Object[] toArray():返回一个装有集合中元素的数组
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));

        //输出集合元素
        for(String s:list){
            System.out.print(s + " ");
        }

        System.out.println("删除集合元素I之后：");
        list.remove("I");
        System.out.println(list);

        list.add("love");
        System.out.println(list.remove("love"));
        System.out.println(list);

        System.out.println("clear之后的list是否为空：");
        list.clear();
        System.out.println(list.isEmpty());

    }
}
