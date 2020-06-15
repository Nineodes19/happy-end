package day11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program:test_6.14
 * @author:Nine_odes
 * @description:个位数统计（15）
 * @create:2020-06-14 10:27
 **/
public class Main {
    public static void add(Byte b){
        b = b++;
    }
    public static int[] exchangeAB(int[] AB) {
        // write code here
        int temp = AB[0] ^ AB[1];
        AB[0] = temp ^ AB[0];
        AB[1] = temp ^ AB[1];
        return AB;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2};
        System.out.println(Arrays.toString(exchangeAB(arr)));
    }
    public static void main3(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,null);
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a + " ");
        add(b);
        System.out.println(b);
    }
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] arr = new String[100];
            for(int i = 0; i < arr.length; i++){
                if(s.length() < 10){
                    arr[i] = s;
                }
                String s1 = s.substring(0,9);
                arr[i] = s1;
            }
            Map<Integer,Integer> map = null;
            for (int i = 0; i<arr.length; i++) {
                int n = Integer.parseInt(arr[i]);
                map = new HashMap<>();
                while(n / 10 != 0){
                    if(!map.containsKey(n % 10)){
                        map.put(n % 10,1);
                    }else{
                        map.put(n % 10,map.get(n%10)+1);
                    }
                    n/=10;
                    if(n < 10){
                        if(!map.containsKey(n)){
                            map.put(n ,1);
                        }else{
                            map.put(n ,map.get(n)+1);
                        }
                    }
                }
            }
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
