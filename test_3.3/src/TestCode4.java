import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * @program:test_3.3
 * @author:Nine_odes
 * @description:
 * @create:2020-03-03 18:43
 **/
public class TestCode4 {

    /**
     * try需要注意的问题
     * finally 会抑制try中的return
     * finally会抑制catch当中的return
     * 我的结论是：以后千万不要在finally中写return语句
     * @param args
     */
    public static void main(String[] args) {
//        System.out.println(div(10,0));

        //受查异常 编译时期发生的异常 处理方式：一定要处理这个异常
//        FileInputStream fileInputStream = new FileInputStream("d:text/txt");

        try {
            FileInputStream fileInputStream = new FileInputStream("d:text/txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
    public static int div(int a,int b){
        try{
            int ret = a/b;
            return ret;
        }catch(ArithmeticException e){
            e.printStackTrace();
            return 88;
        }finally {
            return 100;
        }
    }

    /**
     * 手动抛出异常；
     * 1.可以是Java自身的
     * 2.也可以是自己定的异常（自定义异常
     * @param args
     */
    public static void main7(String[] args) {

        try {
            int ret = func(10,0);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        System.out.println("after");
    }
    //声明一个异常  方便方法的调用者去处理这个异常
    public static int func(int a,int b)throws ArithmeticException{
        if(b==0){
            throw  new ArithmeticException();
        }
        return a / b;
//        int[] array = null;
//        System.out.println(array[8]);
    }
    public static void main6(String[] args) {
//        try{
//            func();
//        }catch (NullPointerException e){
//            e.printStackTrace();
//        }
        //func();//最后只能交给JVM处理异常，程序会异常终止
        System.out.println("affter");
    }
    public static void main4(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        try{
//            int n = scanner.nextInt();
//            System.out.println(n);
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            scanner.close();
//        }


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
    }
    public static void main3(String[] args) {
        int[] array  = new int[3];
        try{
            System.out.println(array[2]);
            System.out.println("jiuge");
            //如果抛出的异常是Exception 不方便代码的阅读 不建议抛出这样的异常
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Exception::catch");
        }
    }
    public static void main2(String[] args) {
        int[] array = new int[3];
        try {
            array = null;
            System.out.println(array[2]);
            System.out.println("jiuge");
        }catch(ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println("ArrayIndexOutOfBoundsException::catch");
            e.printStackTrace();//打印异常信息栈
        }finally {
            System.out.println("不管是否发生异常，finally肯定会被执行的！");
            System.out.println("用于资源的释放，这里肯定会被执行的！");



        }
        System.out.println("after");
    }
    /**
     * 递归：
     * 1.调用自己本身
     * 2.要有一个趋近于终止的条件
     * 实际上需要再栈里面开辟内存
     * 栈----》大小，1M或者2M
     * */

    public static void main1(String[] args) {
        //func();
        //System.out.println(10/0);
//        int[] array = new int[3];
//        System.out.println(array[100]);

//        int[] array = null;
//        System.out.println(array.length);

        int[] array = new int[3];
        try {
            array = null;
            System.out.println(array[2]);
            System.out.println("jiuge");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException::catch");
            e.printStackTrace();//打印异常信息栈
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("NullPointerException::catch");
        }
        System.out.println("after");
    }
}
