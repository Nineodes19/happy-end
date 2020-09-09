/**
 * @program:test_9.9
 * @author:Nine_odes
 * @description:
 * @create:2020-09-09 23:15
 **/
public class TestDemo3 {
    //输入一个整数，输入该数32位二进制表示中1的个数
    //其中负数用补码表示
    public int NumberOf1(int n){
        int count = 0;
        int flag = 1;
        while(flag != 0){
            //n=5
            //101
            //111
            //101相同为真
            if((n & flag) != 0){
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    public int NumberOf12(int n){
        int count = 0;
        while(n != 0){
            ++count;
            n = (n-1) &n;
        }
        return count;
    }
}
