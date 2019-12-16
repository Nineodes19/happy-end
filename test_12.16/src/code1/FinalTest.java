package code1;

/**
 * @program:test_12.16
 * @author: Nine_odes
 * @description:final使用
 * @create:2019-12-16 20:03
 */
final class Circle{
    final double PI = 3.1416;
    final double area(double r){
        return (PI * r * r);
    }
    final double area(double a,double b ){
        return ( a * b);
    }
}
public class FinalTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        //c.PI = 2.0;//无法修改
        System.out.println("area = " + c.area(5.0));
        System.out.println("area = " + c.area(3.0,4.0));
    }
}
