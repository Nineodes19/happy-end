import java.util.Scanner;

/**
 * @program:test_7.31
 * @author:Nine_odes
 * @description:
 * @create:2020-07-31 18:15
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(getAns(s.toCharArray(),0,s.length()-1,false) ? "YES" : "NO");
        }
    }
    private static boolean getAns(char[] a,int start,int end,boolean flag){
        if(end <= start){
            return true;
        }
        if(a[start] == a[end]){
            return getAns(a,start+1,end-1,flag);
        }else if(flag){
            return false;
        }
        return getAns(a,start,end-1,true) || getAns(a,start+1,end,true);
    }
}
