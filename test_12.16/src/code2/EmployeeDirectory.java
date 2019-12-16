package code2;
import java.lang.String;

/**
 * @program:test_12.16
 * @author: Nine_odes
 * @description:
 * @create:2019-12-16 20:11
 */
public class EmployeeDirectory {
    public static void main(String[] args) {
        Employee[] dir = new Employee[4];
        Employee e1 = new Employee();
        e1.setName("zhangsan");
        e1.setSalary(100);
        dir[0] = e1;
        dir[1] = new Employee();
        for (int i = 2; i <= 3 ; i++) {
            dir[i] = new Employee("user" + i,200);
        }
        for (int j = 0; j <= 3 ; j++) {
            System.out.println("员工的姓名："+dir[j].getName());
            System.out.println("员工的工资："+dir[j].getSalary());
            System.out.println("//////////////////////////////");
        }
//        Employee employee = new Employee();
//        employee.setName("jiuge");
//        System.out.println(employee.getName());
    }
}
