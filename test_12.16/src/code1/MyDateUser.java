package code1;

/**
 * @program:test_12.16
 * @author: Nine_odes
 * @description:
 * @create:2019-12-16 20:00
 */

class MyDate{
    private int day,month,year;

    public void tomorrow(){
        day = day + 1;
    }

    public void setDay(int d){
        day = d;
    }
}
public class MyDateUser {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
//        myDate.day = 21;
//        System.out.println("day = " + myDate.day);
        myDate.setDay(21);
    }
}
