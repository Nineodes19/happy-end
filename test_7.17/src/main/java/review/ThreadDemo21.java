package review;

/**
 * @program:test_717
 * @author:Nine_odes
 * @description:
 * @create:2020-07-17 16:17
 **/
public class ThreadDemo21 {
    static class Singleton{
        private volatile static Singleton instance = null;
        private Singleton(){};
        public static Singleton getInstance(){
            //指定对象加锁，因为是静态方法，
            // 直接针对类对象(唯一只有一份）加锁
            if (instance == null) {
                synchronized (Singleton.class) {
                    if(instance == null){
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }

    public static void main(String[] args) {
//        System.out.println(Integer.toBinaryString(32));
//        System.out.println(Integer.toBinaryString(34));
//        System.out.println(Integer.toBinaryString(35));
//        System.out.println(Integer.toBinaryString(36));
//        System.out.println(Integer.toBinaryString(37));

    }
}
