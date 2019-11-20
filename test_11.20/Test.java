

// 13. 输出一个整数的每一位.

public class Test{
    public static void main(String[] args){
        int a = 123456;
        while(a > 0){
            System.out.print(a%10+" ");
            a /= 10;
        }
    }
}




