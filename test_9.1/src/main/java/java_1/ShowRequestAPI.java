package java_1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;

/**
 * @program:test_9.1
 * @author:Nine_odes
 * @description:
 * @create:2020-09-01 13:41
 **/
public class ShowRequestAPI extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder body = new StringBuilder();
        Enumeration<String> headerEnum = req.getHeaderNames();
        while(headerEnum.hasMoreElements()){
            String headerName = headerEnum.nextElement();
            body.append(headerName + ": " + req.getHeader(headerName) + "<br/>");
        }

        Writer writer = resp.getWriter();
        writer.write("<html>");
        writer.write(body.toString());
        writer.write("</html>");
    }
}
