/**
 * @program:test_3.17
 * @author:Nine_odes
 * @description:
 * @create:2020-03-17 17:15
 **/
public class code2 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int i: A)
            sum += i;
        if(sum % 3 != 0)
            return false;
        int temp = 0,s = 0;
        for(int i = 0; i < A.length; i++){
            s += A[i];
            if(s == sum / 3){
                temp ++;
                s = 0;
            }
        }
        return temp >= 3;
    }
}

