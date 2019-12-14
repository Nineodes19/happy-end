package code;

/**
 * @program:test_12.14
 * @author: Nine_odes
 * @description:圆类
 * @create:2019-12-14 22:54
 */

class Circle{
    float x,y;
    float radius;
    double getArea(){
        return radius * radius * Math.PI;
    }

    double getCircumference(){
        return 2 * radius * Math.PI;
    }
}
public class getCircumference {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 3;
        c.x = 0;
        c.y = 0;
        System.out.println("Area = " + c.getArea());
        System.out.println("Circumference = " + c.getCircumference());
    }
}
