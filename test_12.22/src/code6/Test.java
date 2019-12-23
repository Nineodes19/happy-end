package code6;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:
 * @create:2019-12-22 22:23
 */
abstract class People{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract void work();
}
class Teacher extends People{
    public void work(){
        System.out.println("my name is " + this.getName() );
    }
}

class Driver extends People{
    public void work(){
        System.out.println("my name is " + this.getName());
    }
}
public class Test {
}
