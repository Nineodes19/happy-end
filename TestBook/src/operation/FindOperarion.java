package operation;

import book.BookList;

import java.util.Scanner;

/**
 * @program:TestBook
 * @author:Nine_odes
 * @description:
 * @create:2020-03-04 18:40
 **/
public class FindOperarion implements IOperarion{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        System.out.println("请输入要查找的书籍名称：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int i;
        for ( i = 0; i < bookList.getUsedSize(); i++) {
            if(bookList.getBook(i).getName().equals(name)){
                System.out.println(bookList.getBook(i));
                System.out.println("查找完毕！");
                break;
            }
        }

        if(i == bookList.getUsedSize()){
            System.out.println("没有此书籍。");
        }
    }
}
