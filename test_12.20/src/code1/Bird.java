package code1;

/**
 * @program:test_12.20
 * @author: Nine_odes
 * @description:
 * @create:2019-12-20 14:28
 */
public class Bird extends Animal{
    public Bird(String name){
        super(name);
    }

    public void eat(String food){
        System.out.println("我是一只小鸟");
        System.out.println(this.name + "正在吃" + food);
    }
}
