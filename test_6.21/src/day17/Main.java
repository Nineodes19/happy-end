package day17;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * @program:test_6.21
 * @author:Nine_odes
 * @description:火车进站
 * @create:2020-06-21 15:53
 **/
public class Main {
    static ArrayList<String> l = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            l.clear();
            int N = sc.nextInt();
            int[] arr = new int[N];
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }
            train(arr,0,stack,"",0);
            Collections.sort(l);
            for (String str:l) {
                System.out.println(str);
            }
        }
    }

    /**
     *
     * @param arr 列车数
     * @param i 入栈次数
     * @param s
     * @param str
     * @param n 出栈次数
     */
    public static void train(int[] arr, int i, Stack<Integer> s, String str,int n){
        //当出栈次数等于列车数时，当前结果应为null
        if(n == arr.length){
            l.add(str);
        }
        //当栈不为空时，出栈，保存栈顶元素
        if(!s.empty()){
            int temp = s.pop();
            //在又一次出栈之后，入栈次数依旧为i，此时的出栈次数为n +1 ，循环train（）
            train(arr,i,s,str+temp + " ",n+1);
            s.push(temp);
        }
        //当入栈次数小于当前数组大小时，表示火车还未全部入栈，此时应进行入栈操作
        if(i < arr.length){

            s.push(arr[i]);//入栈
            train(arr,i+1,s,str,n);//入栈次数改变，循环
            s.pop();

        }
    }
}
