package method;

public class FiboHomeWork {
    public static void main(String[] args){
        int n = 50;
        long start = System.currentTimeMillis();
        System.out.println(fibo(n));
        long end = System.currentTimeMillis();
        System.out.println("递归函数耗时："+(end - start)+"ms");
        System.out.println(fiboNonMethin(n));
    }

    //实现代码：求斐波那契数列的第N项
    //1,1,2,3,5,8,13,21,34
    //f(1)= 1,f(2)= 1,f(3)=f(1)+f(2),...f(n) = f(n-1)+f(n-2)
    public static long fibo(int n){
        if(n==1){
            return 1l;
        }
        if(n == 2){
            return 1l;
        }
        //n >= 3
        return fibo(n-1)+fibo(n-2);
    }

    //实现代码：返回非递归方法耗时
    public static long fiboNonMethin(int n){
        //返回当前时间
        long start = System.currentTimeMillis();

        if(n == 1 || n == 2){
            return 1;
        }

        //n>=3
        else{
            long last1 = 1;
            long last2 = 1;
            long cur = 0;
            for (int i = 3; i <= n; i++) {
                cur = last1 + last2;//最新耗时
                last2 = last1;//f(n-2)的耗时等于f(n-1)的耗时
                last1 = cur;//f(n-1)的耗时等于f(n)的耗时----->即最新耗时
            }
            long end = System.currentTimeMillis();
            System.out.println("非递归耗时："+(end - start) +"ms");
            return cur;
        }
    }
}
