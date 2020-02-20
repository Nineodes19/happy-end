package code1;

/**
 * @program:test_2.20
 * @author:Nine_odes
 * @description:有一个兔子，从出生后第三个月起每个月都生一对兔子，小兔子
 * 长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数是多少？
 * @create:2020-02-20 20:57
 **/
public class program01 {
    //
    public static void main(String[] args) {
        System.out.println("第1个月：1对");
        System.out.println("第2个月：1对");
        int r1 = 1,r2= 2,r,M = 12;
        for(int i = 3; i < M; i++){
            r = r2;
            r2 = r1 + r2;
            r1 = r;
            System.out.println("第" + i + "个月：" + r2 + "对");
        }
    }
}
