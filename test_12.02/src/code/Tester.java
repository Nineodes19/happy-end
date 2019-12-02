package code;

public class Tester {
	static  Circle[] shapes = {new Circle(1.0),new Rectangle(3.0,4.0),new Circle(8.0) };
	public static void main(String[] args) {
		System.out.println("tital area = "+sumArea(shapes));
		
	}
	
	//存储在一个数组中的多个图形的面积之和
	public static double sumArea(Circle[] shapes) {
		double sum = 0;
		for(int i = 0; i < shapes.length; i++){
			double a = shapes[i].getArea();
			sum+=a;
		}
		return sum;
	}
}
