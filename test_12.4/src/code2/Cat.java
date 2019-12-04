package code2;

/**
 * @program:test_12.4
 * @author: Nine_odes
 * @description:Cat Class
 * @create:2019-12-04 16:53
 */
//public class Cat {
//    public String name;
//
//    public Cat(String name){
//        this.name = name;
//    }
//
//    public void eat(String food){
//        System.out.println(this.name + "正在吃" + food);
//    }
//}

class Cat extends Animal{

    public Cat(String name) {
        //使用super 调用父类的构造方法
        super(name);
    }
}
