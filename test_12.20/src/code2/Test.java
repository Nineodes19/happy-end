package code2;

/**
 * @program:test_12.20
 * @author: Nine_odes
 * @description:
 * @create:2019-12-20 14:35
 */

abstract class Shape{
    abstract public void draw();
    void func(){
        System.out.println("func");
    }
}
class Cycle extends Shape{
    public void draw(){
        System.out.println("○");
    }
}
class Rect extends Shape{
    public void draw(){
        System.out.println("□");
    }
}

class Flower extends Shape{
    public void draw(){
        System.out.println("♣");
    }
}

class Triangle extends Shape{
    public void draw(){
        System.out.println("△");
    }
}
public class Test {
    public static void main(String[] args){

        Shape shape = new Rect();
        shape.func();
        //Shape shape = new Shape();
        //        Shape shape = new Flower();
//        Shape shape1 = new Cycle();
//        Shape shape2 = new Rect();
//        shape.draw();
//        shape1.draw();
////        shape2.draw();
//        drawShape(shape);
//        drawShape(shape1);
//        drawShape(shape2);
        drawShape();

    }

//    public static void drawShape(Shape shape){
//        shape.draw();
//    }

//    public static void drawShape(){
//        Rect rect = new Rect();
//        Cycle cycle = new Cycle();
//        Flower flower = new Flower();
//        String[] shapes = {"cycle","rect","cycle","rect","flower"};
//
//        for (String shape:shapes) {
//            if(shape.equals("cycle")){
//                cycle.draw();
//            }else if(shape.equals("rect")){
//                rect.draw();
//            }else if(shape.equals("flower")){
//                flower.draw();
//            }
//        }
//    }

    public static void drawShape(){
        Shape[] shapes = {new Cycle(),new Triangle(),new Rect(),new Cycle(),new Rect(),new Flower()};
        for (Shape shape:shapes) {
            shape.draw();
        }
    }

}
