package util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program:javaWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-07-13 21:48
 **/
public class DButil {
    private static String url = "jdbc:mysql://127.0.0.1:3306/usermanger?useSSL=false";
    private static String password = "jiugeqingchen";
//private static String password = "1234";
    private static String username = "root";
    private static volatile DataSource DATASOURCE;
    private static DataSource getDataSource(){ // 双重校验锁
        if(DATASOURCE == null){
            synchronized (DButil.class){
                if(DATASOURCE == null){
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
            //从池子里获取连接
            Connection connection = getDataSource().getConnection();
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("获取数据库连接失败");
        }
    }

    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet) {
        if(resultSet!=null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement!=null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection!=null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}

