package code6;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 20:35
 */
interface ICar{
    public void run();
}
interface IDriver{
    public void drive(ICar car);
}
class BMW implements ICar{
    public void run(){
        System.out.println("宝马车正在运行。。。。");
    }
}

class Benz implements ICar{
    public void run(){
        System.out.println("奔驰车正在运行。。。。");
    }
}
class Driver implements IDriver{
    public void drive(ICar car){
        car.run();
    }
}
public class Client {
    public static void main(String[] args) {
        IDriver ZhangSan = new Driver();
        ICar benz = new Benz();
        ZhangSan.drive(benz);
        ICar bmw = new BMW();
        ZhangSan.drive(bmw);
    }
}
