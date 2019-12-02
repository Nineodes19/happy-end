package code_06;

public class ReverseString {
	public static void main(String[] args){
		String str = new String("I love java");
		StringBuffer s = new StringBuffer(str);
		System.out.println(s.reverse());
		String strDest = reverseIt(str);
		System.out.println(strDest);
	}
	
	public static String reverseIt(String source){
		int i,len = source.length();
		StringBuffer dest = new StringBuffer(len);
		for(i =(len-1); i >= 0; i--){
			dest.append(source.charAt(i));
		}
		return dest.toString();
	}
}


//public class ReverseString {
//	public static void main(String[] args){
////		StringBuffer sbf = new StringBuffer("1+2=");
////		int i = 3;
////		sbf.append(i);
////		System.out.println(sbf);
//		
////		StringBuffer s = new StringBuffer("1+=2");
////		int n = 1;
////		
////		//在字符串的第n个位置插入2
////		s.insert(2, n);
////		System.out.println(s);
//		
////		StringBuffer str =new StringBuffer("You are the best one!");
////		str.delete(0, 3);
////		System.out.println(str);
////		
////		//内容替换
////		String s2 = "i am";
////		str.replace(0, 4, s2);
////		System.out.println(str);
//	}
//}
