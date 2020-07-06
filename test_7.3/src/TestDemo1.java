/**
 * @program:test_7.3
 * @author:Nine_odes
 * @description:
 * @create:2020-07-04 11:07
 **/
public class TestDemo1 {
    private static int taijie(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(n == 3){
            return 4;
        }
        else{
            return taijie(n-1) +taijie(n-2) + taijie(n-3);
        }
    }

    public static void main(String[] args) {
        System.out.println(taijie(15));
    }
}
