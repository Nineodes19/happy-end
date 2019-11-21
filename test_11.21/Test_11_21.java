// //写一个函数返回参数二进制中 1 的个数

// public class Test_11_21{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("请输入一个数字：");
//         while(sc.hasNextInt){
//             int num = sc.nextInt(0);
//             int ret = getNumBinCount(num);
//             System.out.println("num 为"+num+",其中二进制中1的个数为："+getNumBinCount);
//         }
//     }

//     public static int getNumBinCount(int n){
//         //用位运算 &
//         //相邻的两个整数之间二进制的最后一位一定不同
//         /**
//         11     10
//         1011 & 1010  = 1010(10) -----1
//         1010 & 1001  = 1000(8)  -----2
//         1000 & 0111  = 0000(0)  -----3
//          */
        
//         int count = 0;
//         while(n > 0){
//             count++;
//             n = n & (n-1);
//         }
//     }
// }

// public class Test_11_21{
//     public static void main(String[] args){
//         int n = 5;
//         int ret = factor(n);
//         System.out.println(ret);
//     }

    // public static int factor(int n){
    //     System.out.println("函数开始....");
    //     if(n == 1){
    //         System.out.println("函数结束。。 n = 1,ret = 1");
    //         return 1;
    //     }
    //     int ret = n * factor(n-1);
    //     System.out.println("函数结束。。 n = "+n+",ret = "+(n-1));
    //     return n * factor(n-1);
    // }

    //1.一定注意递归函数的语义，不要过分注意其运行过程。
    //
// }

// import java.util.Scanner;
// public class Test_11_21{
//     //实现代码：递归求1+2+3+...+10
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("请输入一个数字：");
//         while(sc.hasNextInt()){
//             int num = sc.nextInt();
//             int ret = Sum(num);
//             System.out.println("由1加到n的和为："+ret);
//         }  
//     }

//     public static int Sum(int n){
//         if(n == 1){
//             return 1;
//         }
//         return n + Sum(n-1);
//     }
// }

// import java.util.Scanner;
// public class Test_11_21{
//     //实现代码：写一个递归方法，输入一个非负整数，返回组成它的数字之和
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("请输入一个数字：");
//         int n = sc.nextInt();
//         if(n < 0){
//             System.out.println("输入错误，请重新输入！！！");
//         }
        
//         int ret = sum(n);
//         System.out.println(ret);
//     }

//     public static int sum(int n ){
//         if(n < 10){
//             return n;
//         }
//         return n %10 + sum(n /10);
//     }

// }

// import java.util.Scanner;
// public class Test_11_21{
//     //实现代码：按顺序打印一个数字的每一位

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("请输入一个数字：");
//         while(sc.hasNextInt()){
//             int num = sc.nextInt();
//             System.out.println("num的每一位是：");
//             Print(num);
//         } 
//     }
//     public static void Print(int n){
//         if(n > 9){
//             Print(n / 10);
//         }
//         System.out.println(n%10);
//     }
// }


// public class Test_11_21{
//     public static void main(String[] args){
//         //静态初始化
//         int[] num = new int[]{1,2,3,4,5};
//         //num.length
//         System.out.println(num.length);
//         System.out.println(num[0]);
//         num[2] = 10;
//         System.out.println(num[2]);
//     }
// }

public class Test_11_21{
    public static void main(String[] args){
        // int[] num = new int[]{1,2,3,4,5};
        // //num.length
        // System.out.println(num.length);
        // System.out.println(num[0]);
        // num[2] = 10;
        // System.out.println(num[2]);
        // num[5]= 5;
        // System.out.println(num[5]);//静态初始化

        // int[] num = new int [5];//动态初始化
        // System.out.println(num[0]);
        // System.out.println(num[4]);
        // System.out.println(num.length);

        // int[] num = new int[5];
        // System.out.println(num[0]);
        // float[] f = new float[5];
        // System.out.println(f[0]);
        // char[] c = new char[5];
        // System.out.println(c[0]+"t");
        // boolean[] b = new boolean[5];
        // System.out.println(b[0]);

        int[] num = new int[]{1,2,3,4,5};
        

        for(int i = 0; i < num.length;i++){
            if(i == 2){
                num[i]=10;
            }
        }
        System.out.println(num[2]);
        // for(int i:num){
        //     if(i ==2){
        //         i =10;
        //     }
        // }

        // for(int i :num){
        //     System.out.println(i);
        // }
        
    }
}