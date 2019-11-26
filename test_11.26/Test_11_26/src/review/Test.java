package review;

import java.util.Scanner;

/**
 * @program:Test_11_26
 * @author: Nine_odes
 * @description:Array
 * @create:2019-11-26 19:55
 */
//public class Test {
    //递归求n的阶乘
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入n的值：");
//        while(sc.hasNext()){
//            int n = sc.nextInt();
//            System.out.println("n的阶乘是："+Sum(n));
//        }
//    }
//    public static int Sum(int n){
//        if(n == 1){
//            return 1;
//        }
//        return n + Sum(n-1);
//    }

    //按照顺序打印一个数字的每一位（例如1234打印出1 2 3 4）
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入n的值：");
//        while(sc.hasNext()) {
//            int n = sc.nextInt();
//            System.out.println("数n的每一位是：" );
//            Print(n);
//        }
//    }
//    //无返回值的递归函数，先写递归再写结束条件
//    public static void Print(int n){
//        if(n > 9){
//            Print(n/10);
//        }
//        System.out.print(n%10+" ");
//    }


    //递归求 1 + 2 + 3 + ... + 10
//    public static void main(String[] args) {
//        System.out.println(numSum(10));
//    }
//    public static int numSum(int n){
//        if(n == 1){
//            return 1;
//        }
//        return n + numSum(n-1);
//    }

    //写一个递归方法，输入一个非负整数，返回组成它的数字之和.
    // 例如，输入 1729, 则应该返回1+7+2+9，它的和是19
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入n的值：");
//        while(sc.hasNext()){
//            int n = sc.nextInt();
//            System.out.println("n的各位数之和是："+intSum(n));
//        }
//    }
//    public static int intSum(int n){
//        if(n < 10){
//            return n;
//        }
//        return n%10 +intSum(n/10);
//    }

    //求斐波那契数列的第N项
    //1 1 2 3 5 8 13
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入N的值：");
//
//        while(sc.hasNext()){
//            int N = sc.nextInt();
//            System.out.println("斐波那契数列的第"+N+"项是："+FiboArray(N));
//        }
//    }
//
//    public static int FiboArray(int n){
//        if(n == 1 || n == 2){
//            return 1;
//        }
//        return FiboArray(n-1) + FiboArray(n-2);
//    }

    //获取长度 & 访问元素
//    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        System.out.println("数组arr的长度为："+arr.length);
//        for (int x:arr) {
//            System.out.println(x);
//        }
//    }

    //打印数组内容
//    public static void main(String[] args) {
//        int arr[] = {2,4,6,8,10};
//        Print(arr,arr.length);
//    }
//    public static void Print(int[] array,int sz){
//        System.out.print("{");
//        for (int x = 0; x < sz; x++) {
//            if(x == sz-1){
//                System.out.print(array[x]+"}");
//            }else{
//                System.out.print(array[x]+", ");
//            }
//
//        }
//    }

    //写一个方法, 将数组中的每个元素都 * 2
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        doubleArr(arr,arr.length);
//        Print(arr,arr.length);
//        System.out.println();
//        System.out.println("数组arr的最大元素max ="+arrMax(arr,arr.length));
//        System.out.println("数组arr的最小元素min ="+arrMin(arr,arr.length));
//    }
//    public static void doubleArr(int[] array,int sz){
//        for (int i = 0; i < sz; i++) {
//            array[i] = 2 * array[i];
//        }
//    }

    //给定一个整型数组, 找到其中的最大元素 (找最小元素同理)
//    public static int arrMax(int[] array,int sz){
//        int max = array[0];
//        for (int i = 1; i < sz; i++) {
//            if(array[i]>=max){
//                max = array[i];
//            }
//        }
//        return max;
//    }

    //给定一个整型数组, 找到其中的最小元素
//    public static int arrMin(int[] array,int sz){
//        int min = array[0];
//        for (int i = 1; i < sz; i++) {
//            if(array[i]<=min){
//                min = array[i];
//            }
//        }
//        return min;
//    }
    //给定一个整型数组, 求平均值
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5,6,7,8,9,10};
//        int sz = arr.length;
//        System.out.println("数组arr各元素的平均值为："+Avgs(arr,sz));
//    }
//    public static double Avgs(int[] array,int sz){
//        double ret = 0.0;
//        for (int i = 0; i < sz; i++) {
//            ret += array[i];
//        }
//        return ret/sz;
//    }

//}
