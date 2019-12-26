package deisgn;

/**
 * @program:test_12.26
 * @author: Nine_odes
 * @description:
 * @create:2019-12-26 19:49
 */
public class Coffee extends CaffeineBeverage{
//    public void prepareRecipe(){
//        boilWater();
//        brewCoffeeBean();
//        pourInCup();
//        addSugerAndMilk();
//    }
//    public void boilWater(){
//        System.out.println("将水烧开");
//    }
//    public void brewCoffeeBean(){
//        System.out.println("泡咖啡豆");
//    }
//    public void pourInCup(){
//        System.out.println("将咖啡豆倒入杯中");
//    }
//    public void addSugerAndMilk(){
//        System.out.println("加糖或牛奶");
//    }

    @Override
    public void brew() {
        System.out.println("泡咖啡豆");
    }

    @Override
    public void addCondiments() {
        System.out.println("加糖或牛奶");
    }
    public boolean isCustomer(char c){
        if(c == 'y'){
            return true;
        }
        return false;
    }
}
