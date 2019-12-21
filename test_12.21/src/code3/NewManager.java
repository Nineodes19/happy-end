package code3;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 20:01
 */
public class NewManager extends NewEmployee {
    private double bonus;
    public NewManager(String n,double s,int year,int month,int day){
        super(n,s,year,month,day);
        bonus = 0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return  baseSalary + bonus;
    }
    public void setBonus(double b){
        bonus = b;
    }
}
