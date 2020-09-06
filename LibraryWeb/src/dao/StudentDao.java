package dao;

import entiy.Student;
import util.DButil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-02 14:25
 **/
//增删改查、排序
public class StudentDao {

    public Student login(Student loginStudent){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Student student = null;
        String sql = "select  * from student where stu_xh=? and stu_pwd=?";

        try{
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1,loginStudent.getStu_xh());
            ps.setString(2,loginStudent.getStu_pwd());
            rs = ps.executeQuery();
            if(rs.next()){
                student = new Student();
                student.setStu_xh(rs.getInt("stu_xh"));
                student.setStu_name(rs.getString("stu_name"));
                student.setStu_pwd(rs.getString("stu_pwd"));
                student.setStu_sex(rs.getString("stu_sex"));
                student.setStu_age(rs.getInt("stu_age"));
                student.setStu_mobile(rs.getString("stu_mobile"));
                student.setStu_address(rs.getString("stu_addrss"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return student;
    }

    public int add(Student stu){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "insert into student(stu_name,stu_pwd,stu_sex,stu_age,stu_mobile,stu_addrss) values(?,?,?,?,?,?)";
        try{
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);

            ps.setString(1,stu.getStu_name());
            ps.setString(2,stu.getStu_pwd());
            ps.setString(3,stu.getStu_sex());
            ps.setInt(4,stu.getStu_age());
            ps.setString(5,stu.getStu_mobile());
            ps.setString(6,stu.getStu_address());

            int ret = ps.executeUpdate();
            return ret;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return 0;
    }

    public int delete(int stu_xh){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "delete from student where stu_xh=?";
        try{
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);

            ps.setInt(1,stu_xh);

            int ret = ps.executeUpdate();
            return ret;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return 0;
    }

    public Student find(int stu_xh){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Student student = null;
        String sql = "select * from student where stu_xh=?";
        try{
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);

            ps.setInt(1,stu_xh);

            rs = ps.executeQuery();
            if(rs.next()){
                student = new Student();
                student.setStu_xh(rs.getInt("stu_xh"));
                student.setStu_name(rs.getString("stu_name"));
                student.setStu_pwd(rs.getString("stu_pwd"));
                student.setStu_sex(rs.getString("stu_sex"));
                student.setStu_age(rs.getInt("stu_age"));
                student.setStu_mobile(rs.getString("stu_mobile"));
                student.setStu_address(rs.getString("stu_addrss"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return student;
    }

    public int updateStudent(Student upStudent){

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "update student set stu_pwd=?,stu_sex=?,stu_age=?,stu_mobile=?,stu_addrss=? where stu_xh=?";
        try{
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1,upStudent.getStu_pwd());
            ps.setString(2,upStudent.getStu_sex());
            ps.setInt(3,upStudent.getStu_age());
            ps.setString(4,upStudent.getStu_mobile());
            ps.setString(5,upStudent.getStu_address());

            ps.setInt(6,upStudent.getStu_xh());

            int ret = ps.executeUpdate();
            return ret;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DButil.close(connection,ps,rs);
        }
        return 0;
    }

    public List<Student> findByPage(int start,int rows,Map<String,String[]> map){
        List<Student> students = new ArrayList<>();
        String sql = "select * from student where 1=1";
        StringBuilder sb = new StringBuilder(sql);

        List<Object> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for(String key:keySet){
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
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sb.toString());
            setValues(ps,list.toArray());
            rs = ps.executeQuery();
            while(rs.next()){
                Student student = new Student();
                student.setStu_pwd(rs.getString("stu_pwd"));
                student.setStu_xh(rs.getInt("stu_xh"));
                student.setStu_name(rs.getString("stu_name"));
                student.setStu_sex(rs.getString("stu_sex"));
                student.setStu_age(rs.getInt("stu_age"));
                student.setStu_mobile(rs.getString("stu_mobile"));
                student.setStu_address(rs.getString("stu_addrss"));
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return students;
    }

    public void setValues(PreparedStatement ps,Object...arrays) throws SQLException {
        for (int i = 0; i < arrays.length; i++) {
            ps.setObject(i+1,arrays[i]);
        }
    }

    public int findAllRecord(Map<String,String[]> map){
        int count = 0;
        String sql = "select count(*) from student where 1=1";
        StringBuilder sb = new StringBuilder(sql);
        List<Object> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for(String key:keySet){
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

            setValues(ps,list.toArray());
            rs = ps.executeQuery();
            if(rs.next()){
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DButil.close(connection,ps,rs);
        }
        return count;
    }
}
