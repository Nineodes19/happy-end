package code4;

import code3.NewEmployee;
import code3.NewManager;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 20:15
 */
public class EmployeeArray {
    public static void main(String[] args) {
        NewEmployee[] staff = new NewEmployee[3];
        NewManager boss = new NewManager("Carl",80000,1987,12,15);
        boss.setBonus(5000);
        staff[0] = boss;
        staff[1] = new NewManager("Harry",50000,1989,10,1);
        staff[2] = new NewManager("Tommy",40000,1990,3,15);
        for (NewEmployee e: staff) {
            System.out.println("name = " + e.getName() + ",salary = " + e.getSalary());
        }
    }
}
