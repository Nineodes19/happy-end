package code2;

import java.sql.SQLOutput;

/**
 * @program:test_12.20
 * @author: Nine_odes
 * @description:
 * @create:2019-12-20 14:58
 */
class Animal{
    protected String name;
    public Animal(String name){
        this.name = name;
    }

    public void eat(String food){
        System.out.println("我是一只小动物");
        System.out.println(this.name + "正在吃" + food);
    }
}

class Bird extends Animal{
    public Bird(String name){
        super(name);
    }

    public void eat(String food){
        super.eat(food);
        System.out.println("我是一只小鸟");
        System.out.println(this.name + "正在吃" + food);
    }

    public void fly(){
        System.out.println(this.name + "正在飞");
    }
}
public class Test1 {
    public static void main(String[] args) {
//        Animal animal = new Bird("圆圆");
//        animal.eat("谷子");
//        Bird bird = (Bird)animal;
//        bird.fly();
    }
}
