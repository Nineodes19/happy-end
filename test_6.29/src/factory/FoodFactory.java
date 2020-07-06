package factory;

import food.Chicken;
import food.Fish;
import food.Food;
import food.Td;

/**
 * @program:test_6.29
 * @author:Nine_odes
 * @description:
 * @create:2020-06-29 11:34
 **/
public class FoodFactory {
    public static Food creatFood(String foodName){
        if("fish".equals(foodName)){
            return new Fish();
        }
        if("td".equals(foodName)){
            return new Td();
        }
        if("chicken".equals(foodName)){
            return new Chicken();
        }
        return null;
    }
}
