#define  _CRT_SECURE_NO_WARNINGS

//���ط���
/*
�ù�����һ�ٸ����䣬��һ��һ�ٱ��˺ţ���һ������Ա�����еķ����Ŷ����ˡ�
�ڶ�������Ա�����б����2�ı����ķ��䡰�෴����
����������Ա�����б����3�ı����ķ��������෴����
��һ�ٸ�����Ա�������ļ������Ǵ򿪵�
*/
//#include<stdio.h>
//int main()
//{
//	int m = 0;//��ʾ������
//	int n = 0;//��ʾ����Ա���
//	int temp[100] = { 0};//�洢�����ŵ�״̬
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
//	printf("���ŵķֱ�Ϊ:\n");
//	for (m = 1; m <= 100; m++)
//	{
//		if (temp[m-1])
//		{
//			printf("%d ", m);
//		}
//	}
//	return 0;
//}

//��5����������£������������µ��������������31�죬С����30�졣
//�������2����29�죬ƽ������28�졣��ʹ��switch�ṹʵ�֣�
//#include<stdio.h>
//int main()
//{
//	int year = 0;
//	int month = 0;
//	int temp = 0;
//	printf("����������£�\n");
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
//			printf("%d��%d�¹���31�죡", year, month);
//			break;
//		case 4:case 6:case 9:case 11:
//			printf("%d��%d�¹���30�죡\n", year, month);
//			break;
//		case 2:
//			switch (temp)
//			{
//			case 0:
//				printf("%d��%d�¹���28�죡\n", year, month);
//				break;
//			case 1:
//				printf("%d��%d�¹���29�죡\n", year, month);
//				break;
//			}
//		}
//	}
//	
//	return 0;
//}
//��6����100���������֮�ͣ������Ҫ��Ϊ0-9������
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
//	printf("100���������֮���ǣ�%d��", sum);
//}
//��7����дһ��������������˫��������������е���С��
//
//��8����Ŀ��������������x��y��z���������������С�������
//
//��9����дһ������������и�λ���ֵ������͵���1099����λ����



#include <stdio.h>

//ð������ 
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
	printf("����֮�������Ԫ��Ϊ��\n");
	for (i = 0; i<n; i++)
	{
		printf("%d ", num[i]);
	}
}
//���ֲ���
int search(int num[], int n, int m)
{
	int mid = (n - 1) / 2;
	int left = 0;
	int right = n - 1;
	while (left<=right)
	{
		if (num[mid] == m)
		{
			printf("�±�Ϊ%d", mid);
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