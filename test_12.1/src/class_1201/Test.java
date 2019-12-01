package class_1201;

/**
 * @program:test_12.1
 * @author: Nine_odes
 * @description:class
 * @create:2019-12-01 21:52
 */

//class Person{
//    public String name ="张三";
//    public int age = 18;
//
//    public void show(){
//        System.out.println("我叫" + name + ",今年" + age +"岁。");
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Person person = new Person();
//        //System.out.println("我叫" + person.name + ",今年" + person.age + "岁。");
//        person.show();
//    }
//}

//class Person{
//    private String name = "张三";
//    private int age = 18;
//
//    public void setName(String name){
//        //setName即为setter方法，表示设置这个成员的值
//        //this引用，表示调用该方法的对象，如果不使用this，相当于自赋值，
//        this.name = name;
//    }
//    public String getName(){
//        //getName即为getter方法，表示获取这个成员的值
//        return name;
//    }
//    public void show(){
//        System.out.println("我叫" + name + "，今年" + age + "岁。");
//    }
//
//}
//
//class Test{
//    public static void main(String[] args) {
//        Person person = new Person();
//        //person.age = 20;//报错
//        person.setName("曹操");
//        String name = person.getName();
//        //System.out.println(name);
//        person.show();
//    }
//}

//class Person{
//    private String name;
//    private int age;
//    private String sex;
//
//    //默认构造函数  构造对象
//    public Person(){
//        this.name = "caocao";
//        this.age = 10;
//        this.sex = "男";
//    }
//    //带有三个参数的构造函数
//    public Person(String name,int age,String sex){
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
//
//    public void show(){
//        System.out.println("name:" + name + "  age:" + age + "  sex:" + sex);
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        Person p1 = new Person();//调用不带参数的构造函数
//        p1.show();
//        Person p2 = new Person("张三丰",80,"男");
//        p2.show();
//    }
//}

class Person{
    private String name;
    private int age;
    private String sex;

    //默认构造函数
    public Person(){
        this("jiuge",19,"men");
    }

    public Person(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void show(){
        System.out.println("name:" + name + "   age:" + age + "   sex:" + sex);
    }
}

public class Test{
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
    }
}