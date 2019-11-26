#define  _CRT_SECURE_NO_WARNINGS

//开关房门
/*
旅馆里有一百个房间，从一到一百编了号，第一个服务员把所有的房间门都打开了。
第二个服务员把所有编号是2的倍数的房间“相反处理”
第三个服务员把所有编号是3的倍数的房间做“相反处理”
第一百个服务员来过后，哪几扇门是打开的
*/
//#include<stdio.h>
//int main()
//{
//	int m = 0;//表示房间编号
//	int n = 0;//表示服务员编号
//	int temp[100] = { 0};//存储房间门的状态
//	for (n = 1; n <= 100; n++)
//	{
//		for (m = 1; m <= 100; m++)
//		{
//			if (m%n == 0)
//			{
//				temp[m-1] = !temp[m-1];
//			}
//		}
//	}
//	printf("开着的分别为:\n");
//	for (m = 1; m <= 100; m++)
//	{
//		if (temp[m-1])
//		{
//			printf("%d ", m);
//		}
//	}
//	return 0;
//}

//（5）输入年和月，则输出此年此月的天数，如大月有31天，小月有30天。
//而闰年的2月有29天，平年则有28天。（使用switch结构实现）
//#include<stdio.h>
//int main()
//{
//	int year = 0;
//	int month = 0;
//	int temp = 0;
//	printf("请输入年和月：\n");
//	while (scanf("%d%d", &year, &month) != EOF)
//	{
//		temp = 0;
//		if ((year % 4 == 0) && (year % 100 == 0))
//		{
//			temp = 1;
//		}
//		if (year % 400 == 0)
//		{
//			temp = 1;
//		}
//		switch (month)
//		{
//		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
//			printf("%d年%d月共有31天！", year, month);
//			break;
//		case 4:case 6:case 9:case 11:
//			printf("%d年%d月共有30天！\n", year, month);
//			break;
//		case 2:
//			switch (temp)
//			{
//			case 0:
//				printf("%d年%d月共有28天！\n", year, month);
//				break;
//			case 1:
//				printf("%d年%d月共有29天！\n", year, month);
//				break;
//			}
//		}
//	}
//	
//	return 0;
//}
//（6）求100个随机整数之和，随机数要求为0-9的整数
//#include<stdio.h>
//#include<stdlib.h>
//#include<time.h>
//int main()
//{
//	int i = 0;
//	int sum = 0;
//	for (i = 1; i <= 100; i++)
//	{
//		srand((unsigned)time(0));
//		printf("%d ", 10*rand()/RAND_MAX+1.0);
//	}
//	printf("100个随机整数之和是：%d！", sum);
//}
//（7）编写一个程序，输入三个双精度数，输出其中的最小数
//
//（8）题目：输入三个整数x，y，z，请把这三个数由小到大输出
//
//（9）编写一个程序，求出所有各位数字的立方和等于1099的三位整数



#include <stdio.h>

//冒泡排序 
void sort(int num[], int n)
{
	int t, i, j;
	for (i = 0; i<n - 1; i++)
	{
		for (j = 0; j<n - 1 - i; j++)
		{
			if (num[j]>num[j + 1])
			{
				t = num[j];
				num[j] = num[j + 1];
				num[j + 1] = t;
			}
		}
	}
	printf("排序之后的数组元素为：\n");
	for (i = 0; i<n; i++)
	{
		printf("%d ", num[i]);
	}
}
//二分查找
int search(int num[], int n, int m)
{
	int mid = (n - 1) / 2;
	int left = 0;
	int right = n - 1;
	while (left<=right)
	{
		if (num[mid] == m)
		{
			printf("下标为%d", mid);
			return mid;
		}
		else if (num[mid]>m)
		{
			right = mid - 1;
		}
		else if (num[mid]<m)
		{
			left = mid + 1;
		}
	}
	return -1;
}

int main()
{
	int num[] = { 3, 2, 55, 43, 56, 7, 56, 12, 176, 124, 767, 65 };
	int n = sizeof(num) / sizeof(num[0]);
	int m = 0;
	sort(num, n);
	scanf("%d", &m);
	search(num, n, m);
	return 0;
}