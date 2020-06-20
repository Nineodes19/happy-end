package day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program:test_6.19
 * @author:Nine_odes
 * @description:统计同成绩学生人数
 * @create:2020-06-19 19:22
 **/
public class Main1 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            if(N == 0){
                return;
            }
            int arr[] = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if(!map.containsKey(arr[i])){
                    map.put(arr[i],1);
                }else{
                    map.put(arr[i],map.get(arr[i]) + 1);
                }
            }
            int score = sc.nextInt();
            if(map.containsKey(score)){
                System.out.println(map.get(score));
            }else{
                System.out.println("0");
            }
        }
    }
}
