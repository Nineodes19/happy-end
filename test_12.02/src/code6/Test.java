package code6;
/*
 * ��һ���ַ����е�Сд��ĸ��ɴ�д��ĸ
 * ������д��ĸ���Сд��ĸ
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
