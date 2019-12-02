package code6;
/*
 * 将一个字符串中的小写字母变成大写字母
 * 并将大写字母变成小写字母
 **/
public class Test {
	public static void main(String[] args){
		String s = new String("jifaAJIFE");
		char[] ch = s.toCharArray();
		for(int i =0; i < ch.length; i++){
			if((int)ch[i]>=65 && (int)ch[i]<=90){
				ch[i]+= 32;
			}
			else{
				ch[i] -= 32;
			}
		}
		s =new String(ch);
		System.out.println(s);
	}
}
