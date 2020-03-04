import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.Usr;

import java.util.Scanner;

/**
 * @program:TestBook
 * @author:Nine_odes
 * @description:
 * @create:2020-03-03 21:15
 **/


public class Main {
    public static void main(String[] args) {

        //3.准备数据
        BookList bookList = new BookList();
        //1.登录
        Usr usr = login();
        /**
         * 重写的方法
         * 父类引用 引用了自雷的对象，且父类和子类有同名的覆盖方法
         */
        while(true){
            int chioc = usr.menu();
            //下一步：根据菜单的提示，进行操作
            usr.doOperation(chioc,bookList);
        }

    }

    public static Usr login(){
        System.out.println("输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("请输入你的身份：1-->管理员 0：普通用户");
        int n = scanner.nextInt();//1  0

        if(n==1){
            //管理员
            return new AdminUser(name);
        }else{
            //普通用户
            return new NormalUser(name);
        }


    }
}
