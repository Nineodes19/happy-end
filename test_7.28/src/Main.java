import java.util.*;

/**
 * @program:test_7.28
 * @author:Nine_odes
 * @description:
 * @create:2020-07-28 15:14
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        Map<Integer,Integer> map = new HashMap<>(size);
        LinkedList<Integer> list = new LinkedList<>();
        while(sc.hasNextLine()){
            String[] string = sc.nextLine().split(" ");
            if(string[0].equals("p")){
                int key = Integer.parseInt(string[1]);
                int value = Integer.parseInt(string[2]);
                if(!map.containsKey(key)){
                    map.put(key,value);
                    list.addLast(key);
                    if(list.size() > size){
                        map.remove(list.removeFirst());
                    }
                }else{
                    //map中不包含该元素
                    map.put(key,value);
                }
            }else{
                //第一个字符是“g”，代表执行get操作
                int key = Integer.parseInt(string[1]);
                if(!map.containsKey(key)){
                    System.out.println(-1);
                    continue;
                }else{

                    System.out.println(map.get(key));
                }
                //但是此时并没有删除list中最近最少使用的元素
                //在这里，“使用”是指新插入或者获取key
                //插入新元素前，将最近最少使用的元素删除
                Iterator<Integer> iterator = list.iterator();
                while(iterator.hasNext()){
                    if(key == iterator.next()){
                        //当下一个元素是key时，将其删除，并加到list的最近添加中
                        iterator.remove();
                    }
                }
                list.add(key);
            }
        }
        sc.close();
    }
}
