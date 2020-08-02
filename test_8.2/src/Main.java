/**
 * @program:test_8.2
 * @author:Nine_odes
 * @description: 连续最大和
 * @create:2020-08-02 17:58
 **/

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        //dp[]表示到i位置时的连续最大和
//        //dp[i] 取dp[i-1] 和dp[i-1]+arr[i]的较大值
//        int max = Integer.MIN_VALUE,maxcur = 0;
//        for (int i = 0; i < n; i++) {
//            maxcur = Math.max(maxcur+arr[i],arr[i]);
//            max = Math.max(max,maxcur);
//        }
//        System.out.println(max);
//    }
//}




/**
 * @program:test_8.2
 * @author:Nine_odes
 * @description:
 * @create:2020-08-02 19:46
 **/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuffer s = new StringBuffer();
        int count = 0,max = Integer.MIN_VALUE;
        List<StringBuffer> list = new ArrayList<>();
        for(int i = 0; i < str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                count++;
                s.append(str.charAt(i));
            }else{
                if(count > max){
                    max = count;

                    s.delete(0,s.length());
                }

            }
        }
        list.add(s);
        for(StringBuffer l:list){
            System.out.print(l);
        }

    }
}
