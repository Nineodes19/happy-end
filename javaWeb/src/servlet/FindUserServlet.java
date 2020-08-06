package servlet;

import entiy.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program:javaWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-08-02 13:49
 **/
@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String idStrirng = req.getParameter("id");

        //将id转为整型是因为userService.find()的参数必须是整型
        int id = Integer.parseInt(idStrirng);
        UserService userService = new UserService();
        User user = userService.find(id);
        if(user == null){
            System.out.println("没有要修改的对象！");
        }else{
            req.getSession().setAttribute("updateUser",user);
            //跳转页面
            resp.sendRedirect("/update.html");
        }
    }
}
