package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entiy.Student;
import entiy.User;
import service.StudentService;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-02 22:31
 **/
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");

        String username = req.getParameter("us");
        String upassword = req.getParameter("pa");

        User loginUser = new User();
        loginUser.setU_LoginName(username);
        loginUser.setU_pwd(upassword);

        UserService userService = new UserService();
        User user = userService.login(loginUser);




        Map<String,Object> returnMap = new HashMap<>();
        if(user != null){
            System.out.println("登录成功！" + username);
            req.getSession().setAttribute("user",user);
            returnMap.put("msg",true);
        }else{
            System.out.println("登录失败！" + username);
            returnMap.put("msg",false);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(resp.getWriter(),returnMap);
    }
}
