/**
 * @program:test_7.19
 * @author:Nine_odes
 * @description: 年会抽奖
 * @create:2020-07-19 10:23
 **/

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            float m = deno(n);
            float z = miss(n);
            float ret = (z/m) *100;
            System.out.println(String.format("%.2f",ret) + "%");

        }
    }

    public static float deno(int n){
        float ret = 1;
        if(n == 0){
            return 1;
        }else if(n > 0){
            ret = n*(deno(n-1));
        }
        return ret;
    }

    public static float miss(int n){
        if(n == 2){
            return 1;
        }else{
            return (n-1)*(miss(n-1) + miss(n-2));
        }
    }
}
