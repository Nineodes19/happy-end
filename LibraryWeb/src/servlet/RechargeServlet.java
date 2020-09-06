package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entiy.Card;
import service.CardService;

import javax.servlet.ServletException;
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
 * @create:2020-09-06 12:57
 **/
public class RechargeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charest=utf-8");

        //从前端获取充值需要的信息：充值卡号，充值金额
        String id = req.getParameter("id");
        int c_id = Integer.parseInt(id);
        String money = req.getParameter("money");
        double c_money = Double.parseDouble(money);

        CardService cardService = new CardService();
        int ret = cardService.recharge(c_id,c_money);

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
