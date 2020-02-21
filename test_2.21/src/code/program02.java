package code;

/**
 * @program:test_2.21
 * @author:Nine_odes
 * @description:一个数如果恰好等于它的因子之和，这个数就称为“完数”
 * 找出1000以内的所有完数
 * @create:2020-02-21 21:39
 **/
public class program02 {
    public static void main(String[] args) {
        System.out.println("一到一千的完数有：");
        for (int i = 1; i < 1000; i++) {
            int t = 0;
            for (int j = 1; j <= i / 2; j++) {
                if(i % j ==0){
                    t+= j;
                }
            }
            if(t == i){
                System.out.print(i + "  ");
            }
        }
    }
}
