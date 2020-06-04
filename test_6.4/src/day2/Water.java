package day2;

/**
 * @program:test_6.4
 * @author:Nine_odes
 * @description:汽水瓶
 * @create:2020-06-04 11:49
 **/

import java.util.Scanner;

/**
 * 输入       输出
 * 1           0
 * 2           1
 * 3           1
 * 4           2   3空--》1满  喝1共2空，借1 喝1 三空---》1 满还
 * 10          5
 * 81          40
 *
 * ①n/3 == 0    输出   n / 2
 * ②
 */
public class Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            System.out.println(n / 2);

        }

    }
}
