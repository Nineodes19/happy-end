package test;

import dao.StudentDao;
import dao.UserDao;
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
 * @create:2020-09-03 14:53
 **/
public class StudentDaoTest {

    @Test
    public void login() {
        StudentDao studentDao = new StudentDao();
        Student loginS = new Student();
        loginS.setStu_xh(10000);
        loginS.setStu_pwd("Nineodes123");
        Student student = studentDao.login(loginS);
        if(student != null){
            System.out.println("登陆成功！欢迎学生：" + student.getStu_xh() + "号！");
        }else{
            System.out.println("登录失败！");
        }
    }

    @Test
    public void add() {
        StudentDao studentDao = new StudentDao();
        Student student = new Student();
        student.setStu_name("九歌");
        student.setStu_pwd("jiuge123");
        student.setStu_sex("女");
        student.setStu_age(19);
        student.setStu_mobile("15159959845");
        student.setStu_address("陕西");
        int ret = studentDao.add(student);
        if(ret != 0){
            System.out.println("添加学生信息成功！！" + student.getStu_name());
        }else{
            System.out.println("添加失败！");
        }

    }

    @Test
    public void delete() {
        StudentDao studentDao = new StudentDao();
        int xh = 10003;
        int ret = studentDao.delete(xh);
        if(ret != 0){
            System.out.println("删除成功！！" + xh);
        }else{
            throw new RuntimeException("删除失败！！");
        }
    }

    @Test
    public void find() {
        int xh = 10000;
        StudentDao studentDao = new StudentDao();
        Student student = studentDao.find(xh);
        if(student == null){
            System.out.println("没有该学生信息！！");
        }else{
            System.out.println("查询完成！！该学生信息如下： \n"+student);
        }
    }

    @Test
    public void updateUser() {

//        update student set stu_pwd=?,stu_sex=?,stu_age=?,stu_mobile=?,stu_addrss=? where stu_xh=?
        StudentDao studentDao = new StudentDao();
        Student upStudent = new Student();


        upStudent.setStu_pwd("jiubaobao123");
        upStudent.setStu_sex("女");
        upStudent.setStu_age(20);
        upStudent.setStu_mobile("15265823698");
        upStudent.setStu_address("河南");
        upStudent.setStu_xh(10002);
        int ret = studentDao.updateStudent(upStudent);
        if(ret != 0){
            System.out.println("更新成功！！");
        }else{
            System.out.println("更新失败！！");
        }
    }

    @Test
    public void findByPage() {
        StudentDao studentDao = new StudentDao();
        Map<String,String[]> map = new HashMap<>();
        List<Student> students =  studentDao.findByPage(0,4,map);
        System.out.println(students);
    }

    @Test
    public void findAllRecord() {
        Map<String,String[]> map = new HashMap<>();
        StudentDao studentDao = new StudentDao();
        int ret = studentDao.findAllRecord(map);
        System.out.println("總記錄數為："+ret);
    }
}