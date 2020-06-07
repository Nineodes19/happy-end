package day6;

import java.util.*;

/**
 * @program:test_6.7
 * @author:Nine_odes
 * @description:n个数里出现次数大于等于n/2的数
 * @create:2020-06-07 09:28
 **/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            Map<Integer,Integer> map = new TreeMap<>();
            String[] strs = sc.nextLine().split(" ");
            for (int i = 0; i < strs.length; i++) {
                int s = Integer.valueOf(strs[i]);
                if(map.containsKey(s)){
                    map.put(s,map.get(s) + 1);
                }else{
                    map.put(s,1);
                }
            }
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue() >= strs.length/2){
                    System.out.println(entry.getKey());
                }
            }
        }
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()/2-1));;

    }
}
