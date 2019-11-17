
//大端小端字节序
#include<stdio.h>

//int check_sys()
//{
//	int i = 1;
//	return(*(char*)&i);
//}

//int check_sys()
//{
//	union
//	{
//		int i;
//		char c;
//	}un;
//	un.i = 1;
//	return un.c;
//}
//int main()
//{
//	int ret = check_sys();
//	if (ret == 1)
//	{
//		printf("小端\n");
//	}
//	else
//	{
//		printf("大端\n");
//	}
//	return 0;
//}

//#include<stdio.h>
//int main()
//{
//	char a = -1;
//	//00000000000000000000000000000001
//	signed char b = -1;
//	unsigned char c = -1;
//	//10000000000000000000000000000001
//	printf("a = %d,b= %d ,c = %d", a, b, c);//-1 -1 255
//	return 0;
//}

//#include<stdio.h>
//int main()
//{
//	char a = -128;
//	//2 4 8 16 32 64 128
//	//00000000000000000000000010000000
//	//10000000000000000000000010000000
//	printf("%u\n", a);
//	return 0;
//}

//#include<stdio.h>
//int main()
//{
//	int i = -20;
//	//00000000000000000000000000010100
//	//01111111111111111111111111101011
//	//01111111111111111111111111101100
//	unsigned int j = 10;
//	//10000000000000000000000000001010
//	//00000000000000000000000000001010
//	printf("%d\n", i + j);
//	return 0;
//}

//#include<stdio.h>
//int main()
//{
//	unsigned int i;
//	//死循环
//	for (i = 9; i >= 0; i--)
//	{
//		printf("%u\n", i);
//	}
//	return 0;
//}

//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	char a[1000];
//	int i;
//	for (i = 0; i < 1000; i++)
//	{
//		a[i] = -1 - i;
//	}
//	printf("%d", strlen(a));//255,char型表示的数最大是255
//	return 0;
//}

//typedef类型定义，将类型struct Stu定义为Stu
//typedef struct Stu
//{
//	char name[20];
//	int age;
//	char sex[5];
//	char id[20];
//}Stu;

//#include<stdio.h>
//
//struct Stu
//{
//	char name[20];
//	int age;
//};
//void print(struct Stu* ps)
//{
//	printf("name = %s  age = %d\n", (*ps).name, (*ps).age);
//	printf("name = %s  age = %d\n", ps->name, ps->age);
//}
//int main()
//{
//	struct Stu s = { "zhangsan", 20 };
//	print(&s);//结构体地址传参
//	return 0;
//}

//#include<stdio.h>
//
//struct S
//{
//	int data[1000];
//	int num;
//};
//struct S s = { { 1, 2, 3,4 },1000 };
//
//void print1(struct S s)
//{
//	printf("%d\n", s.num);
//}
//
//
//
//void print3(struct S* ps)
//{
//	printf("&d\n", ps->num);
//}
//int main()
//{
//	print1(s);
//
//	print3(&s);
//	return 0;
//}