package test;

import dao.UserDao;
import entiy.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-03 14:15
 **/
public class UserDaoTest {

    @org.junit.Test
    public void login() {
        User user = new User();
        user.setU_LoginName("xiaozou");
        user.setU_pwd("xiaozou123");
        UserDao userDao = new UserDao();
        User user1 = userDao.login(user);
        if(user1 ==null){
            System.out.println("登陸失敗！");
        }else{
            System.out.println("登錄成功！" + user1.getU_LoginName());
        }
    }

    @org.junit.Test
    public void add() {
        User user = new User();
        user.setU_LoginName("linchen");
        user.setU_pwd("linchen123");
        user.setU_realName("林晨");
        UserDao userDao = new UserDao();
        int ret = userDao.add(user);
        if(ret !=0){
            System.out.println("添加成功！！" + user.getU_LoginName());
        }else{
            System.out.println("添加失敗！！");
        }
    }

    @org.junit.Test
    public void findByPage() {
        UserDao userDao = new UserDao();
        Map<String,String[]> map = new HashMap<>();
        List<User> users =  userDao.findByPage(0,4,map);
        System.out.println(users);
    }


    @org.junit.Test
    public void findAllRecord() {
        Map<String,String[]> map = new HashMap<>();
        UserDao userDao = new UserDao();
        int ret = userDao.findAllRecord(map);
        System.out.println("總記錄數為："+ret);
    }
}