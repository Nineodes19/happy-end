package method;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @program:test_12.10
 * @author: Nine_odes
 * @description:
 * @create:2019-12-11 15:10
 */
public class ConstructorSquare {
    int age;
    String name;
    static int count;
    public ConstructorSquare(){
        age = 0;
        name = null;
        count = 0;
        //System.out.println("2222222");
    }

    {
        //2.构造代码块,优先于构造方法执行，产生几个对象就调用几次构造块
        //一般也可以用构造块完成属性的初始化操作
        age = 10;
        name = "zs";
        count = 1;
        //System.out.println("1111111");
    }

    public static void main(String[] args) {
        ConstructorSquare constructorSquare = new ConstructorSquare();
        System.out.println(constructorSquare.age);
        System.out.println(constructorSquare.name);
        System.out.println(constructorSquare.count);
        ConstructorSquare constructorSquare1 = new ConstructorSquare();
    }
}
