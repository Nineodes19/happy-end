package code3;

import java.util.Scanner;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:
 * @create:2019-12-22 18:52
 */
public class ReceiveInput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scan.next();
        System.out.println("请输入你的年龄：");
        int age = scan.nextInt();
        System.out.println("请输入你的身高：");
        double stature = scan.nextDouble();
        System.out.println("数据接收完毕");
        System.out.println(age +"岁的"+ name + "在昨天晚上掉进了小区附近的河沟里，身高" +
                        stature+ "米的他，估计也无法承受这次感冒的困扰");
    }
}
