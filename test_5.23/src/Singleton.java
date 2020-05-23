/**
 * @program:test_5.23
 * @author:Nine_odes
 * @description:
 * @create:2020-05-23 15:07
 **/
public class Singleton {
    private volatile static Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance(){

        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
