package code2;

/**
 * @program:test_12.16
 * @author: Nine_odes
 * @description:员工基本信息
 * @create:2019-12-16 20:09
 */
public class Employee {
    private String name;
    private double salary;
    public Employee(){
        name = "unknown";
        salary = 0;
    }

    public Employee(String n,double s){
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
