#define  _CRT_SECURE_NO_WARNINGS

//（1）编一个程序，输入x的值，按下列公式计算并输出y值
//y = x   a <=1
//y = 2*x -1  1 < x < 10
//y = 3*x - 11   10<=x
//#include<stdio.h>
//int main()
//{
//	int x = 0;
//	int y = 0;
//	scanf("%d", &x);
//	if (x <= 1)
//	{
//		y = x;
//		printf("y = %d\n",y);
//	}
//	if ((x > 1) && (x < 10))
//	{
//		y = 2 * x - 1;
//		printf("y = %d\n",y);
//	}
//	else
//	{
//		y = 3 * x - 11;
//		printf("y = %d\n",y);
//	}
//	return 0;
//}

//（2）已知数A和B，由键盘输入A、B的值，交换他们的值，并输出
//#include<stdio.h>
//int main()
//{
//	int A = 0;
//	int B = 0;
//	int temp = 0;
//	printf("请输入A和B的值：    ");
//	scanf("%d%d", &A, &B);
//	temp = A;
//	A = B;
//	B = temp;
//	printf("交换之后的A和B分别为：%d  %d\n",A,B);
//	return 0;
//}

//#include<stdio.h>
//void swap(int *a, int* b)
//{
//	int temp;
//	temp = *a;
//	*a = *b;
//	*b = temp;
//}
//
//int main()
//{
//	int A = 0;
//	int B = 0;
//	printf("请输入需要交换的两个数：\n");
//	scanf("%d%d", &A, &B);
//	swap(&A, &B);
//	printf("请输出交换之后的AB值：\n");
//	printf("A = %d, B = %d\n", A, B);
//	return 0;
//}

//（3）给一个不多于五位的正整数，要求：1.求它是几位数；2.逆序打印各位数字
//#include<stdio.h>
//int count(int n)
//{//12345
//	int c = 1;
//	while (n / 10 != 0)
//	{
//		c++;
//		n /= 10;
//	}
//	return c;
//}
//
//void Print(int n)
//{
//	while (n != 0)
//	{
//		printf("%d\n", n % 10);
//		n /= 10;
//	}
//}
//
//int main()
//{
//	int m = 0;
//	int counts = 0;
//	printf("请输入一个不多于五位的正整数：\n");
//	scanf("%d", &m);
//	if (m / 1000 == 0){
//		printf("输入错误，请重新输入！");
//	}
//	else
//	{
//		//写一个函数，输出传入数字的位数
//		counts = count(m);
//		printf("数字%d的位数是：%d\n", m,counts);
//		//写一个函数，逆序打印数字的每一位
//		printf("数组%d逆序输出：\n", m);
//		Print(m);
//	}
//	
//	return 0;
//}

//（4）利用条件运算完成此题：学习成绩>=90分的同学用A表示，
//60-89分之间的用B表示60分以下的用C表示
//#include<stdio.h>
//int main()
//{
//	int sc = 0;
//	printf("请输入该同学的成绩：\n");
//	while (scanf("%d", &sc) != EOF)
//	{
//		if (sc >= 90)
//		{
//			printf("这位同学的成绩评定为：A!\n");
//		}
//		else if ((sc >= 60) && (sc <= 89))
//		{
//			printf("这位同学的成绩评定为：B!\n");
//		}
//		else
//		{
//			printf("这位同学的成绩评定为：C!\n");
//		}
//		printf("请输入该同学的成绩：\n");
//	}
//	return 0;
//}

//（5）输入年和月，则输出此年此月的天数，如大月有31天，小月有30天。
//而闰年的2月有29天，平年则有28天。（使用switch结构实现）
//
//（6）求100个随机整数之和，随机数要求为0-9的整数
//
//（7）编写一个程序，输入三个双精度数，输出其中的最小数
//
//（8）题目：输入三个整数x，y，z，请把这三个数由小到大输出
//
//（9）编写一个程序，求出所有各位数字的立方和等于1099的三位整数

//（10）要求在屏幕上分别显示求1到100之间奇数和偶数之和
//#include<stdio.h>
//int main()
//{
//	int i = 0;
//	int sum1 = 0;//存放奇数和
//	int sum2 = 0;//存放偶数和
//	for (i = 0; i <= 100; i++)
//	{
//		if (i % 2 != 0)
//		{
//			sum1 += i;
//		}
//		else
//		{
//			sum2 += i;
//		}
//	}
//	printf("一到一百之间的奇数和是：%d\n一到一百之间的偶数和是：%d\n", sum1, sum2);
//	return 0;
//}

//（11）输入十个数，并显示最大的数和最小的数
//#include<stdio.h>
//int main()
//{
//	int arr[10];//定义拥有十个整形元素的数组arr
//	int max = 0;//整形变量，存放最大元素
//	int min = 0;//整形变量，存放最小元素
//	int i = 0;//循环
//	//循环输入十个数字
//	printf("请输入十个数字：\n");
//	for (i = 0; i < 10; i++)
//	{
//		scanf("%d", &arr[i]);
//	}
//	max = arr[0];
//	for (i = 0; i < 10; i++)
//	{
//		if (max < arr[i])
//		{
//			max = arr[i];
//		}
//	}
//	min = arr[0];
//	for (i = 0; i < 10; i++)
//	{
//		if (min > arr[i])
//		{
//			min = arr[i];
//		}
//	}
//	printf("最大的数max = %d，最小的数min = %d\n", max, min);
//	return 0;
//}

//（12）中秋佳节，有贵客来到草原，主人要从羊群中选一只肥羊宴请宾客，
//当然要选 最肥者，这样就要记录下每只羊的重量
/* 找出最重的羊 */
//#include "stdio.h"
//void main()
//{
//	float sheep[10]; //数组,有10个浮点类型元素,用于存放10只着每只的重量
//	float bigsheep = 0.0;               //浮点型变量,存放最肥羊的重量
//	int bigsheepno = 0, i;           //整型变量记录最肥羊的编号,i计数循环
//	//循环输入10只羊的数量
//	for (i = 0; i<10; i++)
//	{
//		printf("请输入羊的重量:");
//		scanf("%f", &sheep[i]);
//	}
//	//假设第0只是最肥的
//	bigsheep = sheep[0];
//	//依次比较一遍
//	for (i = 0; i<10; i++)
//	{
//		if (bigsheep<sheep[i])        //如果第i只羊比当前羊肥大
//		{
//			bigsheep = sheep[i];       //第i只羊为当前最肥羊
//			bigsheepno = i;            //记录第i只着的编号
//		}
//	}
//	//输出最肥羊的重量
//	printf("最肥羊的重量是:%f\n", bigsheep);
//	//输出最肥羊的编号
//	printf("最肥羊的编号为:%d\n", bigsheepno);
//}
