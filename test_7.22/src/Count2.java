/**
 * @program:tes_7.22
 * @author:Nine_odes
 * @description:
 * @create:2020-07-22 20:03
 **/
public class Count2 {
    public static int counts(int n){
        int count = 0;
        int low,high,cur;
        //n = 111
        for (int i = 1; i <= n ; i*= 10) {
            //11---1----0
            high = (n/i)/10;
            //0---0
            low = n % i;
            //1----1
            cur = (n/i) %10;
            if(cur < 2) {
                count += high * i;//11+10
            }else if (cur > 2){
                count += (high + 1) * i;
            }else {
                count += high * i + low + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(counts(111));
    }
    public int countNumberOf2s(int n) {
        // write code here
        int count= 0;
        if(n <= 1) return  0;
        for(int i = 2; i < n; i++){
            while(i > 0){
                if(i %10 == 2){
                    count++;
                }
                i /= 10;
            }
        }
        return n;
    }
}
