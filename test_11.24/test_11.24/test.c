////ָ���Ǹ�������������ŵ�ַ�ı���
//
//#include<stdio.h>
//int main()
//{
//	int a = 10;//����һ�����α���a����ʼ����ֵΪ10
//	int *p = &a;//����һ�����ε�ָ�����p��pָ��a�ĵ�ַ
//	int n = 10;
//	char *pc = (char)&n;
//	int *pi = &n;
//	printf("%p\n", &n);
//	printf("%p\n", pc);
//	//ָ������;�����ָ����ǰ���������һ���ж�����
//	printf("%p\n", pc + 1);
//	printf("%p\n", pi);
//	printf("%p\n", pi + 1);
//	return 0;
//}

#include<stdio.h>
int main()
{
	int n = 0x11223344;
	char *pc = (char*)&n;
	int *pi = &n;
	*pc = 0;
	*pi = 0;
	printf("%p\n", pi);
	return 0;
}