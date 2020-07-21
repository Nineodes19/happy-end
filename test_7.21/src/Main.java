

import java.util.*;

/**
 * @program:test_7.21
 * @author:Nine_odes
 * @description:
 * @create:2020-07-21 09:58
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if(map.get(arr[i]) % 2 != 0 && !list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        for (int lists:list) {
            System.out.print(lists+" ");
        }
    }
}
