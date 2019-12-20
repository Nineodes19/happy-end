package code1;

/**
 * @program:test_12.20
 * @author: Nine_odes
 * @description:
 * @create:2019-12-20 13:40
 */
class Fu{
    public int num = 100;
    public Fu(){
        System.out.println("Fu");
    }

    public void show(){
        System.out.println("show Fu");
    }

    public static void function(){
        System.out.println("function Fu");
    }
}

class Zi extends Fu{
    public int num = 1000;
    public int num2 = 200;
    public Zi(){
        System.out.println("Zi");
    }

    public void show(){
        System.out.println("show Zi");
    }

    public void method(){
        System.out.println("nethod Zi");
    }
    public static void fuction(){
        System.out.println("function Zi");
    }
}
public class DuoTaiDemo {
    public static void main(String[] args){
        Fu f = new Zi();//父类引用指向子类对象
        //先执行父类的构造函数，输出Fu。然后执行子类构造函数
        if(f instanceof Zi){
            System.out.println("f是Zi的类型");
        }else{
            System.out.println("f是Fu的类型");
        }
//        Zi z = (Zi)f;
//        z.method();
        ((Zi)f).method();

//        System.out.println(f.num);
//        //System.out.println(f.num2);//找不到符号
//        f.show();
////        f.method();//找不到符号
//        f.function();
    }
}
