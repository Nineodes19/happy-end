import javax.sound.sampled.Line;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @program:test_9.22
 * @author:Nine_odes
 * @description:
 * @create:2020-09-22 16:56
 **/
public class TestDemo1 {
    private LinkedList<Integer> linkedList;
    private Map<Integer,Integer> map;

    private int max_size;
    private int cur_size = 0;

    public TestDemo1(int capacity){
        linkedList = new LinkedList<>();
        map = new HashMap<>();
        this.max_size = capacity;
    }

    //返回 key对应的value值
    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }
        int val = map.get(key);
        //将key从缓存链表中删除又重新加入是在更新数据
        //将key更新为最近使用数据
        Object o = key;
        linkedList.remove(o);
        linkedList.add(key);
        return val;
    }

    public void put(int key,int value){
        if(map.containsKey(key)){
            map.put(key,value);
            Object o = key;
            linkedList.remove(o);
            linkedList.addLast(key);
        }else{
            map.put(key,value);
            cur_size++;
            linkedList.addLast(key);
            if(cur_size > max_size){
                int temp = linkedList.removeFirst();
                map.remove(temp);
                cur_size--;
            }
        }
    }
}
