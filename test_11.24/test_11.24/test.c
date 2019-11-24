////指针是个变量，用来存放地址的变量
//
//#include<stdio.h>
//int main()
//{
//	int a = 10;//定义一个整形变量a，初始化的值为10
//	int *p = &a;//定义一个整形的指针变量p，p指向a的地址
//	int n = 10;
//	char *pc = (char)&n;
//	int *pi = &n;
//	printf("%p\n", &n);
//	printf("%p\n", pc);
//	//指针的类型决定了指针向前或者向后走一步有多大距离
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