package code;

/**
 * @program:test_12.3
 * @author: Nine_odes
 * @description:构造块
 * @create:2019-12-03 14:00
 */
public class ConstructorSquare {
    int age;
    String name;
    static int count;
    public ConstructorSquare(){
        age = 0;
        name = null;
        count = 1;
//        System.out.println("22222222");
    }

    {
        age = 10;
        name = "张三";
        count = 1;
        //构造块,产生对象的时候自动调用
//        System.out.println("1111111");
    }

    public static void main(String[] args) {
        ConstructorSquare constructorSquare = new ConstructorSquare();
        System.out.println(constructorSquare.age);
        System.out.println(constructorSquare.name);
        System.out.println(constructorSquare.count);
        System.out.println("*****************");
        ConstructorSquare constructorSquare1 = new ConstructorSquare();

    }
}
