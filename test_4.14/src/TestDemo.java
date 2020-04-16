import java.util.*;

/**
 * @program:test_4.14
 * @author:Nine_odes
 * @description:
 * @create:2020-04-14 16:14
 **/

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class TestDemo {


    public Node copyRandomList(Node head){

    }

    public static void main6(String[] args) {
        int[] arr = new int[]{4,2,1,5,2,1,4};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums){
        Set<Integer> set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        int ret = 0;
//        for (Integer val:set){
//            ret = val;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if(set.contains(nums[i])){
//                ret = nums[i];
//                break;
//            }
//        }
//        Iterator<String>it = set.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        Iterator<Integer> it = set.iterator();
        ret = it.next();
        return ret;
    }

    public static int singleNumber1(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum ^ nums[i];
        }
        return sum;
    }

    public static void main5(String[] args) {
        Random random = new Random();

        ArrayList<Integer> arrayList = new ArrayList();
        for(int i = 0; i < 10_0000; i ++){
            arrayList.add(random.nextInt(6_00));
        }
        HashMap<Integer,Integer> map = new HashMap();
        for(Integer key:arrayList){
            if(map.get(key) == null){
                map.put(key,1);
            }else{
                Integer val = map.get(key) ;
                map.put(key,val+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println("重复的数字：" + entry.getKey() + "重复的次数：" + entry.getValue());
        }
    }

    public static void main4(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <10_0000 ; i++){
            arrayList.add(random.nextInt(6_00));

        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer key : arrayList) {
            if(map.get(key) == null){
                map.put(key,1);
            }else{
                map.put(key,map.get(key) + 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            System.out.println("重复的数字："+ entry.getKey() + "重复的次数：" + entry.getValue());
        }
    }

    public static void main3(String[] args) {
        Random random = new Random();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <10_0000 ; i++) {
            arrayList.add(random.nextInt(6_0000));
        }

        Set<Integer> hashSet = new HashSet<>();
        for (Integer val : arrayList) {
            if(hashSet.contains(val)){
                System.out.println(val);
                return;
            }
            hashSet.add(val);
        }
    }

    public static void main2(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("hello");
        set.add("world");
        set.add(null);
        System.out.println(set);

        //迭代器    迭代器对象
        Iterator<String>it = set.iterator();
            while(it.hasNext()){
            System.out.println(it.next());
        }


    }

    public static void main1(String[] args) {
        Map<String,String>  map = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民男神","李现");
        map.put("斗神","一叶之秋");
        map.put("拳皇","大漠孤烟");
        map.put(null,"叶修");
        System.out.println(map);

        String s = map.get("斗神");
        System.out.println(s);

        System.out.println(map.getOrDefault("枪王","一枪穿云"));

        map.remove("国民男神");
        System.out.println("删除国民男神后的map:\n"+map);

        //entrySet()返回所有key-value映射关系系
        Set <Map.Entry<String,String>> set = map.entrySet();
        //将每一个key-value键值对看作整体放到set当中
        //Map.Entry<String,String>可以看做一个节点
        System.out.println(set);


        System.out.println("=========entrySet()常用方式=========");
        for(Map.Entry<String,String> entry : map.entrySet() ){
            System.out.println("Key: " + entry.getValue() + " value: " + entry.getValue());
        }




    }
}
