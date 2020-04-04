package code3;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * @program:test_4.4
 * @author:Nine_odes
 * @description:
 * @create:2020-04-04 16:52
 **/

class OuterClass{
    public String s;
    public int age;


    /**
     * 面试问题：实力内部类中，是否可以定义static类型的属性？
     *      不能
     *      如果哟定义，必须是static final
     *      必须是编译时期确定的。
     *      为什么不是静态的？  因为static的初始化需要在编译的时候
     */
    class InnerClass{
        public String name = "jiuge";
        public static final int data = 30;
    }
}
public class TestDemo {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass  = new InnerClass();
    }
}
