package code_06;

//���ַ������鰴���ֵ�����������
public class SortStrs {
	public static void main(String[] args){
		
		String a[] = {"Java","Basic","C++","Fortran","SmallTalk"};
		for(int i = 0; i < a.length; i++){
			for(int j = i+1; j < a.length; j++){
				
				//compareTo��String s��   ���ֵ�˳�������sָ�����ַ����Ƚϴ�С
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
//		String s;//�ַ�������������
//		String s1;
//		//����String��Ĺ��췽����ʹ���ַ����������������ַ�������<ʵ����>
//		s = new String("We are students");
//		s1 = "We are in same world";
//		System.out.println(s);
//		System.out.println(s1);
//		
//		//������ʵ����һ�����
//		String s2 = new String("We are students!");
//		System.out.println(s2);
//		
//		String s3 = new String();
//		System.out.println(s3);
//		System.out.println("*****************************");
		
//		char cDem01[] = {'1','2','3','5'};
//		char cDem02[] = {'2','3','5','7'};
//		//ʹ���ַ����鹹���ַ���
//		String strDem01 = new String(cDem01);
//		
//		//���ַ�����ĵ�һ���ַ���ʼ���쳤��Ϊ4���ַ���
//		String strDem02 = new String(cDem02,1,3);
//		System.out.println(cDem01);
//		System.out.println(cDem02);
		
//		String s = "We are students",tom = "������ѧ��";
//		int n1,n2;
//		n1 = s.length();
//		n2 = tom.length();
//		System.out.println(n1);
//		System.out.println(n2);
		
		
	}
}
