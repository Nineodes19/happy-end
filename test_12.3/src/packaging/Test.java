package packaging;

import java.util.Scanner;

/**
 * @program:test_12.3
 * @author: Nine_odes
 * @description:封装
 * @create:2019-12-03 14:31
 */

//class Account{
//    //账户ID
//    public int id;
//    //账户密码
//    private String password = "123456";
//    //余额
//    private double sal;
//
//    //出生日期
//    private  String date;
//
//    //取得password值
//    //getter方法
////    public String getPassword() {
////        return password;
////    }
////
////    //修改password值
////    //setter方法
////    public void setPassword(String password) {
////        //验证密码
////        System.out.println("请输入原密码：");
////        Scanner scanner = new Scanner(System.in);
////        this.password = password;
////        String text = scanner.nextLine();
////        if(text.equals(this.password)){
////            //输入正确
////            System.out.println("欢迎登录系统");
////            System.out.println("正在修改密码。。。");
////            this.password = password;
////        }else{
////            System.out.println("密码错误，查证后再试");
////        }
////    }
//}

//class Account{
//        private int id;
//        private String password;
//        private double sal;
//        private String date;
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public double getSal() {
//        return sal;
//    }
//
//    public void setSal(double sal) {
//        this.sal = sal;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//}
//public class Test {
//    public static void main(String[] args) {
////        Account account = new Account();
////        account.id = 123;
//////        //private 修饰的变量password和sal不能调用
//////        account.password = "123456";
//////        account.sal = 1.0;
////        System.out.println(account.id);
//////        System.out.println(account.password);
//////        System.out.println(account.sal);
//        Account account = new Account();
////        account.setPassword("java30");
////        System.out.println(account.getPassword());
//    }
//}

    class Account{
        private int id;
        private String password;
        private  double sal;

        public Account(int id,String password,double sal){
            this.id = id;
            this.password =password;
            this.sal = sal;
        }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public double getSal() {
        return sal;
    }

    @Override
    public String toString() {
        return "Account{"+
                "id = "+id+
                ",sal= "+sal+
                "}";
    }

}
public class Test{
    public static void main(String[] args) {
        Account account = new Account(123456,"test",0.0);
        //输出银行卡信息
        //System.out.println("id为"+account.getId()+ ",密码为"+account.getPassword()+",余额为"+account.getSal());
        System.out.println(account);

        //匿名对象
        System.out.println( new Account(345,"test1",0.0));

    }
}