package code6;
/*
 * ����һ������-1234567��������Ķ����ơ��˽��ƺ�ʮ�����Ƶı�����ʽ*/

public class Test1 {
	public static void main(String[] args){
		int m = -1234567;
		System.out.println("�����Ƶı�ʾΪ��"+Integer.toString(m, 2));
		System.out.println("�˽��Ƶı�ʾΪ��"+Integer.toString(m, 8));
		System.out.println("ʮ�����Ƶı�ʾΪ��"+Integer.toString(m, 16));
	}
}
