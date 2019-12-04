package code2;

/**
 * @program:test_12.4
 * @author: Nine_odes
 * @description:
 * @create:2019-12-04 16:52
 */
public class Animal {
    public String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(String food){
        System.out.println(this.name + "正在吃" + food);
    }
}
