#define _CRT_SECURE_NO_WARNINGS
//��7����дһ��������������˫��������������е���С��
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
//	printf("��С���ǣ�%.2f", min(arr, 3));
//	return 0;
//}
//��8����Ŀ��������������x��y��z���������������С�������
//#include<stdio.h>
////дһ������������������С�������
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
//	printf("����������������\n");
//	scanf("%d%d%d", &x, &y, &z);
//	Print(&x, &y, &z);
//	return 0;
//}
//��9����дһ������������и�λ���ֵ������͵���1099����λ����
//#include<stdio.h>
//#include<math.h>
//
////дһ������������һ�����ָ�λ����������
//
//int main()
//{
//	int i = 0;
//	int a = 0;//��λ
//	int b = 0;//ʮλ
//	int c = 0;//��λ
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