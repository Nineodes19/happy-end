package yonghu;

import factory.FoodFactory;
import food.Food;

/**
 * @program:test_6.29
 * @author:Nine_odes
 * @description:
 * @create:2020-06-29 11:22
 **/
public class Cooker {

    //烹饪方法
    public void cook(){
//        Food td = FoodFactory.creatFood("td");
//        System.out.println("厨师煮：" + td);
        Food td = FoodFactory.creatFood("fish");
        System.out.println("厨师煮：" + td);
    }
}
