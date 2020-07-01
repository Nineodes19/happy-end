package test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program:java630_maven
 * @author:Nine_odes
 * @description:
 * @create:2020-07-01 10:00
 **/
public class CalcServlet extends HttpServlet {
    //此处约定，用户提昂阿国url中的参数来描述操作数
    //url形如：http：//127.0.0.1:8080/FirstBlood/calc?a=10&b=20
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        //Tomcat在解析Request对象的时候，同样也是把参数部分，解析成键值对结构
        //1.先从req对象中获取到a和b两个值的内容
        String aStr = req.getParameter("a");
        String bStr = req.getParameter("b");
        if(aStr == null || aStr.equals("") || bStr == null || bStr.equals("")){
            resp.getWriter().write("<html>非法的参数</html>");
            return;
        }
        int a = Integer.parseInt(aStr);
        int b = Integer.parseInt(bStr);
        int result = a+b;
        String body = String.format("<html>result = %d</html>",result);
        resp.getWriter().write(body);


    }
}
