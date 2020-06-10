package day9;

/**
 * @program:test_6.10
 * @author:Nine_odes
 * @description:
 * @create:2020-06-10 09:55
 **/
class Person{
    String name = "No name";
    public Person(String nm){
        name = nm;
    }
}
class Employee extends Person{
    String nm;
    String empID = "0000";
    public Employee(String id,String nm){
        super(nm);
        empID = id;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        String x = "fmn";
        x.toUpperCase();
        String y = x.replace('f','F');
        y = y +"wxy";
        System.out.println(y);
    }
}
