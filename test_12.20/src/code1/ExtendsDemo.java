package code1;

/**
 * @program:test_12.20
 * @author: Nine_odes
 * @description:
 * @create:2019-12-20 13:31
 */
class Phone{
    public void call(String name){
        System.out.println("给" + name +"打电话");
    }
}

class NewPhone extends Phone{
//    public void call(String name){
//        super.call(name);
//        System.out.println("可以听天气预报了");
//    }
}
public class ExtendsDemo {
    public static void main(String[] args){
        NewPhone np = new NewPhone();
        np.call("张三");
    }
}
