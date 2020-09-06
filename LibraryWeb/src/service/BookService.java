package service;

import dao.BookDao;
import entiy.Book;
import entiy.PageBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-04 17:51
 **/
public class BookService {
    public int add(Book book){
        BookDao bookDao = new BookDao();
        int ret = bookDao.add(book);
        return ret;
    }
    public int delete(String name){
        BookDao bookDao = new BookDao();
        int ret = bookDao.delete(name);
        return ret;
    }

    public int updateBook(Book book){
        BookDao bookDao = new BookDao();
        int ret = bookDao.updateBook(book);
        return ret;
    }

    public PageBean<Book> findAllByPage(int currentPage,int rows,Map<String,String[]> map){
        PageBean<Book> pageBean = new PageBean<>();
        BookDao bookDao = new BookDao();
        int totalCount = bookDao.findAllRecord(map);
        int totalPage = 0;
        if(totalCount % rows != 0){
            totalPage = totalCount/rows + 1;
        }else{
            totalPage = totalCount/rows;
        }
        pageBean.setTotalPage(totalPage);
        pageBean.setTotalCount(totalCount);

        int start = (currentPage-1)*rows;
        List<Book> bookList = bookDao.findByPage(start,rows,map);
        pageBean.setRows(rows);
        pageBean.setCurrentPage(currentPage);
        pageBean.setList(bookList);

        return pageBean;
    }

    public PageBean<Book> sort(int currentPage,int rows,Map<String,String[]> map){
        PageBean<Book> pageBean = new PageBean<>();
        BookDao bookDao = new BookDao();
        int totalCount = bookDao.findAllRecord(map);
        int totalPage = 0;
        if(totalCount % rows != 0){
            totalPage = totalCount/rows + 1;
        }else{
            totalPage = totalCount/rows;
        }
        pageBean.setTotalPage(totalPage);
        pageBean.setTotalCount(totalCount);

        int start = (currentPage-1)*rows;
        List<Book> bookList = bookDao.sort();
        pageBean.setRows(rows);
        pageBean.setCurrentPage(currentPage);
        pageBean.setList(bookList);

        return pageBean;
    }
}
