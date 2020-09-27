/**
 * @program:test_9.27
 * @author:Nine_odes
 * @description:
 * @create:2020-09-27 10:08
 **/
import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        /*
        a条领带m
        b条裤子n
        c个帽子o
        d件衬衫p
        m+p = e
        n+p = f
        o+p = g
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//领带
        int b = sc.nextInt();//裤子
        int c = sc.nextInt();//帽子
        int d = sc.nextInt();//衬衫
        int e = sc.nextInt();//领带+衬衫
        int f = sc.nextInt();//裤子+衬衫
        int g = sc.nextInt();//帽子+衬衫
        int max = Math.max(e,Math.max(f,g));
        int maxsecond = 0;
        int ret = 0;
        if(max == e){
            maxsecond = Math.max(f,g);
            ret += Math.min(a,d) * e;
            if(d - Math.min(a,d) > 0){
                if(maxsecond == f)
                    ret += Math.min(c,(d - Math.min(a,d))) * f;
                else
                    ret += Math.min(c,(d - Math.min(a,d))) * g;
            }
        }else if(max == f){
            maxsecond = Math.max(e,g);
            ret += Math.min(b,d) * f;
            if(d - Math.min(b,d) > 0){
                if(maxsecond == e)
                    ret += Math.min(c,(d - Math.min(b,d))) * e;
                else
                    ret += Math.min(c,(d - Math.min(b,d))) * g;
            }
        }else{
            maxsecond = Math.max(e,f);
            ret += Math.min(c,d)*g;
            if(d - Math.min(c,d) > 0){
                if(maxsecond == e)
                    ret += Math.min(c,(d - Math.min(c,d))) * e;
                else
                    ret += Math.min(c,(d - Math.min(c,d))) * f;
            }
        }
        System.out.println(ret);
    }
}
