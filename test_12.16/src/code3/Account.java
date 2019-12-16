package code3;

/**
 * @program:test_12.16
 * @author: Nine_odes
 * @description:Account类封装储户信息及部分功能
 * @create:2019-12-16 20:34
 */
public class Account {
    private String number = null;
    private String name = null;
    private String password = null;
    private double money = 0.0;
    /***********构造方法***************/
    public Account(String number, String name, String password, double money) {
        this.number = number;
        this.name = name;
        this.password = password;
        this.money = money;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public double getMoney() {
        return money;
    }

    public void sub_Balance(double mon){
        money -= mon;
    }

    public void add_Balance(double mon){
        money += mon;
    }

}
