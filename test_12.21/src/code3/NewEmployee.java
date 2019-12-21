package code3;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 19:56
 */
public class NewEmployee {
    private String name;
    private double salary;
    private Date hireDay;

    public NewEmployee(String n,double s,int year,int month,int day){
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(day,month -1,day);
        hireDay = calendar.getTime();
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }

    public Date getHireDay(){
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary+= raise;
    }
}
