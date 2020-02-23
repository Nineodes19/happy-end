/**
 * @program:test_2.23
 * @author:Nine_odes
 * @description:
 * @create:2020-02-23 20:27
 **/
public abstract class CaffeineBeverage {
    //冲泡流程
    //模板方法
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(isCustomerWantsCondiments()){
            addCondiments();
        }

    }

    public abstract void brew();
    public abstract void addCondiments();
    public void boilWater(){
        System.out.println("将水烧开");
    }
    public void pourInCup(){
        System.out.println("将饮料倒入杯中");
    }

    public boolean isCustomerWantsCondiments(){
        return true;
    }
}
