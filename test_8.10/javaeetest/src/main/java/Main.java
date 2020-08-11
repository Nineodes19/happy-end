import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program:test_8.10
 * @author:Nine_odes
 * @description:
 * @create:2020-08-10 19:45
 **/


//public class Main {
//    public static void main(String[] args) {
//        /**
//         * Spring开启容器的方式，ApplicationContent 应用上下文可以配置并管理Bean对象，以及其他的工作）
//         * 创建一个
//         */
//        ApplicationContext context = new ClassPathXmlApplicationContext("applications.xml");
//        //new String();
//        String bit = (String)context.getBean("bit");
//    }
//}


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applications.xml");
        String bit = (String)context.getBean("bit");
        //String bit2 = (String)context.getBean("java.lang.String#0");
        System.out.println(bit);
        //System.out.println(bit2);


        String bit2 = (String)context.getBean(String.class);
        System.out.println(bit2);
        //通过类型获取bean对象，如果该类型有多个对象，就会报错，只支持一个该类型的对象
    }
}