package code2;

/**
 * @program:test_12.4
 * @author: Nine_odes
 * @description:BirdClass
 * @create:2019-12-04 16:56
 */
//public class Bird {
//    public String name;
//
//    public Bird(String name){
//        this.name = name;
//    }
//
//    public void eat(String food){
//        System.out.println(this.name + "正在吃" + food);
//    }
//
//    public void flay(){
//        System.out.println(this.name + "正在飞~~~");
//    }
//}

class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }

    public void fly(){
        System.out.println(this.name + "正在飞~~~");
    }
}