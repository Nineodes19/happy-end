package operation;

import book.Book;
import book.BookList;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Scanner;

/**
 * @program:TestBook
 * @author:Nine_odes
 * @description:
 * @create:2020-03-04 18:39
 **/
public class DelOperarion implements IOperarion {



    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        /**
         * 需要找到删除这本书的位置
         *
         */
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int pos = -1;
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            if(bookList.getBook(i).getName().equals(name)){
                pos = i;
                break;
            }
        }
        if(pos == -1){
            System.out.println("没有你要删除的书！");
            return;
        }
        for (int i = pos; i < bookList.getUsedSize()-1; i++) {
            //把i下标的值 赋值给 i
            Book book = bookList.getBook(i+1);
            bookList.setBook(i,book);
        }

        bookList.setUsedSize(bookList.getUsedSize()-1);
    }
}
