/**
 * @program:test_5.9
 * @author:Nine_odes
 * @description:
 * @create:2020-05-09 18:48
 **/
import java.sql.*;

public class DBUtil {
    //                          ip     端口    数据库
    static String url = "jdbc:mysql://127.0.0.1:3306/blogdemo?useSSL=false";
    static String password = "jiugeqingchen";
    static String username = "root";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        //1、获取驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2、获取连接
        Connection connection = DriverManager.getConnection(url,username,password);

        return connection;
    }

    public static void close(Connection connection, Statement statement, ResultSet resultSet) {
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

