/**
 * @program:test_5.19
 * @author:Nine_odes
 * @description:
 * @create:2020-05-19 23:03
 **/

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.*;


public class TestDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //获取驱动
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/java_0518?useSSL=false";
        String username = "root";
        String password = "jiugeqingchen";

        //获取连接
        Connection connection = DriverManager.getConnection(url,username,password);

        //获取语句
        Statement statement = connection.createStatement();

        //执行语句
        String sql = "show tables";
        //结果集
        ResultSet resultSet = null;
        resultSet = statement.executeQuery(sql);


        while (resultSet.next()){
            String str = resultSet.getString(1);
            System.out.println(str);
        }

        resultSet.close();


        sql = "select id,`name` from student";
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            System.out.println(id + " " + name);
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}

