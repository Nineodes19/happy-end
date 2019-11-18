// 1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)

// public class Test{
//     public static void main(String[] args){
//         int year = 100;
//         if(year<=18){
//             System.out.println("少年！");
//         }else if(year <= 28){
//             System.out.println("青年！");
//         }else if(year <= 55){
//             System.out.println("中年！");
//         }else {
//             System.out.println("老年！");
//         }
//     }
// }
// 2. 判定一个数字是否是素数

// public class Test{
//     public static void main(String[] args){
//         int m = 19;
//         int i = 0;
//         int j = 0;
//         for(i = 2; i < m; i++){
//             if(m%i == 0){
//                 j++;
//             }
//         }
//         if(j==0){
//             System.out.println(i);
//         }else{
//             System.out.println("不是素数！");
//         }
//     }
// }

// 3. 打印 1 - 100 之间所有的素数

// public class Test{
//     public static void main(String[] args){
//         int i = 0;
//         for(i = 1;i <= 100; i++){
//             int j = 0;
//             for(j = 2; j < i; j++){
//                 if(i%j == 0){
//                     break;
//                 }
//             }
//             //跳出for循环后j有两种可能，一种是for循环执行完毕，确定是素数(j>=i)
//             //另一种是直接break跳出，j<i(不是素数)
//             if(j >= i){
//                 System.out.print(i+" ");
//             }
//         } 
//     }
// }

// 4. 输出 1000 - 2000 之间所有的闰年

// public class Test{
//     public static void main(String[] args){
//         int year;
//         for(year = 1000; year <= 2000; year++){
//             if(((year%4==0) && (year%100!=0))){
//                 System.out.println(year);
//             }
//             else if(year%400 == 0){
//                 System.out.println(year);
//             }
//         }
//     }
// }

// 5. 输出乘法口诀表

// public class Test{
//     public static void main(String[] args){
//         int i;
//         int j;
//         for(i = 1; i<=9; i++){
//             for(j=1; j<=i; j++){
//                 System.out.print(i+"*"+j+"="+(i*j)+" ");   
//             }
//             System.out.println();
//         }
//     }
// }
// 6. 求两个正整数的最大公约数


// public class Test{
//     public static void main(String[] args){
//         int m = 15;
//         int n = 3;
//         int temp;
//         temp = m%n;
//         if(temp != 0){
//             m = n;
//             n =temp;
//             temp = m%n;
//         }
//         System.out.println(n);
//     }
// }
// 7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。

// public class Test{
//     public static void main(String[] args){
//         //1/1+1/2+1/3+1/4+......+1/99+1/100
//         int i = 0;
//         double n = 0.0;
//         int flag = 1;
//         for(i=1; i<=100; i++){
//             n+=(1.0/i)*flag;
//             flag = -flag;
//         }
//         System.out.println(n);
//     }
// }

// 8. 编写程序数一下 1到 100 的所有整数中出现多少个数字9。

// public class Test{
//     public static void main(String[] args){
//         //9 19 29 39 49 59 69 79 89 90 91 92 93 94 95 96 97 98 99
//         int i = 0;
//         int count = 0;
//         for(i=1; i<=100; i++){
//             if(i%10==9){
//                 count++;
//                 System.out.println(i);
//             }
//             if((i/10)%10==9){
//                 count++;
//                 System.out.println(i);
//             }  
//         }
//         System.out.println(count);
//     }
// }
// 9. 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本
// 身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)

// import java.lang.Math;
// public class Test{
//     public static void main(String[] args){
//         //pow(x,y)---->返回x的y次方
//         int i;
//         double a,b,c;
//         for(i=0; i<=999; i++){
//             a = i%10;
//             b = (i/10)%10;
//             c = i/100;
//             if(Math.pow(a,3.0)+Math.pow(b,3.0)+Math.pow(c,3.0)==i){
//                 System.out.println(i);
//             }
//         }
//     }
// }


