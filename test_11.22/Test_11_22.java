// public class Test_11_22{
//     public static void main(String[] args){
//         // 6. 实现代码: 求斐波那契数列的第 N 项
//         // 1 1 2 3 5 8 13 21 34 
//         int n = 6;
//         int ret = Fib(n);
//         System.out.println(ret);

//     }

//     public static int Fib(int n){
//         if(n == 2){
//             retrun 1;
//         }
//         retrun Fib(n-1)+Fib(n-2);
//     }
// }

// public class Test_11_22{
//     static int nDisks = 3;
//     public static void main(String[] args){
//         // 7. 实现代码: 求解汉诺塔问题(提示, 使用递归)
//         doTower(nDisks,'A','B','C');

//     }

//     public static void doTower(int topN,char from, char inter,char to){

//         if(topN == 1){
//             System.out.public("Disk 1 from "+from+"to ",to);
//         }else{
//             doTower(topN - 1,from,to,inter);
//             System.out.println("Disk "+ topN+"from "+ from+"to "+to);
//             doTower(topN-1,inter,from,to);
//         }
//     }
// }


public class Test_11_22{
    public static void main(String[] args){
        //8. 实现代码: 青蛙跳台阶问题(提示, 使用递归)
        int a = 10;
        int ret = Jump(a);
        System.out.println(ret);
    }

    public static int Jump(int n){
        if(n <= 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }
        return (Jump(n - 1) + Jump(n - 2));
    }
}