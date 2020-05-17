package code7;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:
 * @create:2019-12-22 22:52
 */
interface Pet{
    public void play();
    public void eat();
}
class Dog implements Pet{
    public void play(){
        System.out.println("Dog playing");
    }
    public void eat(){
        System.out.println("Dog eating");
    }
}
public class Ce {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
    }
}
