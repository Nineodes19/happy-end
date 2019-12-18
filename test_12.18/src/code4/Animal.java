package code4;

/**
 * @program:test_12.18
 * @author: Nine_odes
 * @description:
 * @create:2019-12-18 22:55
 */
public class Animal {
    private String name;
    private int id;
    public Animal(String name,int id){
        this.name = name;
        this.id = id;

    }

    public void eat(){
        System.out.println(name + "正在吃");
    }

    public void sleep(){
        System.out.println(name + "正在睡");
    }

    public void introduction(){
        System.out.println("大家好！我是" +  id + "号" + name + ".");
    }
}
