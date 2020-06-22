package day18;

/**
 * @program:test_6.22
 * @author:Nine_odes
 * @description:百万富翁问题
 * @create:2020-06-22 12:40
 **/
public class Main1 {
    public static void main(String[] args) {
        Long money1 = 0l;
        Long money2 = 0l;
        Long sum = 1l;
        for(Long i = 0l; i < 30; i++){
            money1+=10;

            money2 += sum;
            sum*=2;
        }
        System.out.println(money1 +"万元 " + money2+ "分");
    }
}
