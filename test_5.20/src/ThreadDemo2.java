import com.sun.jmx.snmp.SnmpInt;

/**
 * @program:test_5.20
 * @author:Nine_odes
 * @description:
 * @create:2020-05-20 21:29
 **/
public class ThreadDemo2 {
    static class Singleton {
        private static Singleton instance = null;

        private Singleton(){}

        public static Singleton getInstance(){
            if(instance == null){
                instance = new Singleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        ThreadDemo2.Singleton singleton = ThreadDemo2.Singleton.getInstance();
        ThreadDemo2.Singleton singleton1 = ThreadDemo2.Singleton.getInstance();
        ThreadDemo2.Singleton singleton2 = ThreadDemo2.Singleton.getInstance();
        System.out.println(singleton == singleton2);
        System.out.println(singleton == singleton1);
    }
}
