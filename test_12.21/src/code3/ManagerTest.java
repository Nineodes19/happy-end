package code3;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 20:03
 */
public class ManagerTest {
    public static void main(String[] args) {
        NewEmployee e = new NewEmployee("Harry Hacher",50000,1989,10,1);
        e.getName();
        e.raiseSalary(10);
        System.out.println(e.getName() + ":" + e.getSalary());
        NewManager boss = new NewManager("Carl Cracker",80000,1987,12,15);
        boss.setBonus(5000);
        System.out.println(boss.getName() + ":" + boss.getSalary());

        System.out.println();
    }
}
