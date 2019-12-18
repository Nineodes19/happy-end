package code4;

import javax.naming.ldap.PagedResultsControl;

/**
 * @program:test_12.18
 * @author: Nine_odes
 * @description:
 * @create:2019-12-18 22:59
 */
class Person{
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}
class Student extends Person{}
class Teacher extends Person{}
public class ExtendsDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.eat();
        s.sleep();
        System.out.println("---------");

        Teacher t = new Teacher();
        t.eat();
        t.sleep();
    }
}
