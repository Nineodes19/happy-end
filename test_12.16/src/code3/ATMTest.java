package code3;

import java.io.IOException;

/**
 * @program:test_12.16
 * @author: Nine_odes
 * @description:
 * @create:2019-12-16 21:19
 */
public class ATMTest {
    public static void main(String[] args) throws IOException {
        ATM atm = new ATM();
        atm.Welcome();
        atm.Load_Sys();
    }
}
