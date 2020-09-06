package servlet;

import service.UserService;

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
 * @create:2020-09-04 19:59
 **/
@WebServlet("/deleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;chatset=utf-8");

        String idString = req.getParameter("u_id");
        int u_id = Integer.parseInt(idString);

        UserService userService = new UserService();
        int ret = userService.delete(u_id);
        if(ret == 1){
            resp.sendRedirect("/list.html");
        }else{
            System.out.println("删除失败！");
            resp.getWriter().write("<h2 删除失败！>" + "</h2>");
        }
    }
}
