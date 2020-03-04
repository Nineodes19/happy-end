package operation;

import book.BookList;

/**
 * @program:TestBook
 * @author:Nine_odes
 * @description:
 * @create:2020-03-04 18:39
 **/
public class ExitOperarion implements IOperarion {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(0);//代表程序正常退出
    }
}
