package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entiy.Student;
import entiy.User;
import service.StudentService;
import service.UserService;

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
 * @create:2020-09-02 22:31
 **/
@WebServlet("/loginStudentServlet")
public class LoginStudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");

        String xh = req.getParameter("us");
        int stu_xh = Integer.parseInt(xh);
        String stu_pwd = req.getParameter("pa");

        Student loginStudent = new Student();
        loginStudent.setStu_xh(stu_xh);
        loginStudent.setStu_pwd(stu_pwd);

        StudentService studentService = new StudentService();
        Student student = studentService.login(loginStudent);


        Map<String,Object> returnMap = new HashMap<>();
        if(student != null){
            System.out.println("登录成功！欢迎" + stu_xh +"号学员" + student.getStu_name());
            req.getSession().setAttribute("student",student);
            returnMap.put("msg",true);
        }else{
            System.out.println("登录失败！");
            returnMap.put("msg",false);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(resp.getWriter(),returnMap);
    }
}
