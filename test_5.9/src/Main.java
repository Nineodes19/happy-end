import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program:test_5.9
 * @author:Nine_odes
 * @description:
 * @create:2020-05-09 18:49
 **/



public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        //将date转化为2020-05-29 的格式
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    }
    public static void main1(String[] args) throws ClassNotFoundException, SQLException {
        //1、获取驱动
        Class.forName("com.mysql.jdbc.Driver");
        //                           ip      : 端口号/ 数据库名称
        String url = "jdbc:mysql://127.0.0.1:3306/java30_0507?useSSL=false";
        String username = "root";
        String password = "jiugeqingchen";
        //2、获取连接
        Connection connection = DriverManager.getConnection(url,username,password);
        //3、获取语句
        Statement statement = connection.createStatement();

        //4、执行语句
        String sql = "show tables";
        //结果集
        ResultSet resultSet = null;
        resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String str = resultSet.getString(1);
            System.out.println(str);
        }
        //关闭连接
        resultSet.close();
        sql = "select id,name from student";
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            System.out.println(id+" " +name);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}

