// import java.util.Scanner;
// public class Test1{
//     public static void main(String[] args){
//         System.out.println("请输入一个字符：");
//         try{
//             char c = (char)System.in.read();
//         }catch(Exception e){
//             System.out.println("出错了");
//         }
//         System.out.println(c);      
//     }
// }

// 10. 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输
// 入，最多输入三次。三次均错，则提示退出程序

// import java.util.*; // 需要导入 util 包

// public class Test{
//     public static void main(String[] args){
//         int i = 0;
//         char password[20] = {0};
//         for(i=0; i<3;i++){
//             Scanner sc = new Scanner(System.in);
//             System.out.println("请输入密码：");
//             String name = sc.nextLine();
//             if(strcmp(password,"123456") == 0){
//                 System.out.println("登录成功！");
//                 break;
//             }else{
//                 System.out.println("密码错误， 可以重新输入，最多输入三次！");
//             }
//         }
//         if(i == 3){
//             System.out.println("三次输入错误，退出！");
//         }
//     }
// }

// import java.util.*;
// public class Test1{
//     public static void main(String[] args){
//         int code = 30;
//         Scanner sc = new Scanner(System.in);
//         int typeNumber = 0;
//         while(sc.hasNextInt()){
//             typeNumber++;
//             int number = sc.nextInt();
//             if(number == code){
//                 System.out.println("登录成功！");
//                 break;
//             }
//             else{
//                 System.out.println("密码错误，请重新输入：");
//             }
//             if(typeNumber == 3){
//                 System.out.println("登录失败！");
//                 break;
//             }
//         }
//     }
// }
// 11. 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
// 12. 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。
// 13. 输出一个整数的每一位.

// public class Test1{
//     public static void main(String[] args){
//         int i = 12345678;
//         while(i > 0){
//             System.out.print(i%10+" ");
//             i /= 10;
//         }


//     }
// }
// 14. 完成猜数字游戏

//声明一个新的方法来实现两个整数相加

// public class Test1{
    
//     public static int add(int x,int y){
//         return x+y;
//     }

//     //声明一个不带返回值的方法
//     public static void  test(){
//         System.out.println("hello test");
//     }

//     public static void main(String[] args){
//         int a = 10;
//         int b = 20;
//         int result = add(a,b);
//         test();
//     }
// }


// public class Test1{
//     public static void main(String[] args){
//         //1!+2!+3!+4!+5！
//         long sum = 0;
//         for(int i = 1; i <= 5; i++){
//             long temp = jieCheng(i);
//             sum += temp;
//         }
//         System.out.println(sum);
//     }

//     //声明一个新方法来求出n！的值并返回
//     public static long jieCheng(int n){
//         long sum = 1;
//         for(int i = 1; i <= n; i++){
//             sum *= i;
//         }
//         return sum;
//     }
// }

// public class Test1{
//     public static void main(String[] args){
//         int x = 10;
//         int y = 20;
//         swap(x,y);
//         System.out.println(x+","+y);

//         int[] num = new int[] {10,20};
//         swap(num);
//         System.out.println(num[0]+","+num[1]);
//     }

//     public static void swap(int x,int y){
//         int temp = x;
//         x = y;
//         y = temp;
//     }

//     public static void swap(int[] arr){
//         int temp = arr[0];
//         arr[0] = arr[1];
//         arr[1] = temp;
//     }
// }

// public class Test1{
//     public static void main(String[] args){
//         test(1);
//         test(2);
//         test(3);
//     }

//     public static void test(int num){
//         if(num == 2){
//             return ;//结束方法调用
//         }
//         System.out.println(num);
//     }
// }

// public class Test1{
//     public static void main(String[] args){
//         int a = 10;
//         int b = 20;
//         int result = add(a,b);
//         System.out.println(result);
//         double x = 1.0;
//         double y = 2.0;
//         double ret = addDouble(x,y);
//         System.out.println(ret);
//     }

//     public static int add(int x,int y){
//         return x+y;
//     }

//     public static double addDouble(double x,double y){
//         return x+y;
//     }
// }

public class Test1{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int result = add(a,b);
        System.out.println(result);
        double x = 1.0;
        double y = 2.0;
        double ret = add(x,y);
        System.out.println(ret);
    }

    public static int add(int x,int y){
        return x+y;
    }

    public static double add(double x,double y){
        return x+y;
    }

    public static int add(int x,int y,int z){
        return x+y+z;
    }
}