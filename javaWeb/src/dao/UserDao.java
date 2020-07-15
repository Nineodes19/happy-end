package dao;
/**
 * 写dao层之前需要
 *      创建实体
 *      JDBC连接数据库
 */

import com.sun.org.apache.bcel.internal.generic.DUP;
import entiy.User;
import util.DButil;

import  com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;
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
public class UserDao {
    /**
     * 登录
     * @param loginUser
     * @return
     */
    public User login(User loginUser){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        String sql = "select * from usermessage where username=? and password=?";
        connection = DButil.getConnection();
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1,loginUser.getUsername());
            ps.setString(2,loginUser.getPassword());
            rs = ps.executeQuery();
            if(rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setGender(rs.getString("gender"));
                user.setAge(rs.getInt("age"));
                user.setAddress(rs.getString("address"));
                user.setQq(rs.getString("qq"));
                user.setEmile(rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return user;
    }

    public static int add(User user){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            String sql = "insert into usermessage(name,username,password,gender,age,address ,qq,email) values (?,?,?,?,?,?,?,?)";
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);

            ps.setString(1,user.getName());
            ps.setString(2,user.getUsername());
            ps.setString(3,user.getPassword());
            ps.setString(4,user.getGender());

            ps.setInt(5,user.getAge());
            ps.setString(6,user.getAddress());
            ps.setString(7,user.getQq());
            ps.setString(8,user.getEmile());

            int ret = ps.executeUpdate();
            return ret;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return 0;//添加失败
    }

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    public static int delete(int id){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            String sql="delete from usermessage where id=?";
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            int ret = ps.executeUpdate();
            return ret;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return 0;
    }

    /**
     * 根据用户id查找对应的用户
     * @param id
     * @return
     */
    public static User find(int id){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        try{
            String sql = "select * from usermessage where id = ?";
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            if(rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setGender(rs.getString("gender"));
                user.setAge(rs.getInt("age"));
                user.setAddress(rs.getString("address"));
                user.setQq(rs.getString("qq"));
                user.setEmile(rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    /**
     * 更新：只需要给一个用户对象
     */
    public static int updateUser(User upUser){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            String sql = "update usermessage set gender=?,age=?,address=?,qq=?,email=? where id=?";
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1,upUser.getGender());
            ps.setInt(2,upUser.getAge());
            ps.setString(3,upUser.getAddress());
            ps.setString(4,upUser.getQq());
            ps.setString(5,upUser.getEmile());
            ps.setInt(6,upUser.getId());
            int ret = ps.executeUpdate();
            return ret;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {

        User user = new User();

        user.setId(7);
        user.setGender("女");
        user.setAddress("陕西");
        user.setAge(800);
        user.setQq("123645");
        user.setEmile("123645@qq.com");
        int ret = updateUser(user);
        if (ret==  0) {
            System.out.println("更新失败");
        } else {
            System.out.println("更新成功");
        }


//        User ret = find(1);
//        System.out.println(ret);
    }
}
