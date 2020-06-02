import java.util.Scanner;

/**
 * @program:test_6.2
 * @author:Nine_odes
 * @description:
 * @create:2020-06-02 15:07
 **/
public class HuiWen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.next();
        String s = sc.next();

        int ret = method(arr,s);
        System.out.println(ret);
    }

    private static boolean hw(StringBuffer s){
        for (int i = 0,j = s.length() -1; i < s.length(); i++,j--) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
    private static int method(String arr,String s){
        int count = 0;
        for (int i = 0; i < arr.length(); i++) {
            StringBuffer newarr = new StringBuffer(arr);
            newarr.insert(i,s);
            if(hw(newarr)){
                count++;
            }
        }
        return count;
    }

}
