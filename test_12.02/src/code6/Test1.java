package code6;
/*
 * 给定一个整数-1234567，输出它的二进制、八进制和十六进制的表现形式*/

public class Test1 {
	public static void main(String[] args){
		int m = -1234567;
		System.out.println("二进制的表示为："+Integer.toString(m, 2));
		System.out.println("八进制的表示为："+Integer.toString(m, 8));
		System.out.println("十六进制的表示为："+Integer.toString(m, 16));
	}
}
