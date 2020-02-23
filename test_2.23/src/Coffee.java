import java.io.IOException;

/**
 * @program:test_2.23
 * @author:Nine_odes
 * @description:
 * @create:2020-02-23 20:33
 **/
public class Coffee extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("泡咖啡豆");
    }

    @Override
    public void addCondiments() {
        System.out.println("加糖或者牛奶");
    }

    public boolean isCustomerWantsCondiments(){
        System.out.println("您想要加糖或者牛奶吗？输入y或n");
        try{
            char c = (char) System.in.read();
            if(c == 'y') return true;
        }catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }
}
