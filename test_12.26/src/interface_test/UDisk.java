package interface_test;

/**
 * @program:test_12.26
 * @author: Nine_odes
 * @description:
 * @create:2019-12-28 09:50
 */
public class UDisk implements USB {
    @Override
    public void plugin() {
        System.out.println("U盘正在加载驱动");
    }

    @Override
    public void work() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void setup() {
        System.out.println("U盘正在插入电脑");
    }


}
