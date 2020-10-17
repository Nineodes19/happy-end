/**
 * @program:test_10.17
 * @author:Nine_odes
 * @description:
 * @create:2020-10-17 19:54
 **/
/*
现在是在一个平行世界中，闰年计算方式一致。
但星期的开始日期并不一致，并且每个月少一天。
      17
      24 25 26 27 28
29 30 31
          1  2  3  4
5   6 7   8  9  10
                 17
                 24 25
26  27  28  29
*/
import java.util.*;
public class TestDemo1 {
    private static boolean isrun(int year){
        if(year % 100 == 0){
            if(year % 4 == 0){
                return true;
            }else {
                return false;
            }
        }else {
            //不是100的倍数
            if(year % 4 == 0){
                return true;
            }else{
                return false;
            }
        }
    }
    static int[] arr = new int[]{30,27,30,29,30,29,30,30,29,30,29,30};
    static int[] arr1 = new int[]{30,28,30,29,30,29,30,30,29,30,29,30};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int  day = 0;//用day来表示两天之间的天数差距
        if(Integer.parseInt(s[4])-Integer.parseInt(s[0]) > 1){
            Days(Integer.parseInt(s[4]),Integer.parseInt(s[0]));
        }

            if(isrun(Integer.parseInt(s[0]))){
                day+=arr[Integer.parseInt(s[1])] - Integer.parseInt(s[2]);
                for (int i = Integer.parseInt(s[1])+1; i <= 12; i++) {
                    day+=arr1[i];
                }
            }else{
                for (int i = Integer.parseInt(s[1])+1; i <= 12; i++) {
                    day+=arr1[i];
                }
            }


            if(isrun(Integer.parseInt(s[4]))){
                day+=Integer.parseInt(s[6]);
                for (int i =0 ; i < Integer.parseInt(s[5]); i++) {
                    day+=arr[i];
                }
            }else{
                for (int i =0 ; i < Integer.parseInt(s[5]); i++) {
                    day+=arr[i];
                }
            }
            int w1 = Integer.parseInt(s[3]);
            int w2 = (day%7+w1) % 7;
        System.out.println(w2);
    }

    private static int Days(int Ya,int Yb){
        int day = 0;
        while(Ya+1 < Yb){
            if(isrun(Ya+1)){
                day+=354;
            }else{
                day+=353;
            }
        }
        return day;
    }
}
