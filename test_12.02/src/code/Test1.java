package code;

class Circle implements CalcArea{
	public final static double PI = 3.14;
	private double r;
	public Circle(double r) {
		this.r = r;
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI*r*r;
	}
}

class Rectangle extends Circle{
	private double l;
	private double w;
	public Rectangle(double l,double x){
		super(l);
		this.l = l;
		this.w =x;
	}
	public double getArea() {
		return l*w;
	}
}

public class Test1 {
	public static void main(String[]args) {
		Circle c = new Circle(3.0);
		System.out.println("圆c的面积是："+c.getArea());
		Rectangle R = new Rectangle(3.0,4.0);
		System.out.println("长方形R的面积为："+R.getArea());
	}
}
