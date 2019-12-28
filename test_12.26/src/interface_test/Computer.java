package interface_test;

/**
 * @program:test_12.26
 * @author: Nine_odes
 * @description:
 * @create:2019-12-28 09:54
 */
public class Computer {
    public void plugin(USB usb){
        usb.setup();
        usb.work();
    }
}
