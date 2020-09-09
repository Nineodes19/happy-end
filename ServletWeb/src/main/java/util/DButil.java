package util;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @program:ServletWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-02 12:17
 **/
public class DButil {
    private String url = "jdbc:mysql://127.0.0.1:3306/usermanger?useSSL=false";

    private String user = "root";
    private String password = "jiugeqingchen";
    private static DataSource DATASOURCE;
    private static DataSource getDataSource(){
        if(DATASOURCE == null){
            DATASOURCE = new
        }
    }
}
