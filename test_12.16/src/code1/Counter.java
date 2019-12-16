package code1;

import java.util.zip.CheckedOutputStream;

/**
 * @program:test_12.16
 * @author: Nine_odes
 * @description:
 * @create:2019-12-16 19:37
 */
public class Counter {
    public static int num = 0;

    public Counter() {
        num ++;
        System.out.println("after new NO = " + num);
    }

    public static void delete(Counter o){
        num--;
        System.out.println("after delete No =  " + num);
        o = null;
        System.gc();//手工方式回收无用的对象
    }

    public static void main(String[] args) {
        Counter[] objs = new Counter[5];
        for(Counter obj : objs){
            obj = new Counter();
        }
        Counter.delete(objs[3]);
        Counter.delete(objs[0]);
    }
}
