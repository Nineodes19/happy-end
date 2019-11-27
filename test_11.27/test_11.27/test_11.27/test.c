#define _CRT_SECURE_NO_WARNINGS
//（7）编写一个程序，输入三个双精度数，输出其中的最小数
//#include<stdio.h>
//float min(float* arr,int sz)
//{
//	float min = arr[0];
//	int i = 0;
//	for (i = 1; i < sz; i++)
//	{
//		if (arr[i] <= min)
//		{
//			min = arr[i];
//		}
//	}
//	return min;
//}
//int main()
//{
//	float arr[3];
//	int i = 0;
//	for (i = 0; i < 3; i++)
//	{
//		scanf("%f", &arr[i]);
//	}
//	printf("最小数是：%.2f", min(arr, 3));
//	return 0;
//}
//（8）题目：输入三个整数x，y，z，请把这三个数由小到大输出
//#include<stdio.h>
////写一个函数，让三个数从小到大输出
//void swap(int *a, int *b)
//{
//	int temp = *a;
//	*a = *b;
//	*b = temp;
//}
//void Print(int *a, int *b, int *c)
//{
//	if (*a > *b)
//	{
//		swap(&a, &b);
//
//	}
//	else if (*a > *c)
//	{
//		swap(&a, &c);
//	}
//	else if (*b > *c)
//	{
//		swap(&b, &c);
//	}
//	printf("%d %d %d", *a, *b, *c);
//}
//int main()
//{
//	int x, y, z;
//
//	printf("请输入三个整数：\n");
//	scanf("%d%d%d", &x, &y, &z);
//	Print(&x, &y, &z);
//	return 0;
//}
//（9）编写一个程序，求出所有各位数字的立方和等于1099的三位整数
//#include<stdio.h>
//#include<math.h>
//
////写一个函数，返回一个数字各位数的立方和
//
//int main()
//{
//	int i = 0;
//	int a = 0;//个位
//	int b = 0;//十位
//	int c = 0;//百位
//	for (i = 100; i < 1000; i++)
//	{
//		
//		a = i % 10;
//		b = (i / 10) % 10;
//		c = i / 100;
//		if (a*a*a + b*b*b + c*c*c == 1099)
//		{
//			printf("%d ", i);
//		}
//		
//	}
//	return 0;
//}