import java.util.*;

/**
 * @program:test_5.12
 * @author:Nine_odes
 * @description:
 * @create:2020-05-12 16:21
 **/
public class TestDemo4 {
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String word: words){
            map.put(word,map.getOrDefault(word,0) + 1);
        }

        PriorityQueue<String> heap = new PriorityQueue<String>(
                (w1,w2) -> map.get(w1).equals(map.get(w2)) ?
                w2.compareTo(w1) : map.get(w1) - map.get(w2));
        for(String word:map.keySet()){
            heap.offer(word);
            if(heap.size() > k){
                heap.poll();
            }
        }
        List<String> ans = new ArrayList<>();
        while(!heap.isEmpty()){
            ans.add(heap.poll());
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        String[] arr = {"yexiu","jiuge","zhouzekai","yexiu","zhouzekai","yexiu",
                "huangshaotian","zhouzekai","haungshaotian","yexiu"};
        System.out.println(TestDemo3.topKFrequent(arr, 3));
    }
}
