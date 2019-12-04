package keyword;

/**
 * @program:test_12.4
 * @author: Nine_odes
 * @description:protected
 * @create:2019-12-04 17:05
 */
public class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(String food){
        System.out.println(this.name + "正在吃" + food);
    }
}
