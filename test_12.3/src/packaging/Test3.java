package packaging;

import array.Test;

/**
 * @program:test_12.3
 * @author: Nine_odes
 * @description:homework（实现交换两个变量的值）
 * @create:2019-12-03 15:25
 */
//class Swap{
//    int num1;
//    int num2;
//
//    public Swap(int num1,int num2){
//        this.num1 = num1;
//        this.num2 = num2;
//    }
//    public void show(){
//        int temp = num1;
//        num1 = num2;
//        num2 =temp;
//    }
//}
//public class Test3 {
//    public static void main(String[] args) {
//        Swap swap = new Swap(10,20);
//        System.out.println("num1 = "+swap.num1+",  num2 = "+swap.num2);
//        swap.show();
//        System.out.println("num1 = "+swap.num1+",  num2 = "+swap.num2);
//    }
//}

public class Test3{
    //num1和num2是成员变量，存储在堆上
    int num1 =10;
    int num2 = 20;

    public static void main(String[] args) {
        //new Test3()存储在栈中，test3存储在堆上
        Test3 test3 = new Test3();
        //swap(test3);
        System.out.println(test3.num1);
        System.out.println(test3.num2);
    }

    public static void swap(Test3 test3){
        int temp = test3.num1;
        test3.num1 = test3.num2;
        test3.num2 = temp;
    }
    public static void swap(int num1,int num2){
        int temp = num1;
        num2 = num1;
        num1 = temp;
    }
}
