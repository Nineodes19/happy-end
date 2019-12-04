package code;

/**
 * @program:test_12.4
 * @author: Nine_odes
 * @description:
 * @create:2019-12-04 13:42
 */
public class LooppitfallsDemo {

    public static void main(String[] args) {
        for(int i = 5; i != 0; i--) {
            System.out.println(i);
        }

        int x = 5;
        while(x == 5) {
            System.out.println("INTHELOOP");
            x--;
        }
    }
}
