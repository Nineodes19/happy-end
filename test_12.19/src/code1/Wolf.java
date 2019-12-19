package code1;

/**
 * @program:test_12.19
 * @author: Nine_odes
 * @description:
 * @create:2019-12-19 22:08
 */
class Creature{
    public Creature(){
        System.out.println("Creature无参数的构造器");
    }
}

class Animal extends Creature{
    public Animal(String name){
        System.out.println("Animal带一个参数的构造器，" + "该动物的name为" + name);
    }
    public Animal(String name,int age){
        this(name);
        System.out.println("Animal带两个参数的构造器，" + "其age为" + age);
    }
}
public class Wolf extends Animal{
    public Wolf(){
        //显式调用父类有两个参数的构造器
        super("灰太狼",3);
        System.out.println("Wolf无参数的构造器");
    }
    public static void main(String[] args){
        new Wolf();
        //先调用Animal的构造函数，因为Animal是Creature的子类，调用
        //Creature的构造函数---------Creature无参数的构造器
        //调用Animal带两个参数的构造函数，执行super(name）
    }
}
