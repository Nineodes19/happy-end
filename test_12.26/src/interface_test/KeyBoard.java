package interface_test;

/**
 * @program:test_12.26
 * @author: Nine_odes
 * @description:
 * @create:2019-12-28 09:49
 */
public class KeyBoard implements USB {
    @Override
    public void plugin() {
        System.out.println("键盘加载驱动");
    }

    @Override
    public void work() {
        System.out.println("键盘正在启动");
    }

    @Override
    public void setup() {
        System.out.println("键盘正在插入电脑");
    }
}
