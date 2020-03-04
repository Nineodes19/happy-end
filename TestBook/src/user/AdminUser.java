package user;

import operation.*;

import java.util.Scanner;

/**
 * @program:TestBook
 * @author:Nine_odes
 * @description:
 * @create:2020-03-03 21:23
 **/
public class AdminUser extends Usr{
    public AdminUser(String name) {
        this.name = name;
        this.iOperarions = new IOperarion[]{
                new ExitOperarion(),
                new FindOperarion(),
                new AddOperarion(),
                new DelOperarion(),
                new DisplayOperarion()
        };
    }

    @Override
    public int menu() {
        System.out.println("hello" + this.name + "欢迎来到图书系统");
        System.out.println("============================");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示所有图书");
        System.out.println("0.退出系统");
        System.out.println("============================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
