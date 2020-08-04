/**
 * @program:test_8.3
 * @author:Nine_odes
 * @description: 计算日期到天数的转换
 * @create:2020-08-03 18:02
 **/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int y = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(out(y, m, d));
        }
    }
    private static int out(int y,int m,int d){
        int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(y <= 0 || m <= 0 ||m>12 || d <= 0 || d > day[m-1]){
            return -1;
        }
        if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
            day[1] = 29;
        }

        int sum = 0;
        for (int i = 0; i < m-1; i++) {
            sum+=day[i];
        }
        return sum+d;
    }
}
