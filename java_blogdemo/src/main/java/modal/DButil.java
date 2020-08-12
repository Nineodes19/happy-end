package modal;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import javafx.scene.chart.PieChart;

import javax.sql.DataSource;
import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program:java_blogdemo
 * @author:Nine_odes
 * @description:
 * @create:2020-07-04 16:01
 **/
public class DButil {

    private static final String URL="jdbc:mysql://127.0.0.1:3306/blog?useSSL=false";
    private static final String USERNAME="root";
    private static final String PASSWORD="jiugeqingchen";

    private static volatile DataSource dataSource = null;

    public static DataSource getDataSource(){
        if (dataSource == null) {
            synchronized (DButil.class) {
                if(dataSource == null){
                    dataSource = new MysqlDataSource();
                    //这的代码是一个典型的“向下转型”的代码
                    ((MysqlDataSource) dataSource).setURL(URL);
                    ((MysqlDataSource) dataSource).setUser(USERNAME);
                    ((MysqlDataSource) dataSource).setPassword(PASSWORD);
                }
            }
        }
        return dataSource;
    }

    //通过DataSource对象获取连接
    public static Connection getConnection(){
        try {
            return getDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //断开连接的操作
    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet){
        try {
            if(resultSet != null){
                resultSet.close();
            }
            if(statement !=null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
