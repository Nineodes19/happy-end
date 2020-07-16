package dao;
/**
 * 写dao层之前需要
 *      创建实体
 *      JDBC连接数据库
 */

import entiy.User;
import util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

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

    public int add(User user){
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
    public int delete(int id){
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
    public User find(int id){
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
    public int updateUser(User upUser){
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

    /**
     *
     * @param start 开始查询的起始位置
     * @param rows 每次查询多少条记录
     * @param map name，address，email
     * @return
     */
    public List<User> findByPage(int start, int rows, Map<String,String[]> map){
        List<User> users = new ArrayList<>();
        String sql = "select * from usermessage where 1=1 ";
        StringBuilder sb = new StringBuilder(sql);

        List<Object >list = new ArrayList<>();
        //将map中的key值都放到keySet中
        Set<String> keySet = map.keySet();
        for (String key:keySet) {
            String value = map.get(key)[0];
            if(value != null && !"".equals(value)){
                sb.append(" and ").append(key).append(" like ?");
                list.add("%" + value + "%");
            }
        }
        sb.append(" limit ?,?");
        list.add(start);
        list.add(rows);
//        System.out.println("sql: " + sb);
//        System.out.println("list: " +list);

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sb.toString());
            //给sql语句赋值

            setValues(ps,list.toArray());
            rs = ps.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setGender(rs.getString("gender"));
                user.setAge(rs.getInt("age"));
                user.setAddress(rs.getString("address"));
                user.setQq(rs.getString("qq"));
                user.setEmile(rs.getString("email"));
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

    /**
     * 查询共有多少条记录
     * @param map map包含name，address，email
     * @return
     */
    public int findAllRecord(Map<String,String[]> map){
        int count = 0;
        String sql = "select count(*) from usermessage where 1=1 ";
        StringBuilder sb = new StringBuilder(sql);

        List<Object >list = new ArrayList<>();
        //将map中的key值都放到keySet中
        Set<String> keySet = map.keySet();
        for (String key:keySet) {
            String value = map.get(key)[0];
            if(value != null && !"".equals(value)){
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
            //给sql语句赋值

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

    }
//    public static void main(String[] args) {
//
//        Map<String,String[]> map = new HashMap<>();
////        String[] names = {"孙"};
////        map.put("name",names);
//        String[] addresses = {"陕西"};
//        map.put("address",addresses);
//
//        List<User> userList = findByPage(0,5,map);
//        for (User u: userList) {
//            System.out.println(u);
//        }
//
//        int count = findAllRecord(map);
//        System.out.println(count);
////        User user = new User();
////
////        user.setId(7);
////        user.setGender("女");
////        user.setAddress("陕西");
////        user.setAge(800);
////        user.setQq("123645");
////        user.setEmile("123645@qq.com");
////        int ret = updateUser(user);
////        if (ret==  0) {
////            System.out.println("更新失败");
////        } else {
////            System.out.println("更新成功");
////        }
//
//
////        User ret = find(1);
////        System.out.println(ret);
//    }
}
