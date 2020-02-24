import java.util.Scanner;

/**
 * @program:test_2.24
 * @author:Nine_odes
 * @description:Sine 之舞
 * @create:2020-02-24 20:03
 **/
//最近FJ为他的奶牛们开设了数学分析课，FJ知道若要学好这门课，必须要有好的
//三角函数基本功，所以他准备和奶牛们做一个“Sine之舞”的游戏，寓教于乐，
//提高奶牛们的计算能力
//设An=sin(1-sin(2+sin(3-sin(4+...sin(n))...)
//Sn = (...(A1+n)A2+n-1)A3+...+2)An + 1
//FJ想让奶牛们计算Sn的值，请你帮助FJ打印出Sn的完整表达式，以方便奶牛们做题
//输入格式：仅有一个数：N<201
//输出格式：请输出响应的表达式Sn，以一个换行符结束。输出中不得含有多余的空格或换行、回车符
public class code2 {
    private static int m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        for (int i = 0; i < m-1; i++) {
            System.out.print("(");
        }
        Sn(1);
    }

    public static void An(int n,int k){
        if(n == k){
            System.out.print("sin(" + n );
        }else if (n % 2 != 0){
            System.out.print("sin(" + n + "-");
        }else{
            System.out.print("sin(" + n + "+");
        }

        if(n < k){
            An(n+1,k);
        }
        System.out.print(")");
    }
    public static void Sn(int n){
        An(1,n);
        if(n != m){
            System.out.print("+" + (m-n+1)+")");
        }else{
            System.out.print("+" + (m - n + 1));
        }
        if(n < m){
            Sn(n + 1);
        }
    }
}
