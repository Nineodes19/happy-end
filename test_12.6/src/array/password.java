package array;

import java.util.Scanner;

/**
 * @program:test_12.6
 * @author: Nine_odes
 * @description:星际密码
 * @create:2019-12-06 21:01
 */
public class password {
    public static int[] a = new int[10002];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a[1] = 1;
        a[2] = 2;
        for (int i = 3; i < 10001; i++) {
            a[i] = a[i-1] + a[i-2];
            if(a[i] > 9999){
                a[i] %= 10000;
            }
        }

        while(sc.hasNext()){
            int n = sc.nextInt();//整数n--->第一行的输入
            StringBuilder code = new StringBuilder();
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if(String.valueOf(a[num]).length()==1)
                    code.append("000"+a[num]);
                else if(String.valueOf(a[num]).length()==2)
                    code.append("00"+a[num]);
                else if(String.valueOf(a[num]).length()==3)
                    code.append("0"+ a[num]);
                else if(String.valueOf(a[num]).length()==4)
                    code.append(""+a[num]);
            }
            System.out.println(code.toString());
        }
    }
}
