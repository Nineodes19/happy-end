package user;

import operation.*;

import java.util.Scanner;

/**
 * @program:TestBook
 * @author:Nine_odes
 * @description:
 * @create:2020-03-04 18:44
 **/
public class NormalUser extends Usr{

    public NormalUser(String name) {
        this.name = name;
        this.iOperarions = new IOperarion[]{
                new FindOperarion(),
                new BorrowOperarion(),
                new ReturnOperarion(),
                new ExitOperarion()
        };
    }


    @Override
    public int menu() {
        System.out.println("hello" + this.name+"欢迎来到图书管理系统");
        System.out.println("============================");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("============================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
