package abstractpackage;

/**
 * @program:test_12.26
 * @author: Nine_odes
 * @description:
 * @create:2019-12-26 19:17
 */
public class Test {
    public static void main(String[] args) {
        print(new Student());
        print(new Teacher());

    }
    public static void print(Person per){
        per.work();
    }
}
