package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entiy.Student;
import service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-04 19:42
 **/
@WebServlet("/updateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String stu_name = req.getParameter("name");
        String stu_pwd = req.getParameter("pwd");
        String stu_sex = req.getParameter("sex");
        String ageString = req.getParameter("age");
        int stu_age = Integer.parseInt(ageString);
        String stu_mobile = req.getParameter("mobile");
        String stu_address = req.getParameter("address");

        Object stu = req.getSession().getAttribute("updateStudent");
        Student student = (Student) stu;
        Student updateStudent = new Student();

        updateStudent.setStu_xh(student.getStu_xh());
        updateStudent.setStu_name(student.getStu_name());
        updateStudent.setStu_pwd(student.getStu_pwd());
        updateStudent.setStu_sex(student.getStu_sex());
        updateStudent.setStu_age(student.getStu_age());
        updateStudent.setStu_mobile(student.getStu_mobile());
        updateStudent.setStu_address(student.getStu_address());

        StudentService studentService = new StudentService();
        int ret = studentService.updateStudent(updateStudent);
        Map<String,Object> returnMap = new HashMap<>();
        if(ret == 1){
            returnMap.put("msg",true);
        }else{
            returnMap.put("msg",false);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(resp.getWriter(),returnMap);
    }
}
