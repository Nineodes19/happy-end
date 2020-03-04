package operation;

import book.BookList;

/**
 * @program:TestBook
 * @author:Nine_odes
 * @description:
 * @create:2020-03-04 18:39
 **/
public class DisplayOperarion implements IOperarion {
    @Override
    public void work(BookList bookList) {
        System.out.println("显示所有图书");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            //System.out.println(bookList[i]);
            System.out.println(bookList.getBook(i));
        }
    }
}
