import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:test_3.12
 * @author:Nine_odes
 * @description:
 * @create:2020-03-12 08:54
 **/
public class Demo1 {

    public static void main(String[] args) {
        //输出数字1到10
        int num = 1;
        do {
            System.out.print(num + " ");
            num ++;
        }while(num <= 10);
    }

    public static void main12(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要比较的两个字符串：");
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(s1.compareTo(s2));
        }

        int num = 1;
        while(num <= 10){
            System.out.print(num + " ");
            num ++;
        }

        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
    }

    public static void main11(String[] args) {
        String s = "welcome to the world";
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        if(s.contains(arr)){
            System.out.println("包含该字符串" );
        }else {
            System.out.println("查无此字符串");
        }
    }

    public static void main10(String[] args) {
//        String arr = "hello the world";
//        String[] arr1 = arr.split(" ");
//        for (String x:arr1) {
//            System.out.print(x);
//        }

        String arr = "hello the world";
//        System.out.println(arr.replace("the","___"));
//
//        System.out.println(arr.indexOf("world"));
//        System.out.println(arr.indexOf("happy"));
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(arr.indexOf(s)!= -1){
            System.out.println("找到");
        }else{
            System.out.println("没找到");
        }

    }

    /**
     * 输入一个数，计算它的阶乘
     * @param args
     */
    public static void main9(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要计算阶乘的数：");
        int temp = 1;
        while(sc.hasNext()){
            int x = sc.nextInt();
            if(x < 0){
                System.out.println(x + "没有阶乘，请重新输入！！");
                break;
            }
            for(int i = 1; i <= x; i++){
                temp *= i;
            }
            System.out.println(x + "! = " + temp);
        }

    }

    /**
     *计算1-100的和
     * @param args
     */
    public static void main8(String[] args) {
        int temp = 0;
        for (int i = 0; i <101 ; i++) {
            temp += i;
        }
        System.out.println(temp);

        int n = 1;
        int result = 0;
        while(n <=100){
            result+= n;
            n++;
        }
        System.out.println(result);
    }

    /**
     * 打印1-10的数字
      * @param args
     */
    public static void main7(String[] args) {
//        for (int i = 1; i <=10 ; i++) {
//            System.out.print(i + " ");
//        }
        int num = 1;
        while(num <= 10){
            System.out.print(num + " ");
            num ++;
        }
    }

    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要判断的年龄");
        while(sc.hasNext()){
            int age = sc.nextInt();
            String temp ;
            if(age < 0){
                System.out.println("输入错误！");
                break;
            }
            if(age<=18){
                temp = "early youth";
            }else if(age >= 19 && age <= 28){
                temp = "youth";
            }else if(age > 28 && age <= 55){
                temp = "middle age";
            }else{
                temp = "ode age";
            }
            switch(temp){
                case "early youth":
                    System.out.println(age + "岁是少年人");
                    break;
                case "youth":
                    System.out.println(age + "岁是青年人");
                    break;
                case "middle age":
                    System.out.println(age + "岁是中年人");
                    break;
                case "ode age":
                    System.out.println(age + "岁是老年人");
                    break;
                default :
                    break;
            }
        }
    }

    /**
     * 根据day值输出星期
     * @param args
     */
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入day值");
        while(sc.hasNext()){
            int day = sc.nextInt();
            switch(day){
                case 1:
                    System.out.println("星期一");
                    break;
                case 2:
                    System.out.println("星期二");
                    break;
                case 3:
                    System.out.println("星期三");
                    break;
                case 4 :
                    System.out.println("星期四");
                    break;
                case 5 :
                    System.out.println("星期五");
                    break;
                case 6:
                    System.out.println("星期六");
                    break;
                case 7:
                    System.out.println("星期天");
                    break;
                default :
                    System.out.println("输入有误！！");
                    break;
            }
        }
    }

    public static void main4(String[] args) {
        int x = 10;
        int y = 10;
        if(x == 1)
            if(y == 10)
                System.out.println("aaa");
        else
            System.out.println("bbb");

    }

    /**
     * 判断某一年份是否是闰年
     *实际闰年：年份是一百的倍数时，判断是否是400的倍数
     * 普通闰年：年份是四的倍数
     * @param args
     */
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要判断的年份：");
        while(sc.hasNext()){
            int y = sc.nextInt();
            if(y % 100 == 0){
                if(y % 400 == 0)
                    System.out.println(y + "是闰年");
                else
                    System.out.println(y + "不是闰年");
            }else{
                if(y % 4 == 0)
                    System.out.println(y + "是闰年");
                else
                    System.out.println(y + "不是闰年");
            }
        }
    }

    /**
     * 判定一个数字是正数还是负数
     * @param args
     */
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要判断的数：");
        while(sc.hasNext()){
            int m = sc.nextInt();
            if(m >= 0)
                System.out.println(m + "是正数。");
            else
                System.out.println(m + "是负数。");
        }
    }

    /**
     * 判断一个数字是奇数还是偶数
     * @param args
     */
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要判断的数字：");
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n <= 0){
                System.out.println("输入错误！！");
                break;
            }
            if(n % 2 == 0){
                System.out.println(n + "是偶数");
            }else{
                System.out.println(n + "是奇数");
            }
        }
    }
}
