package keyword;

/**
 * @program:test_12.4
 * @author: Nine_odes
 * @description:
 * @create:2019-12-04 17:06
 */
public class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    public void fly(){
        //对于父类的protected字段，子类可以正确访问
        System.out.println(this.name + "正在飞~~~");
    }
}
