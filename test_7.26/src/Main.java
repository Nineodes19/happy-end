/**
 * @program:test_7.26
 * @author:Nine_odes
 * @description:百万富翁
 * @create:2020-07-26 14:41
 **/
public class Main {
    public static void main(String[] args) {
        long money1 = 0l;
        long money2 = 0l;
        long sum = 1l;
        for(long i = 0l; i < 30; i++){
            money1 += 10;
            money2 += sum;
            sum *= 2;
        }
        System.out.println(money1 + " " + money2);
    }
}
