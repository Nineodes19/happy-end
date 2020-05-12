
import java.util.*;

/**
 * @program:test_5.12
 * @author:Nine_odes
 * @description:
 * @create:2020-05-12 16:01
 **/
public class TestDemo3 {
    public static List<String> topKFrequent(String[] words, int k) {

        Map<String,Integer> map = new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0) + 1);
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(w1,w2) ->
            map.get(w1).equals(map.get(w2)) ? w1.compareTo(w2) :
            map.get(w2) - map.get(w1));

        return list.subList(0,k);
    }

    public static void main(String[] args) {
        String[] arr = {"yexiu","jiuge","zhouzekai","yexiu","zhouzekai","yexiu",
                        "huangshaotian","zhouzekai","haungshaotian","yexiu"};
        System.out.println(TestDemo3.topKFrequent(arr, 3));
    }
}
