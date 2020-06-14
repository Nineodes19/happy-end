package day11;


import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @program:test_6.14
 * @author:Nine_odes
 * @description:
 * @create:2020-06-14 10:09
 **/
public class TestDemo1 {
    public static int getValue(int i){
        int result = 0;
        switch (i){
            case 1:
                result = result +i;//2
            case 2:
                result = result +i * 2;//4
            case 3:
                result = result +i * 3;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getValue(2));
    }
    public static void main1(String[] args) {
        HashMap map = new HashMap();
        map.put("name",null);
        map.put("name","Jack");
        System.out.println(map.size());


    }
}
