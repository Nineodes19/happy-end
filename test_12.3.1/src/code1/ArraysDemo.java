package code1;

import java.util.Arrays;

/**
 * @program:test_12.3.1
 * @author: Nine_odes
 * @description:Arrays类的基本使用
 * @create:2019-12-03 17:21
 */
public class ArraysDemo {
    public static void display(Integer[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[9];
        for (int i = 1; i < 10; i++) {
            array[i-1] = (int)(Math.random() * 100);
        }
        //显示，排序数组
        System.out.print("原内容：");
        display(array);
        Arrays.sort(array);
        System.out.print("排序后：");
        display(array);

        //将值-1分配给array中下标从0到3-1位置上的元素
        Arrays.fill(array,0,3,-1);
        System.out.print("执行fill()之后：");
        display(array);

        //值48的位置
        System.out.print("值48的位置：");
        int index = Arrays.binarySearch(array,48);
        System.out.println(index);

        Arrays.fill(array,99);
        display(array);
    }
}
