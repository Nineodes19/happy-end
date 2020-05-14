package code2;

import sun.dc.path.PathError;

/**
 * @program:test_12.19
 * @author: Nine_odes
 * @description:
 * @create:2019-12-19 19:12
 */
//public class Test {
//    public static void main(String[] args) {
////        Animal animal = new Animal();
////        animal.eat("食物");
//
//        Animal animal = new Cat();
//        System.out.println("食物");
//    }
//}


class Person{
    public void work(){
        System.out.println("人需要工作");
    }
}
class Student extends Person{
    public void work(){
        System.out.println("学生需要学习");
    }
}

class coder extends Person{
    public void work(){
        System.out.println("码农敲代码");
    }
}

public class Test{
    public static void main(String[] args) {
        Person per = new Person();
        per.work();
        Person per1 = new Student();
        per1.work();
    }
}