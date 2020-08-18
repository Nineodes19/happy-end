package springexample.demo.controller;

/**
 * @program:test_8.13
 * @author:Nine_odes
 * @description:
 * @create:2020-08-16 09:19
 **/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

//    @Autowired
    @Resource
    private Map<Integer,Integer> test;


    @RequestMapping(value="/login",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Object login(){
        Map<String, String> map = new HashMap<>();
        map.put("man", "博哥");
        map.put("tea", "汤神");
        return map;

    }
}
