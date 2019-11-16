#define _CRT_SECURE_NO_WARNINGS 1
//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	const char* str1 = "abcdef";
//	const char* str2 = "bbb";
//	if (strlen(str2) - strlen(str1) > 0)
//	{
//		printf("str2>str1\n");
//	}
//	else
//	{
//		printf("str1>str2\n");
//	}
//	return 0;
//}

//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	char str1[20];
//	char str2[20];
//	strcpy(str1, "To be ");
//	strcpy(str2, "or not to be");
//	strncat(str1, str2, 6);
//	puts(str1);
//
//	return 0;
//}

//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	char str[][5] = { "R2D2", "c3PO", "R2A6" };
//	int n;
//	puts("Looking for R2 astromech droids...");
//	for (n = 0; n < 3; n++)
//	{
//		if (strcmp(str[n], "R2xx", 2) == 0)
//		{
//			printf("found %s\n", str[n]);
//		}
//	}
//	return 0;
//}

//#include<stdio.h>
//#include<string.h>
//
//int main()
//{
//	char str[] = "This is a simple string";
//	char* pch;
//	pch = strstr(str, "simple");
//	strncpy(pch, "sample", 6);
//	puts(str);
//	puts(pch);
//	return 0;
//

//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	char str[] = "=This, a sample string.";
//	char *pch;
//	printf("Splitting string \"%s\" into tokens:\n", str);
//	pch = strtok(str, ",.=");
//	while(pch != NULL)
//	{
//		printf("%s\n", pch);
//		pch = strtok(NULL, ",.=");
//	}
//	return 0;
//}

//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	char *p = "jiugeqingchen@djiq.koq";
//	const char* sep = ".@";
//	char arr[30];
//	char* str = NULL;
//	strcpy(arr, p);//将数据拷贝一份，处理arr数组的内容
//	for (str = strtok(arr, sep); str != NULL; str = strtok(NULL, sep));
//	{
//		printf("%s\n", str);
//	}
//	return 0;
//}

//#include<stdio.h>
//#include<string.h>
//#include<errno.h>
//int main()
//{
//	FILE * pFile;
//	pFile = fopen("unexist.ent", "r");
//	if (pFile == NULL)
//	{
//		printf("Error opening file unexist.ent:%s\n", strerror(errno));
//	}
//	return 0;
//}


#include<stdio.h>
#include<ctype.h>
int main()
{
	int i = 0;
	char str[] = "Test String.\n";
	char c;
	while (str[i])
	{
		c = str[i];
		if (isupper(c))
		{
			c = tolower(c);

		}
		putchar(c);
		i++;
	}
	return 0;
}