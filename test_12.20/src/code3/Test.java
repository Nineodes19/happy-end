package code3;

import javax.imageio.event.IIOWriteProgressListener;

/**
 * @program:test_12.20
 * @author: Nine_odes
 * @description:
 * @create:2019-12-20 15:32
 */
class Animal{
    protected String name;
    public Animal(String name){
        this.name = name;
    }
}

interface IFlying{
    void fly();
}

interface IRunning{
    void run();
}

interface ISwimming{
    void swim();
}

class Cat extends Animal implements IRunning{
    public Cat(String name){
        super(name);
    }
    public void run(){
        System.out.println(this.name + "正在用四条腿跑");
    }
}

class Fish extends Animal implements ISwimming{
    public Fish(String name){
        super(name);
    }
    public void swim(){
        System.out.println(this.name + "正在用尾巴游泳");
    }
}

class Frog extends Animal implements IRunning,ISwimming{
    public Frog(String name){
        super(name);
    }

    public void run(){
        System.out.println(this.name + "正在往前跳");
    }
    public void swim(){
        System.out.println(this.name + "正在蹬腿游泳");
    }
}

class Duck extends Animal implements IRunning,ISwimming,IFlying{
    public Duck(String name){
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name + "正在用翅膀飞");
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在用两条腿跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正漂在水上");
    }
}

class Robot implements IRunning{
    private String name;
    public Robot(String name){
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println(this.name + "正在用轮子跑");
    }
}
public class Test {

    public static void main(String[] args) {
//        Cat cat = new Cat("小猫");
//        walk(cat);
//
//        Frog frog = new Frog("小青蛙");
//        walk(frog);

        Robot robot = new Robot("机器人");
        walk(robot);

    }
    public static void walk(IRunning running){
        System.out.println("我带着伙伴去散步");
        running.run();
    }
}
