/**
 * @program:test_10.14
 * @author:Nine_odes
 * @description:
 * @create:2020-10-14 21:22
 **/
public class TestDemo {
    public static void main(String[] args) {
        int number = 0;
        int number2 = 12;
        while(number < number2){
            if(number ++ == -- number2){
                number ++;
                break;
            }
            if(number == number2-2){
                number = number + 2;
                break;
            }
        }
        System.out.println(number);
    }
}
