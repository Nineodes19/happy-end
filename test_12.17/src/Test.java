/**
 * @program:test_12.17
 * @author: Nine_odes
 * @description:
 * @create:2019-12-17 17:55
 */
public class Test {
    public static void main(String[] args){
        int i,j,k;
        for(int num = 100; num <= 999; num++){
            i = num % 10;
            j = num / 10 % 10;
            k = num / 100;
            if(i * i * i + j * j * j + k * k * k == num){
                System.out.print(num + "\t");
            }
        }
        System.out.println();
    }
}
