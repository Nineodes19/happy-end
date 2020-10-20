/**
 * @program:test_10.20
 * @author:Nine_odes
 * @description:
 * @create:2020-10-20 22:16
 **/
public class ReferanceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024 * 1024;
    private byte[] bigSize = new byte[2 * _1MB];

    public static void testGC(){
        ReferanceCountingGC objA = new ReferanceCountingGC();
        ReferanceCountingGC objB = new ReferanceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;
        System.gc();
    }
}
