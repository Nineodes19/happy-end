import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program:java630_maven
 * @author:Nine_odes
 * @description:
 * @create:2020-07-01 08:37
 **/
public class HelloServlet extends HttpServlet {
    //重写父类的doGet方法

    //request负责解析请求，将HTTP请求转换成一个Request对象，
    // Response负责构造相应，最终得到的HTTP相应是通过Response来生成的
    //当Tomcat收到Get请求时，就会触发这个方法，每种HTTP方法对应一个HTTPServlet中的doXXX方法
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("<h1>hello servlet</h1>");
        //会得到一个PrintWriter对象，往这里写的数据，最终就会进入到http响应报文的body中

    }
}
