package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @program:TestBook
 * @author:Nine_odes
 * @description:
 * @create:2020-03-04 18:38
 **/
public class AddOperarion implements IOperarion{

    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.next();
        System.out.println("请输入图书的作者：");
        String author = scanner.next();
        System.out.println("请输入图书的价格：");
        int price = scanner.nextInt();
        System.out.println("请输入图书的类型：");
        String type = scanner.next();

        Book book = new Book(name,author,price,type);
        int currentSize = bookList.getUsedSize();
        bookList.setBook(currentSize,book);
        bookList.setUsedSize(currentSize+1);
        System.out.println("新增图书成功");
    }
}
