package user;

import book.BookList;
import operation.IOperarion;

/**
 * @program:TestBook
 * @author:Nine_odes
 * @description:
 * @create:2020-03-04 18:44
 **/
public abstract class Usr {
    //protected专门为了继承而出现的
    protected String name;

    protected IOperarion[] iOperarions;

    //菜单
    public abstract int menu();

    public void doOperation(int chioc, BookList bookList){
        this.iOperarions[chioc].work(bookList);
    }
}
