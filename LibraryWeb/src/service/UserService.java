package service;

import dao.UserDao;
import entiy.PageBean;
import entiy.User;

import java.util.List;
import java.util.Map;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-02 14:12
 **/
public class UserService {

    public User login(User loginUser){
        UserDao userDao = new UserDao();
        User user = userDao.login(loginUser);
        return user;
    }

    public int add(User user){
        UserDao userDao = new UserDao();
        int ret = userDao.add(user);
        return ret;
    }

    public int delete(int id){
        UserDao userDao = new UserDao();
        int ret = userDao.delete(id);
        return ret;
    }

    /**
     *     private int totalCount;//总记录数
     *     private int totalPage;//总页码数
     *     private List<T> list;//每页中的数据
     *     private int currentPage;//当前页码
     *     private int rows;//每页的记录数
     * @param currentPage 当前页码
     * @param rows
     * @param map
     * @return
     */
    public PageBean<User> findAllByPage(int currentPage, int rows, Map<String,String[]> map){
        PageBean<User> pageBean = new PageBean<>();
        UserDao userDao = new UserDao();
        int totalCount = userDao.findAllRecord(map);//总记录数
        int totalPage = 0;
        if(totalCount % rows != 0){
            totalPage = totalCount/rows + 1;
        }else{
            totalPage = totalCount/ rows;
        }
        pageBean.setTotalCount(totalCount);
        pageBean.setTotalPage(totalPage);
        int start = (currentPage-1)*rows;
        List<User> userList = userDao.findByPage(start,rows,map);
        pageBean.setList(userList);
        pageBean.setCurrentPage(currentPage);
        pageBean.setRows(rows);

        return pageBean;
    }
}
