/**
 * @program:test_2.23
 * @author:Nine_odes
 * @description:
 * @create:2020-02-23 20:27
 **/
public class DrinkShop {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();
        tea.prepareRecipe();
        coffee.prepareRecipe();
    }
}
