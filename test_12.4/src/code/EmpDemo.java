package code;

/**
 * @program:test_12.4
 * @author: Nine_odes
 * @description:
 * @create:2019-12-04 13:40
 */
class Emp{
    public static double salary;
    public static String name = "Harsh";
}
public class EmpDemo {

    public static void main(String[] args) {
        Emp.salary = 1000;
        Emp.name = "Nine_odes";
        System.out.println(Emp.name + "'s average salary:" + Emp.salary);
    }
}
