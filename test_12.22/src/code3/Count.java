package code3;

import java.util.Scanner;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:
 * @create:2019-12-22 18:36
 */
public class Count {
    public static void main(String[] args){
        int countPositive = 0;
        int countNegative = 0;
        int num;
        Scanner sc = new Scanner(System.in);
        do{
            num = sc.nextInt();
            if(num > 0){
                countPositive++;
            }else if(num < 0){
                countNegative++;
            }
        }while(num != 0);
        System.out.println("The number of postivs is:" + countPositive);
        System.out.println("The number of negatives is :" + countNegative);
    }
}
