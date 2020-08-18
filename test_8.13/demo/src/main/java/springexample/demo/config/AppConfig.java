package springexample.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @program:test_8.13
 * @author:Nine_odes
 * @description:
 * @create:2020-08-16 09:19
 **/
@Configuration
public class AppConfig {
    @Bean
    public Map<Integer,Integer> test(){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,100);
        map.put(2,200);
        return map;
    }

    @Bean
    public Map<Integer,String> test1(){
        Map<Integer,String> map = new HashMap<>();
        map.put(3,"测试一下");
        map.put(4,"测试两下");
        return map;
    }


}
