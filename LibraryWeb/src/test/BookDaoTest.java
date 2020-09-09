package test;

import dao.BookDao;
import dao.StudentDao;
import dao.UserDao;
import entiy.Book;
import entiy.Student;
import entiy.User;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-08 13:29
 **/
public class BookDaoTest {

    @Test
    public void add() {
        BookDao bookDao = new BookDao();
        Book book = new Book();

        book.setB_name("C和指针");
        book.setB_author("Kenneth A.Reek");
        book.setB_type("计算机编程书籍");
        book.setB_publish("人民邮电出版社");
        book.setB_condition("未借出");
        book.setB_price(65.00);
        book.setB_position("ZX_0011");
        int ret = bookDao.add(book);
        if(ret != 0){
            System.out.println("添加成功！！" + book.getB_name());
        }else{
            System.out.println("添加失败！！");
        }
    }

    @Test
    public void delete() {
        BookDao bookDao = new BookDao();
        int ret = bookDao.delete("C和指针");
        if(ret != 0){
            System.out.println("删除成功！！");
        }else{
            System.out.println("删除失败！！");
        }
    }

    @Test
    public void find() {
        BookDao bookDao = new BookDao();
        Book book = bookDao.find(1000);
        if(book == null){
            System.out.println("查无此书");
        }else{
            System.out.println("已经查找到" + book.getB_name());
        }
    }

    @Test
    public void updateBook() {
        BookDao bookDao = new BookDao();
        Book book = new Book();
        book.setB_name("C和指针");
        book.setB_author("Kenneth A.Reek");
        book.setB_type("计算机编程书籍");
        book.setB_publish("人民邮电出版社");
        book.setB_condition("未借出");
        book.setB_price(65.00);
        book.setB_position("ZX_0011");
        int ret = bookDao.updateBook(book);
        if(ret != 0){
            System.out.println("修改成功！");
        }else{
            System.out.println("修改失败！");
        }
    }

    @Test
    public void findByPage() {
        BookDao bookDao = new BookDao();
        Map<String,String[]> map = new HashMap<>();
        List<Book> books =  bookDao.findByPage(0,4,map);
        System.out.println(books);
    }

    @Test
    public void findAllRecord() {
        Map<String,String[]> map = new HashMap<>();
        BookDao bookDao = new BookDao();
        int ret = bookDao.findAllRecord(map);
        System.out.println("總記錄數為："+ret);
    }

    @Test
    public void sort() {
        BookDao bookDao = new BookDao();
        List<Book> books = bookDao.sort();
        if(books != null){
            System.out.println("排序成功！");
        }else{
            System.out.println("排序失败！");
        }
    }
}