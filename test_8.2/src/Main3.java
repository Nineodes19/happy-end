/**
 * @program:test_8.2
 * @author:Nine_odes
 * @description:最小的K个数
 * @create:2020-08-02 20:00
 **/

import java.util.*;
public class Main3 {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < input.length; i++){
            if(list.contains(input[i])){
                continue;
            }
            list.add(input[i]);
        }
        Collections.sort(list);
        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i < k; i++) {

            l.add(list.get(i));
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,5,8,6,1,4,5,2,1};
        ArrayList<Integer>list = GetLeastNumbers_Solution(arr,4);
        System.out.println(list);
    }
}
