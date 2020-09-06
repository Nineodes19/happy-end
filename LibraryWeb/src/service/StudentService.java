package service;

import dao.StudentDao;
import entiy.PageBean;
import entiy.Student;



import java.util.List;
import java.util.Map;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-02 22:52
 **/
public class StudentService {
    public Student login(Student loginStudent){
        StudentDao studentDao = new StudentDao();
        Student student = studentDao.login(loginStudent);
        return student;
    }

    public int add(Student student){
        StudentDao studentDao = new StudentDao();
        int ret = studentDao.add(student);
        return ret;
    }

    public int delete(int id){
        StudentDao studentDao = new StudentDao();
        int ret = studentDao.delete(id);
        return ret;
    }

    public Student find(int id){
        StudentDao studentDao = new StudentDao();
        Student student = studentDao.find(id);
        return student;
    }

    public int updateStudent(Student upStudent){
        StudentDao studentDao = new StudentDao();
        int ret = studentDao.updateStudent(upStudent);
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
    public PageBean<Student> findAllByPage(int currentPage, int rows, Map<String,String[]> map){
        PageBean<Student> pageBean = new PageBean<>();
        StudentDao studentDao = new StudentDao();
        int totalCount = studentDao.findAllRecord(map);
        int totalPage = 0;
        if(totalCount % rows != 0){
            totalPage = totalCount / rows + 1;
        }else {
            totalPage = totalCount / rows;
        }
        pageBean.setTotalPage(totalPage);
        pageBean.setTotalCount(totalCount);

        int start = (currentPage - 1) * rows;
        List<Student> studentList = studentDao.findByPage(start,rows,map);
        pageBean.setList(studentList);
        pageBean.setRows(rows);
        pageBean.setCurrentPage(currentPage);

        return pageBean;
    }

}
