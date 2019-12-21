package code2;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 19:42
 */
class Employee{
    private String name;
    private int salary;
    public String getDetails(){
        return "Name:" + name + "\nSalary:" + salary;
    }
    Employee(){
        name = "Tom";
        salary = 1234;
    }
}

class Manager extends Employee{
    public String department;
    public String getDetails(){
        System.out.println("I am in Manager");
        return super.getDetails();
    }
    Manager(){
        super();
        department = "sale";
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println(m.getDetails());
        System.out.println("department:" + m.department);
    }
}
