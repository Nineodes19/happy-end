package code6;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:
 * @create:2019-12-22 20:49
 */
class Animal{
    int num = 10;
    static int age = 20;
    public void eat(){
        System.out.println("动物吃饭");
    }

    public static void sleep(){
        System.out.println("动物在睡觉");
    }

    public void run(){
        System.out.println("动物在奔跑");
    }
}

class Cat extends Animal{
    int num = 80;
    static int age = 90;
    String name = "TomCat";
    public void eat(){
        System.out.println("猫吃饭");
    }

    public static void sleep(){
        System.out.println("猫在睡觉");
    }

    public void catchMouse(){
        System.out.println("猫在抓老师");
    }
}
public class Demos {
    public static void main(String[] args){
        Animal am = new Cat();
        am.eat();
        am.sleep();
        am.run();
        ((Cat) am).catchMouse();
        System.out.println(am.num);
        System.out.println(am.age);
    }
}
