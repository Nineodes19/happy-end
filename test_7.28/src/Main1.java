import org.omg.CORBA.INTERNAL;

import java.time.Year;
import java.util.*;

/**
 * @program:test_7.28
 * @author:Nine_odes
 * @description:木棒拼图
 * @create:2020-07-28 16:23
 **/
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };
        PriorityQueue<Integer> queue = new PriorityQueue<>(cmp);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int s = 0;
            for(int i = 0; i < n;i ++){
                int j = sc.nextInt();
                int l = sc.nextInt();
                if(j == 1){
                    queue.add(l);
                }else {
                    queue.remove(l);
                }
                s = queue.peek();
                List<Integer> list = new ArrayList<>(queue);
                if(list.size() >=3){
                    int len = 0;
                    for (int k = 0; k < list.size(); k++) {
                        len += list.get(i);
                    }
                    if((len-s)> s){
                        System.out.println("Yes");
                    }else {
                        System.out.println("No");
                    }
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}
