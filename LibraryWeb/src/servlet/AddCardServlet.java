package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entiy.Card;
import service.CardService;

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
 * @create:2020-09-06 12:50
 **/
@WebServlet("/addCardServlet")
public class AddCardServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charest=utf-8");
        //得到前端传来的图书卡信息
        String id = req.getParameter("id");
        int c_id = Integer.parseInt(id);
        String xh = req.getParameter("xh");
        int stu_xh = Integer.parseInt(xh);
        String money = req.getParameter("money");
        double c_money = Double.parseDouble(money);

        Card addCard = new Card();
        addCard.setC_id(c_id);
        addCard.setStu_xh(stu_xh);
        addCard.setC_money(c_money);

        CardService cardService = new CardService();
        int ret = cardService.add(addCard);
        Map<String,Object> map = new HashMap<>();
        if(ret == 1){
            map.put("msg",true);
        }else{
            map.put("msg",false);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(resp.getWriter(),map);

    }
}
