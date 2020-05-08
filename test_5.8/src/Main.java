import java.sql.Connection;

import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program:test_5.8
 * @author:Nine_odes
 * @description:
 * @create:2020-05-08 23:05
 **/
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.获取驱动
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/java_0508?useSSL=false";
        String username = "root";
        String password = "jiugeqingchen319";
        //2.获取连接
        Connection connection = DriverManager.getConnection(url,username,password);
        //3.获取语句
        Statement statement = (Statement) connection.createNClob();

        //4.执行语句
        String sql = "show tables";
        ResultSet resultSet = null;
        resultSet = statement.executeQuery(sql);

        if(resultSet.next()){
            String str = resultSet.getString(1);
            System.out.println(str);
        }
    }
}
