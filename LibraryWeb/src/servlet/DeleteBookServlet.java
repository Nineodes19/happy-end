package servlet;

import service.BookService;
import service.UserService;
import sun.plugin.dom.html.HTMLTableCaptionElement;

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
 * @create:2020-09-06 15:18
 **/
@WebServlet("/deleteBookServlet")
public class DeleteBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;chatset=utf-8");

        String b_name = req.getParameter("b_name");


        BookService bookService = new BookService();
        int ret = bookService.delete(b_name);
        if(ret == 1){
            resp.sendRedirect("/list.html");
        }else{
            System.out.println("删除失败！");
            resp.getWriter().write("<h2 删除失败！>" + "</h2>");
        }
    }
}
