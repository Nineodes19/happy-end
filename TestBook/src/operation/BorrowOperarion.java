package operation;

import book.Book;
import book.BookList;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import sun.misc.IoTrace;

import java.util.Scanner;

/**
 * @program:TestBook
 * @author:Nine_odes
 * @description:
 * @create:2020-03-04 18:39
 **/
public class BorrowOperarion implements IOperarion {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        //逻辑：当你找到了你要解约的书籍，直接将这本书籍的状态设置为true
        System.out.println("请输入你要借阅的图书：");
        Scanner sacnner = new Scanner(System.in);
        String name = sacnner.nextLine();

        //1.判断你要的这本书在不在书籍列表
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
            return;
        }

        //i = 1 ----->对应的就是那本借阅的书籍

        Book book = bookList.getBook(i);
        if(book.isBorrow())
        book.setBorrow(true);
    }
}
