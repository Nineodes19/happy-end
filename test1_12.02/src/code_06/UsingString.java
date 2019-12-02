package code_06;

public class UsingString {
	public static void main(String[] args){
		
		int n1,n2,n3;
		String vb = "Visual Basic",ja = "java",s4 = "C++",s1,s2,s3;
		s1 = vb.concat(ja);
		System.out.println(s1);//Visual Basicjava
		s2 = s1.substring(8,16);//asicjava
		System.out.println(s2);
		s3 = vb.replace('a', 'x');//Visuxl Bxsic
		System.out.println(s3);
		
		n1 = s1.length();//16
		n2 = s1.indexOf(ja);//12
		n3 = s1.lastIndexOf(ja);//12
		System.out.println("n1 = "+n1+"    n2 = "+n2+"    n3 = "+ n3);
		
		
		//搜索指定字符或者字符串在另一个字符串中出现的位置
		//fromIndex 是指定匹配的起始位置
		//如果没有检索到字符串，返回值是-1
//		public int indexOf(int ch);
//		public int indexof(int ch,int fromIndex);
//		public int indexOf(String str);
//		public int indexOf(String str,int fromIndex);
//		String strSourse = "I love Java";
//		int nPosition;
//		nPosition = strSourse.indexOf('v');//4
//		System.out.println(nPosition);
//		nPosition = strSourse.indexOf('a',9);//10
//		System.out.println(nPosition);
//		nPosition = strSourse.indexOf("love");//2
//		System.out.println(nPosition);
//		nPosition = strSourse.indexOf("love",0);//2
//		System.out.println(nPosition);
//		nPosition = strSourse.lastIndexOf('v');
//		System.out.println(nPosition);
//		nPosition = strSourse.lastIndexOf('a',9);
//		System.out.println(nPosition);
		
//		String strSourse1 = "Java is interesting";
//		String str1 = strSourse1.substring(5);
//		String str2 = strSourse1.substring(7);
//		System.out.println(str1);
//		System.out.println(str2);
		
		//替换方法：public String replace(char oldChar,char newChar);
//		String s = "I mist theep";
//		String temp = s.replace('t', 'a');
//		System.out.println("temp-----------"+temp);//输出替换之后的字符串
//		
//		String s1 = "   *I mist theep!     ";
//		String temp1 = s1.trim();
//		System.out.println("temp1----------"+temp1);
//		
//		String temp2 =s.replaceAll(s1,temp);
//		System.out.println("temp2----------"+temp2);
	}
}
