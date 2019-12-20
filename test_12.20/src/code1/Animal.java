package code1;

/**
 * @program:test_12.20
 * @author: Nine_odes
 * @description:
 * @create:2019-12-20 14:26
 */
public class Animal {
    protected String name;
    public Animal(String name){
        this.name = name;
    }

    public void eat(String food){
        System.out.println("我是一直小动物");
        System.out.println(this.name + "正在吃" + food);
    }
}
