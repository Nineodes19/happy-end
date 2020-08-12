package modal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program:java_blogdemo
 * @author:Nine_odes
 * @description:
 * @create:2020-07-04 16:39
 **/

//DAO数据访问层
//UserDao专门负责访问为User表
public class UserDao {
    //当前主要提供两个方法
    //1.新增用户（实现注册）
    public void add(User user){
        //获取数据库链接
        Connection connection = DButil.getConnection();
        //拼装sql语句
        String sql = "insert into user values(null,?,?)";
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(sql);
            statement.setString(1,user.getName());
            statement.setString(2,user.getPassword());
            //执行sql
            //ret表示这次操作影响的行数，插入成功，返回一行
            //增删改使用executeUpdate，查找调用executeQuery
            int ret = statement.executeUpdate();
            if(ret != 1){
                throw new SQLException("插入用户失败！！");
            }
            System.out.println("插入用户成功！");
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DButil.close(connection,statement,null);
        }
    }

    //2.根据用户名查找用户信息（登录）
    public static User selectByName(String name){

        Connection connection = DButil.getConnection();

        //2.拼装sql
        String sql = "select * from user where name = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            statement = connection.prepareStatement(sql);
            statement.setString(1,name);
            resultSet = statement.executeQuery();
            if(resultSet.next()){
                User user = new User();
                user.setUserId(resultSet.getInt("userId"));
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DButil.close(connection,statement,resultSet);
        }
        return null;
    }

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
//        User user = new User();
//        user.setName("九歌");
//        user.setPassword("2222");
//        userDao.add(user);

        //测试查找方法
        User user = userDao.selectByName("九歌");
        System.out.println(user);

    }
}
