package deisgn;

/**
 * @program:test_12.26
 * @author: Nine_odes
 * @description:
 * @create:2019-12-26 19:55
 */
public class Tea extends CaffeineBeverage{
//    public void prepareRecipe(){
//        boilWater();
//        steepTeaBag();
//        pourInCup();
//        addGouqi();
//    }

    @Override
    public void brew() {
        System.out.println("泡茶包");
    }

    @Override
    public void addCondiments() {
        System.out.println("加枸杞");
    }

    //    public void boilWater(){
//        System.out.println("将水烧开");
//    }
//    public void steepTeaBag(){
//        System.out.println("泡茶包");
//    }
//    public void pourInCup(){
//        System.out.println("倒入杯中");
//    }
//    public void addGouqi(){
//        System.out.println("加枸杞");
//    }
}
