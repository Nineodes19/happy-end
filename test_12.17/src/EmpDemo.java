/**
 * @program:test_12.17
 * @author: Nine_odes
 * @description:
 * @create:2019-12-17 19:26
 */
class Emp{
    public static double salary;
    public static String name = "Harsh";
}
public class EmpDemo {
    public static void main(String[] args) {
        Emp.salary = 1000;
        System.out.println(Emp.name +"'s average salary:" + Emp.salary);
    }
}
