package packaging;

import sun.plugin.viewer.context.AxBridgeAppletContext;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @program:test_12.10
 * @author: Nine_odes
 * @description:
 * @create:2019-12-11 15:34
 */

class Account{
    public int id;//账户ID
    private String password = "123456";//账户密码
    private double sal;//余额
    private String data;//出生日期

    //取得password的值
    public String getPassword(){
        return password;
    }

    //修改password的值,setter方法
    public void setPassword(String password){
        //验证密码
        System.out.println("请输入原密码：");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if(text.equals(this.password)){
            //输入正确
            System.out.println("欢迎登录系统");
            System.out.println("正在修改密码。。。");
            this.password = password;
        }else{
            System.out.println("密码错误，查证后再试！");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Account(int id, String password, double sal) {
        this.id = id;
        this.password = password;
        this.sal = sal;
    }

    public Account(int id, double sal) {
        this.id = id;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", sal=" + sal +
                ", data='" + data + '\'' +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
       // Account account = new Account();
//        account.id = 123;
////        account.password = "123456";
////        account.sal = 1.0;
//        System.out.println(account.id);
////        System.out.println(account.password);
////        System.out.println(account.sal);
        //account.setPassword("java30");
        //System.out.println(account.getPassword());

        Account account = new Account(123456,"test",0.0);
        //System.out.println("id:" +account.getId()+", passwoed:" + account.getPassword()+", sal:" +account.getSal());
        System.out.println(account);
        new Account(345,0.0);
    }


}
