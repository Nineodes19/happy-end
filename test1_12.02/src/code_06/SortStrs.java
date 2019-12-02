package code_06;

//将字符串数组按照字典序重新排列
public class SortStrs {
	public static void main(String[] args){
		
		String a[] = {"Java","Basic","C++","Fortran","SmallTalk"};
		for(int i = 0; i < a.length; i++){
			for(int j = i+1; j < a.length; j++){
				
				//compareTo（String s）   按字典顺序与参数s指定的字符串比较大小
				if(a[j].compareTo(a[i]) < 0){
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i < a.length; i++){
			System.out.println(" "+a[i]);
		}
//		String s;//字符串变量的声明
//		String s1;
//		//调用String类的构造方法，使用字符串常量，构造新字符串对象<实例化>
//		s = new String("We are students");
//		s1 = "We are in same world";
//		System.out.println(s);
//		System.out.println(s1);
//		
//		//声明和实例化一步完成
//		String s2 = new String("We are students!");
//		System.out.println(s2);
//		
//		String s3 = new String();
//		System.out.println(s3);
//		System.out.println("*****************************");
		
//		char cDem01[] = {'1','2','3','5'};
//		char cDem02[] = {'2','3','5','7'};
//		//使用字符数组构造字符串
//		String strDem01 = new String(cDem01);
//		
//		//从字符数组的第一个字符开始构造长度为4的字符串
//		String strDem02 = new String(cDem02,1,3);
//		System.out.println(cDem01);
//		System.out.println(cDem02);
		
//		String s = "We are students",tom = "我们是学生";
//		int n1,n2;
//		n1 = s.length();
//		n2 = tom.length();
//		System.out.println(n1);
//		System.out.println(n2);
		
		
	}
}
