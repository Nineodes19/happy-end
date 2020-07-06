package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * @program:test_6.29
 * @author:Nine_odes
 * @description:
 * @create:2020-06-29 11:47
 **/
public class PropertiesUtil {
    public static String read(){
        Properties prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/config.properties");
            prop.load(fis);
            String food = (String)prop.get("food");
            System.out.println(food);
            return food;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        PropertiesUtil.read();
    }
}
