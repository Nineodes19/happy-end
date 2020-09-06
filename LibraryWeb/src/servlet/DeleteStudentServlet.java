package servlet;

import service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-04 20:06
 **/
public class DeleteStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");

        String xhString = req.getParameter("xh");
        int stu_xh = Integer.parseInt(xhString);

        StudentService studentService = new StudentService();
        int ret = studentService.delete(stu_xh);
        if(ret == 1){
            resp.sendRedirect("/list_student.html");
        }else{
            System.out.println("删除失败！！");
            resp.getWriter().write("<h2 删除失败！>" + "</h2>");
        }
    }
}
