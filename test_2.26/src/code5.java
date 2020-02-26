/**
 * @program:test_2.26
 * @author:Nine_odes
 * @description:龟兔赛跑
 * @create:2020-02-26 21:55
 **/

import java.util.Scanner;

/**
 * 兔子的速度v1，乌龟的速度v2，以及兔子对应的t，s值
 * 以及赛道的长度l，就能预测出比赛的结果
 * 输入格式：输入格式只有一行，包括空格隔开的五个正整数
 * v1，v2，t，s，l
 * 输出格式：输出包括两行，第一行输出比赛结果，大写字母T
 * 、R或者D，第二行输出一个正整数，表示获胜者到达终点所耗费的时间
 */
public class code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
            int sum1 =0,sum2 = 0,time = 1;
            for (int t = 0; t <= num[4]/num[0]; time++) {
                sum1+=num[0] * t;
                sum2+=num[1] * t;
                if(sum1 == num[4] || sum2==num[4])
                    break;
                if(sum1-sum2 >= num[2]){
                    sum2+=num[1] * num[3];
                    time+= num[3];
                }
            }
            if(sum2 > sum1){
                System.out.println("T");
                System.out.println(num[4] / num[1]);
            }else if(sum2 < sum1){
                System.out.println("R");
                System.out.println(time);
            }else{
                System.out.println("D");
                System.out.println(num[4]/num[1]);
            }
        }

    }
}
