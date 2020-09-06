package util;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-02 13:08
 **/
public class DButil {
    private static String url = "jdbc:mysql://127.0.0.1:3306/lib?useSSL=false";
    private static String password = "jiugeqingchen";
    private static String username = "root";
    private static DataSource DATASOURCE;
    private static DataSource getDataSource(){ // 双重校验锁
        if (DATASOURCE == null) {
            synchronized (DButil.class) {
                if(DATASOURCE == null){
                    //说明此时还未获取数据库链接
                    DATASOURCE = new MysqlDataSource();
                    ((MysqlDataSource) DATASOURCE).setUrl(url);
                    ((MysqlDataSource) DATASOURCE).setUser(username);
                    ((MysqlDataSource) DATASOURCE).setPassword(password);
                }
            }
        }

        return DATASOURCE;
    }
    public static Connection getConnection(){
        try {
            Connection connection = getDataSource().getConnection();
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("获取数据库链接失败！！");
        }
    }
    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet){
        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
