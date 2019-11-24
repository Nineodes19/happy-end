package method;

import java.util.Scanner;

//public class HomeWork {
//    //写一个函数返回参数二进制中1的个数
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数字：");
//        while (sc.hasNext()){
//            int num = sc.nextInt();
//            int ret = getNumBinCount(num);
//            System.out.println("num为"+num+",其二进制中1的个数为："
//            +getNumBinCount(num));
//            System.out.println("请输入一个数字：");
//        }
//    }
//
//    //写一个函数返回参数二进制中1的个数
//    public static int getNumBinCount(int n){
//        /**
//         * 相邻两个整数之间二进制的最后一位一定不同
//         * 8-->9    9---->10   10--->11
//         * 11(3)    10
//         * 1011  & 1010 == 1010     1
//         * 1010  & 1001 == 1000     2
//         * 1000  & 0111 == 0000     3
//         *
//         * 6(2)    5
//         * 110  &  101 == 100     1
//         * 100  &  011 == 000     2
//         */
//
//        int count = 0;
//        while(n > 0){
//            count++;
//            n = n & (n-1);
//        }
//        return count;
//    }
//}

import java.util.Random;
import java.util.Scanner;
public class HomeWork{
    /**
     * 系统自动生成一个随机整数（1-100），然后由用户输入一个猜测的数字
     * 如果输入的数字比该随机数大，提示：低了
     * 如果输入的数字比该随机数小，提示：高了
     * 如果输入的数值和随机数相等，则提示：猜对了，并输出该数字
     * @param args
     */
    public static void main(String[] args){
        Random random = new Random();
        int guess = random.nextInt(1000);
//        System.out.println(guess);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type a number:");
        while(sc.hasNext()){
            int num = sc.nextInt();
            if(num < guess){
                System.out.println("The number is smaller!");
            }else if(num > guess){
                System.out.println("The number is bigger!");
            }else{
                System.out.println("Right！ This number is "+num);
                break;
            }
            System.out.println("Please type a number:");
        }
    }
}