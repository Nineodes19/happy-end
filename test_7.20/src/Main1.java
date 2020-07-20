import java.util.Scanner;

/**
 * @program:test_7.20
 * @author:Nine_odes
 * @description:奇偶校验
 * @create:2020-07-20 13:33
 **/
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.next();
            char[] arr = s.toCharArray();
            for(int j = 0; j < s.length(); j++){
                int c = (int)arr[j];
                String s1 = Integer.toBinaryString(c);
                String s2 = String.format("%07d",Integer.parseInt(s1));
                int count = 0;
                for (int i = 0; i < 7; i++) {
                    if(s2.charAt(i) == '1'){
                        count++;
                    }
                }
                System.out.println(count % 2 == 0 ? ("1" + s2):("0" + s2));
            }
        }
    }
}
