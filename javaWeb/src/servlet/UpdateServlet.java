package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entiy.User;
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
 * @program:javaWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-08-02 14:00
 **/
@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //从请求体中获取参数，然后将其组装成对象
        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String ageString = req.getParameter("age");
        int age = Integer.parseInt(ageString);
        String address = req.getParameter("address");
        String qq = req.getParameter("qq");
        String email = req.getParameter("email");

        Object us = req.getSession().getAttribute("updateUser");
        User user = (User)us;
        User updateUser = new User();
        updateUser.setId(user.getId());
        updateUser.setName(name);
        updateUser.setGender(gender);
        updateUser.setAge(age);
        updateUser.setAddress(address);
        updateUser.setQq(qq);
        updateUser.setEmail(email);

        UserService userService = new UserService();
        int ret = userService.updateUser(updateUser);

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
