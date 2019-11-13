//#include<stdio.h>
//
//int main()
//{
//	int arr1[] = { 1, 3, 5, 7, 9 };
//	int arr2[] = { 2, 4, 6, 8, 0 };
//	int sz = sizeof(arr1) / sizeof(arr1[0]);
//	int temp = 0;
//	int i = 0;
//
//	for (i = 0; i < sz; i++)
//	{
//		temp = arr1[i];
//		arr1[i] = arr2[i];
//		arr2[i] = temp;
//	}
//	i = 0;
//	for(i = 0; i < sz; i++)
//	{
//		printf("%d %d\n",arr1[i], arr2[i]);
//	}
//	return 0;
//}

#include<stdio.h>

int main()
{
	int i = 0;
	double sum = 0;
	int flag = 1;
	for (i = 1; i <= 100; i++)
	{
		sum += flag*1.0 / i;
		flag = -flag;
	}
	printf("%lf\n", sum);
	return 0;
}