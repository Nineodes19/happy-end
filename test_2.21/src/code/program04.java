package code;

/**
 * @program:test_2.21
 * @author:Nine_odes
 * @description:有1,2,3,4四个数字，能组成多少个互不相同且无重复数字的三位数，都是多少？
 * @create:2020-02-21 21:50
 **/
public class program04 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if(i != j && j != k && i != k){
                        count ++;
                        System.out.print(i * 100 + j *10 + k + " ");
                    }
                }
            }
        }
    }
}
