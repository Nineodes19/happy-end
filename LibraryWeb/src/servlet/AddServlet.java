package servlet;



import com.fasterxml.jackson.databind.ObjectMapper;
import entiy.Student;
import entiy.User;
import service.StudentService;
import service.UserService;
import sun.rmi.runtime.Log;

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
 * @create:2020-09-02 21:07
 **/
@WebServlet("/addUserServlet")
public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charest=utf-8");

        String LoginName = req.getParameter("u_LoginName");
        String realName = req.getParameter("u_realName");
        String pwd = req.getParameter("u_pwd");

        User addUser = new User();
        addUser.setU_LoginName(LoginName);
        addUser.setU_realName(realName);
        addUser.setU_pwd(pwd);

        UserService userService = new UserService();



        int ret = userService.add(addUser);
        Map<String,Object> returnMap = new HashMap<>();
        if(ret == 1){
            returnMap.put("msg",true);
        }else{
            returnMap.put("msg",false);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(resp.getWriter(),returnMap);
    }
}
