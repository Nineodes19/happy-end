#define _CRT_SECURE_NO_WARNINGS 1

//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	/*int len = strlen("test");
//	printf("%d\n", len);*/
//	char arr1[] = "test";//字符串末尾有系统加上的'\0'
//	char arr2[] = { 't', 'e', 's', 't', '\0' };
//	printf("%s\n", arr1);
//	printf("%s\n", arr2);
//
//	return 0;
//}
//
//


//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	printf("%d\n", strlen("c:\test\VSprogram"));
//	printf("%d\n", "c:\\test\\code");//\t(退格键)
//	printf("%c\n", '\'');//\'为转义字符’
//	printf("%s\n", "\"");//\"为转义字符”
//	printf("%d\n", strlen("c:\test\057\test.c"));//\ddd
//	printf("%c\n", '\x40');
//	return 0;
//}

//#include<stdio.h>
//
//int Add(int x, int y)
//{
//	int z = x + y;
//	return z;
//}
//int main()
//{
//	int num1 = 0;
//	int num2 = 0;
//	int sum = 0;
//	while (scanf("%d%d", &num1, &num2) != EOF);
//	//scanf("%d %d", &num1, &num2);
//	sum = Add(num1, num2);
//	printf("%d\n", sum);
//	return 0;
//}

//#include<stdio.h>
//
//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	//printf("%d\n", arr[3]);//输出数组下标为3的元素
//	int i = 0;
//	while (i < 10)
//	{
//		arr[i] = 0;
//		i++;
//	}
//	i = 0;
//	while (i < 10)//数组初始化
//	{
//		printf("%d ", i);
//		printf("%d\n", arr[i]);
//		i++;
//	}
//
//	return 0;
//}

//#include<stdio.h>
//
//int main()
//{
//	int a = 15 / 2;
//	printf("%d\n", a);//输出7
//	
//	int b = 15 % 2;
//	printf("%d\n", b);//输出1
//
//	int x = 1;
//	int y = 3;
//
//	int z1 = x&y;
//	printf("%d\n", z1);//1
//	int z2 = x | y;
//	printf("%d\n", z2);//3
//
//	int z3 = x ^ y;
//	printf("%d\n", z3);//2
//
//	return 0;
//}

//#include<stdio.h>
//
//int main()
//{
//	int a = 0;
//	printf("%d\n", !a);
//	int flag = 0;
//	if (!flag)
//	{
//		printf("hehe\n");
//	}
//	return 0;
//}

//#include<stdio.h>
//
//int main()
//{
//	int a = 10;
//
//	int arr[10] = { 0 };
//	printf("%d\n", sizeof(arr));//数组长度为10 的整形数组，一个整形数据占四个字节
//
//	printf("%d\n", sizeof(int));//4
//	printf("%d\n", sizeof(char));//1
//	printf("%d\n", sizeof(long));//4
//	printf("%d\n", sizeof(long long));//8
//	printf("%d\n", sizeof(float));//4
//	printf("%d\n", sizeof(double));//8
//	return 0;
//}
//
//#include<stdio.h>
//
//int main()
//{
//	int a = (int)3.14;//强制转换整形
//	printf("%d\n", a);
//	return 0;
//}

//#include<stdio.h>
//
//int main()
//{
//	int i = 0;
//	int count = 0;
//	for (i = 100; i <= 200; i++)
//	{
//		//printf("%d ", i);
//		//判断i是否为素数
//		int j = 0;
//		for (j = 2; j < i; j++)
//		{
//			if (i%j == 0)
//				break;
//		}
//		if (j >= i)
//		{
//			count++;
//			printf("%d ", i);
//		}
//	}
//	printf("\ncount = %d\n", count);
//	return 0;
//}

