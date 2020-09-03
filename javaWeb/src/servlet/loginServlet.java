package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entiy.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTML;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @program:javaWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-07-16 10:56
 **/
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");

        String username = req.getParameter("us");
        String password = req.getParameter("pa");
//
//        System.out.println("username" +username);
//        System.out.println("password" + password);

        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);

        UserService userService = new UserService();
        //登录函数的返回值为User，需要使用一个User去接收返回的信息
        User user = userService.login(loginUser);

        Map<String,Object> returnMap = new HashMap<>();
        if(user != null){
            System.out.println("登录成功！" +username);
            //1.把当前登录成功的用户写到session当中
            req.getSession().setAttribute("user",user);
            returnMap.put("msg",true);
        }else{
            System.out.println("登录失败！" + username);
            returnMap.put("msg",false);
        }
        //把登录成功的map返回给前端，以json形式返回，json
        //便于前端进行处理


        ObjectMapper objectMapper = new ObjectMapper();

        //将returnMap转化为json字符串返回到响应体
        objectMapper.writeValue(resp.getWriter(),returnMap);
    }

}
