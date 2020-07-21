package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program:javaWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-07-20 18:59
 **/
@WebServlet("/findByPageServlet")
public class findByPageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json:charset=utf-8");

        String currentPage = req.getParameter("currentPage");
        String rows = req.getParameter("rows");

        Map<String,String[]> parMap = req.getParameterMap();

        for(Map.Entry<String,String[]> entry : parMap.entrySet()){
            System.out.println("key: " + entry.getKey()+"Value: " + Arrays.toString(entry.getValue()));
        }
    }
}