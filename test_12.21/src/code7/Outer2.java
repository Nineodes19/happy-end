package code7;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:局部内部类
 * @create:2019-12-21 20:50
 */
public class Outer2 {
    public void doSomething(){
        //在方法中定义的局部类成为局部内部类，
        class Inner2{
            public void seeOuter(){

            }
        }
    }
}
