package service;

import dao.UserDao;
import entiy.PageBean;
import entiy.User;
import sun.nio.cs.US_ASCII;

import java.util.List;
import java.util.Map;

/**
 * @program:javaWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-07-16 10:05
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

    public User find(int id){
        UserDao userDao = new UserDao();
        User user = userDao.find(id);
        return user;
    }

    public int updateUser(User upUser){
        UserDao userDao = new UserDao();
        int ret = userDao.updateUser(upUser);
        return ret;
    }

    /**
     *
     * @param currentPage
     * @param rows
     * @param map
     * @return
     * 确定
     *     private int totalCount;//总记录数 findAllRecord
     *     private int totalPage;//总页码
     *     private List<T> list;//每一页当中的数据
     *     private int currentPage;//当前页码
     *     private int rows;//每一页的记录数
     */
    public PageBean<User> findAllByPage(int currentPage,int rows,Map<String,String[]> map){
        PageBean<User> pageBean = new PageBean<>();
        UserDao userDao = new UserDao();
        int totalCount = userDao.findAllRecord(map);
        int totalPage = 0;
        if(totalCount % rows != 0){
            totalPage = totalCount / rows + 1;
        }else {
            totalPage = totalCount / rows;
        }
        pageBean.setTotalPage(totalPage);
        pageBean.setTotalCount(totalCount);

        int start = (currentPage - 1) * rows;
        List<User> userList = userDao.findByPage(start,rows,map);
        pageBean.setList(userList);
        pageBean.setRows(rows);
        pageBean.setCurrentPage(currentPage);

        return pageBean;
    }

}
