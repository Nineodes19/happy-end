package code4;

/**
 * @program:test_12.18
 * @author: Nine_odes
 * @description:
 * @create:2019-12-18 22:53
 */
//public class Mouse {
//    private String name;
//    private int id;
//    public Mouse(String name,int id){
//        this.name = name;
//        this.id = id;
//    }
//
//    public void eat(){
//        System.out.println(name + "正在吃");
//    }
//
//    public void sleep(){
//        System.out.println(name + "正在睡");
//    }
//
//    public void introduction(){
//        System.out.println("大家好！我是" +  id + "号" + name + ".");
//    }
//}

public class Mouse extends Animal{
    public Mouse(String name,int id){
        super(name,id);
    }
}
