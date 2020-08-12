import frank.Duckshop;
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

//        Duck3 dk1 = (Duck3) context.getBean("dk1");
//        System.out.println(dk1);
//        for(String name:context.getBeanDefinitionNames()){
//            System.out.println(name);
//            System.out.println(context.getBean(name));
//            System.out.println("------------------");
//        }


        Duckshop shop = (Duckshop) context.getBean("shop");
        System.out.println(shop);
    }
}