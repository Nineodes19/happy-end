package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entiy.Record;
import service.RecordService;

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
 * @create:2020-09-06 15:12
 **/
@WebServlet("/addRecordServlet")
public class AddRecordServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charest=utf-8");
        String cidString = req.getParameter("c_id");
        int c_id = Integer.parseInt(cidString);
        String bidString = req.getParameter("b_id");
        int b_id = Integer.parseInt(bidString);
        String uidString = req.getParameter("u_id");
        int u_id = Integer.parseInt(uidString);

        Record addRecord = new Record();
        addRecord.setC_id(c_id);
        addRecord.setB_id(b_id);
        addRecord.setU_id(u_id);

        RecordService recordService = new RecordService();
        int ret = recordService.add(addRecord);
        Map<String,Object> map = new HashMap<>();
        if(ret != 0){
            map.put("msg",true);
        }else{
            map.put("msg",false);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(resp.getWriter(),map);

    }
}
