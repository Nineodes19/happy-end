import java.util.Scanner;

/**
 * @program:test_2.25
 * @author:Nine_odes
 * @description:FJ的字符串
 * @create:2020-02-25 17:30
 **/
//FJ在沙盘上写了这样一些字符串：
//A1=“A”
//A2=“ABA”
//A3=“ABACABA”
//A4=“ABACABADABACABA”
//输入格式：仅有一个数：N<=26
//输出格式：请输出相应的字符串AN，以一个换行符结束。输出中不得含有多余的空格或换行、回车符
public class code3 {
    public static char[] c = {'A','B','C','D','E','F','G','H','I',
            'J','K','L','M','N','O','P','Q','R','S',
            'T','U','V','W','X','Y','Z'};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    //递归
    public static void print(int n){
        if(n == 1){
            System.out.print("A");
        }else{
            print(n - 1);//B
            System.out.print(c[n - 1]);
            print(n - 1);
        }
    }
}
