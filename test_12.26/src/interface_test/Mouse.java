package interface_test;

/**
 * @program:test_12.26
 * @author: Nine_odes
 * @description:
 * @create:2019-12-28 09:48
 */
public class Mouse implements USB {
    @Override
    public void plugin() {
        System.out.println("鼠标插入电脑");
    }

    @Override
    public void work() {
        System.out.println("鼠标开始工作");
    }

    @Override
    public void setup() {

    }
}
