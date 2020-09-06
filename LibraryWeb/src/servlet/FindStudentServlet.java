package servlet;

import entiy.Student;
import service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-04 19:32
 **/
@WebServlet("/findStudentServlet")
public class FindStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String idString = req.getParameter("stu_xh");
        int id = Integer.parseInt(idString);
        StudentService studentService = new StudentService();
        Student student = studentService.find(id);
        if(student == null){
            System.out.println("没有要修改的对象！");
        }else{
            req.getSession().setAttribute("updateStudent",student);
            resp.sendRedirect("/updateStudent.html");
        }
    }
}
