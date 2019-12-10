import list.Node;
import list.SingleLinkedList;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @program:test_12.5
 * @author: Nine_odes
 * @description:
 * @create:2019-12-05 02:16
 */
public class Test {
//    public static void main(String[] args) {
//        int[] num = {1,2,3,4};
//        int[] newNum = Arrays.copyOf(num,3);
//        System.out.println(Arrays.toString(newNum));
//    }

//    public static void main(String[] args) {
//        int[] num = {1,2,3,4};
//        int[] newNum = new int[3];
//        System.arraycopy(num,2,newNum,1,2);
//        System.out.println(Arrays.toString(newNum));
//    }

//    public static void main(String[] args) {
//        //{1,2,3,4,0}-----> {1,0,2,3,4}将原数组的第二位往后移一位
//        int[] num = {1,2,3,4,0};
//        System.arraycopy(num,1,num,2,3);//拷贝一份往后走一位
//        num[1] = 0;
//        System.out.println(Arrays.toString(num));
//    }

//    public static void main(String[] args) {
//        int[] num = {1,2,3,4};
//        //{1,2,3,4}--->{1,3,4,0}
//        System.arraycopy(num,2,num,1,2);
//        num[3] = 0;
//        System.out.println(Arrays.toString(num));
//    }

//    public Test(){
//        System.out.print("1.");
//    }
//    {
//        System.out.print("2.");
//    }
//    static{
//        System.out.print("3.");
//    }
//
//    public static void main(String[] args) {
//        System.out.print("4.");
//        new Test();
//        new Test();
//        System.out.print("5.");
//    }

//    private String name;
//    private int age;
//
//    public Test(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Test{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        Test test = new Test("jige",18);
//        System.out.println(test);
//    }

//    public static void main(String[] args) {
//        //和C语言不同的是，Java中double也可以进行取模运算
//        double a = 11.5;
//        int b = 2;
//        System.out.println(a%b);
//    }

//    public static void main(String[] args) {
////        int a = 0;
////        //System.out.println(a++);
////        System.out.println(++a);
//
//        int a = 10;
//        int b = 20;
//        //关系运算符的表达式返回值都是boolean类型
//        System.out.println(a == b);//false
//        System.out.println(a != b);//true
//        System.out.println(a < b);//true
//        System.out.println(a > b);//false
//        System.out.println(a <= b);//true
//        System.out.println(a >= b);//false
//    }

//    public static void main(String[] args) {
////        int a =10;
////        int b = 20;
////        int c = 30;
////        //System.out.println(a < b && a > c);//false   同真为真，一假则假
//
////        int a =10;
////        int b = 20;
////        if(a > b && 10/0 == 0){
////            System.out.println("hehe");
////        }else{
////            System.out.println("haha");
////        }
//
//        int a = 10;
//        int b = 20;
//        if(a < b || 10/0 == 0){
//            System.out.println("hehe");
//        }else{
//            System.out.println("haha");
//        }
//    }

    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        s.addLast(5);
        Node newHead = s.reverse(s.getFirst());
        while(newHead != null){
            System.out.print(newHead.getData() + "、 ");
            newHead = newHead.next;
        }
        //s.print();
    }
}

