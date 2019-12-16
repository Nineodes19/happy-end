package code1;

import java.util.Scanner;

/**
 * @program:test_12.16
 * @author: Nine_odes
 * @description:
 * @create:2019-12-16 19:30
 */
public class BubbleSort {
    public static void main(String[] args) {
        //Scanner用户获取用户从控制台的输入
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];
        System.out.println("Please enter eight number:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();//通过nextInt方法依次读取用户输入数字并存入数组中
        }
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println("冒泡排序的结果是：");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "、 ");
        }
    }
}
