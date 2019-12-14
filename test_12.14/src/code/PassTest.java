package code;

/**
 * @program:test_12.14
 * @author: Nine_odes
 * @description:
 * @create:2019-12-14 23:14
 */
public class PassTest {
    float ptValue;
    public void changeInt(int value){
        System.out.println("In changeInt:" + value);
        value = 55;
    }

    public void changeArrayValue(int[] xc) {
        System.out.println("In changArrayValue:" + xc[1]);
        xc[1] = 6;
    }

    public static void main(String[] args) {
        int val = 11;
        int[] sc = {1,9};
        PassTest passTest = new PassTest();
        passTest.ptValue = 20;
        passTest.changeInt(val);
        System.out.println("Current Int value is:" + val);
        passTest.changeArrayValue(sc);
        System.out.println("Current Value in array is：" + sc[1]);
    }
}
