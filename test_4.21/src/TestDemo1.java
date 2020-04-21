import java.util.Scanner;

/**
 * @program:test_4.21
 * @author:Nine_odes
 * @description:
 * @create:2020-04-21 17:10
 **/
public class TestDemo1 {
    public static boolean isHw(String s){
        int len = s.length();
        char[] str = s.toCharArray();
        for (int i = 0,j = len-1; i < j; i++,j--) {
            if(str[i] != str[j] ){
                return false;
            }
        }
        return true;
    }
    public static int findIndex(String str){
        if (!isHw(str)){
            for(int i = 0,j = str.length()-1; i < j; i++,j--){
                if(str.charAt(i) != str.charAt(j)){
                    //此时，i或者j就是需要删除的字符
                    if(str.charAt(i) != str.charAt(j-1)){
                        return i;
                    }else{
                        return j;
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        String s = null;
        for (int i = 0; i < T ; i++) {
            s = sc.nextLine();
            System.out.println(findIndex(s));
        }
    }
}
