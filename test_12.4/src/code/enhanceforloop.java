package code;

/**
 * @program:test_12.4
 * @author: Nine_odes
 * @description:
 * @create:2019-12-04 13:41
 */
public class enhanceforloop {

    public static void main(String[] args) {
        String[] array = {"Ron","Harry","Hermoine"};

        //for each
        for(String x :array) {
            System.out.println(x);
        }
        System.out.println("****************");
        for(int i = 0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
