package code7;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:
 * @create:2019-12-22 22:54
 */
interface DogAction{
    public void ww();
}
interface Pets{
    public void play();
    public void eat();
}
interface Action extends Pets{
    public void jiao();
}
class Dogs implements Action{

    @Override
    public void play() {
        System.out.println("Dog playing");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public void jiao() {
        System.out.println("jiao");
    }
    public void ww(){
        System.out.println("wwing");
    }
}
public class Test {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.eat();
        dog.play();
        dog.ww();
        dog.jiao();
    }
}
