package code2;

/**
 * @program:test_12.20
 * @author: Nine_odes
 * @description:
 * @create:2019-12-20 15:06
 */

class B{
    public B(){
        func();
    }
    public void func(){
        System.out.println("B.func()");
    }
}

class D extends  B{
    private int num = 1;
    public void func(){
        System.out.println("D.func()   " + num);
    }
}
public class Test2 {
    public static void main(String[] args){
        D d = new D();
        //构造D对象的同时，会调用B的构造方法
        //B的构造方法中调用了func方法，此时会触发动态绑定，会调用到D中的func
        //此时D对象自身还没有构造，此时num处在未初始化的状态

    }
}
