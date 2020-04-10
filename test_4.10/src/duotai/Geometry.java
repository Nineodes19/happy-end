package duotai;

import javax.swing.*;

/**
 * @program:test_4.10
 * @author:Nine_odes
 * @description:
 * @create:2020-04-10 14:22
 **/
public abstract class Geometry {
    String name;
    public abstract void display();
}

/**
 * 长方形子类，继承父类Geometry
 */
class Rectangle extends Geometry{

    private int width;//长方形的宽
    private int height;//高

    /**
     * 构造函数
     * @param w
     * @param h
     */
    public Rectangle(int w,int h){
        this.width = w;
        this.height = h;
    }
    @Override
    /**
     *重写父类的抽象方法，绘制长方形
     */
    public void display() {
        System.out.printf("\n长方形显示出来，长%3d，宽%2d  ",width,height);
    }
}

/**
 * 三角形子类，继承父类Geometry
 */
class Triangle extends Geometry{
    private int edge1;//三角形边1
    private int edge2;//三角形边2
    private int edge3;//三角形边3

    /**
     * 构造函数
     * @param e1
     * @param e2
     * @param e3
     */
    public Triangle(int e1,int e2,int e3){
        this.edge1 = e1;
        this.edge2 = e2;
        this.edge3 = e3;
    }

    /**
     * 重写父类的抽象方法，绘制三角形
     */
    public void display(){
        System.out.printf("\n三角形显示出来，边长%3d，边长%3d，边长%3d  ",edge1,edge2,edge3);
    }
}

/**
 * 圆形子类，继承父类Geometry
 */
class Circle extends Geometry{
    private int ox;//圆心的x坐标
    private int oy;//圆心的y坐标
    private int radius;//圆的半径

    /**
     * 构造函数
     * @param x
     * @param y
     * @param r
     */
    public Circle(int x,int y,int r){
        this.ox = x;
        this.oy = y;
        this.radius = r;
    }

    /**
     *重写父类方法
     */
    public void display(){
        System.out.printf("\n圆形显示出来，圆心（%3d,%3d），半径是 %3d",ox,oy,radius);
    }
}