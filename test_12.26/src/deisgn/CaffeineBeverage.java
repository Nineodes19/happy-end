package deisgn;

import java.io.IOException;

/**
 * @program:test_12.26
 * @author: Nine_odes
 * @description:
 * @create:2019-12-26 20:02
 */
public abstract class CaffeineBeverage {
    //冲泡流程
    //模板方法
    public final void prepareRecipe(){
        //final修饰方法子类不能重写
        boilWater();
        //brew
        //具体浸泡内容只有子类知道
        //延迟实现
        brew();
        pourInCup();
        if(isCustomerWantsCondiments()){
            addCondiments();
        }

    }
    public  abstract void brew();
    public abstract void addCondiments();
    public void boilWater(){
        System.out.println("将水烧开");
    }
    public void pourInCup(){
        System.out.println("将饮料倒入杯中");
    }
    public  boolean isCustomerWantsCondiments(){
        System.out.println("您想要糖或牛奶吗？输入y或n");

        try {
            char c = (char) System.in.read();
        }catch (IOException e){
            System.out.println();
        }
        return true;
    }
}
