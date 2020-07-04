package java7_1;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * @program:java630_maven
 * @author:Nine_odes
 * @description:
 * @create:2020-07-01 19:12
 **/
public class CookieDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理提交的数据
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        System.out.println("firstName:" + firstName);
        System.out.println("lastName:" + lastName);
        //让代码返回一个响应数据
        //响应数据中，带上一个Cookie信息
        resp.setContentType("text/html;charset=utf-8");
        resp.setStatus(200);

        //Cookie是在响应报文的header部分、
        //一旦要修改header，必须要保证修改操作
        // 出现在resp.getWriter之前，否则对header的修改可能会失效

        //创建Cookie对象（本质上也是键值对）
        Cookie firstNameCookie = new Cookie("firstName",firstName);
        Cookie lastNameCoolie = new Cookie("lastName",lastName);
        //吧Cookie对象加入到响应对象中
        resp.addCookie(firstNameCookie);
        resp.addCookie(lastNameCoolie);

        Writer writer= resp.getWriter();
        writer.write("<html>");
        writer.write("数据提交成功！");
        writer.write("</html>");

    }
}
