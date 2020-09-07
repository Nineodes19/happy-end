package dao;

import entiy.User;
import sun.nio.cs.US_ASCII;
import util.DButil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-02 12:44
 **/
public class UserDao {

    public User login(User loginUser){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        User user = null;
        String sql = "select * from user where u_LoginName = ? and u_pwd = ?";


        try {
            connection = DButil.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1,loginUser.getU_LoginName());
            statement.setString(2,loginUser.getU_pwd());
            resultSet = statement.executeQuery();
            if(resultSet.next()){
                user = new User();
                user.setU_id(resultSet.getInt("u_id"));
                user.setU_LoginName(resultSet.getString("u_LoginName"));
                user.setU_realName(resultSet.getString("u_realName"));
                user.setU_pwd(resultSet.getString("u_pwd"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,statement,resultSet);
        }
        return user;
    }


    public int add(User user){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "insert into user(u_LoginName,u_realName,u_pwd)values(?,?,?)";
        connection = DButil.getConnection();
        try {
            ps = connection.prepareStatement(sql);

            ps.setString(1,user.getU_LoginName());
            ps.setString(2,user.getU_realName());
            ps.setString(3,user.getU_pwd());

            int ret = ps.executeUpdate();
            return ret;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return 0;
    }

    public int delete(int id){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "delete from user where u_id=?";
        try{
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

    public List<User> findByPage(int start,int rows,Map<String,String[]> map){
        List<User> users = new ArrayList<>();
        String sql = "select * from user where 1=1";
        StringBuilder sb = new StringBuilder(sql);
        List<Object> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for(String key : keySet){
            String value = map.get(key)[0];
            if(value != null && !"".equals(value)){
                sb.append(" and ").append(key).append(" like ?");
                list.add("%" + value + "%");
            }
        }
        sb.append(" limit ?,?");
        list.add(start);
        list.add(rows);

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            connection =DButil.getConnection();
            ps = connection.prepareStatement(sb.toString());

            setValues(ps,list.toArray());
            rs = ps.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setU_id(rs.getInt("u_id"));
                user.setU_LoginName(rs.getString("u_LoginName"));
                user.setU_realName(rs.getString("u_realName"));
                user.setU_pwd(rs.getString("u_pwd"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return users;
    }

    public void setValues(PreparedStatement ps,Object... arrays) throws SQLException {
        for (int i = 0; i < arrays.length; i++) {
            ps.setObject(i+1,arrays[i]);
        }
    }

    public int findAllRecord(Map<String,String[]> map){
        int count = 0;
        String sql = "select count(*) from user where 1=1";
        StringBuilder sb = new StringBuilder(sql);

        List<Object> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key:keySet){
            String value = map.get(key)[0];
            if (value != null && !"".equals(value)) {
                sb.append(" and ").append(key).append(" like ?");
                list.add("%" + value + "%");
            }
        }

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sb.toString());


            setValues(ps,list.toArray());
            rs = ps.executeQuery();
            if(rs.next()){
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return count;
    }

    public static void main(String[] args) {
//        Map<String,String[]> map = new HashMap<>();
////        UserDao userDao = new UserDao();
////        int count = userDao.findAllRecord(map);
////        System.out.println(count);
        UserDao userDao = new UserDao();
        int ret = userDao.delete(6);
        if(ret != 0) {
            System.out.println("删除成功！！");
        }else{
            System.out.println("删除失败！！");
        }
    }
}
