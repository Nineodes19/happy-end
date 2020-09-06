package dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import entiy.Book;
import entiy.User;
import util.DButil;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.function.Predicate;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-03 19:28
 **/
public class BookDao {
    public int add(Book book){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "replace into book(b_name,b_author,b_type,b_publish,b_condition,b_price,b_position) values(?,?,?,?,?,?,?)";
        try{
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);

            ps.setString(1,book.getB_name());
            ps.setString(2,book.getB_author());
            ps.setString(3,book.getB_type());
            ps.setString(4,book.getB_publish());
            ps.setString(5,book.getB_condition());
            ps.setDouble(6,book.getB_price());
            ps.setString(7,book.getB_position());

            int ret = ps.executeUpdate();
            return ret;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return 0;
    }

    public int delete(String name){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "delete from book where b_name = ?";
        try{
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1,name);
            int ret = ps.executeUpdate();
            return ret;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return 0;
    }

    public Book find(int id){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Book book = null;

        String sql = "select * from book where b_id=?";
        try{
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            if(rs.next()){
                book = new Book();
                book.setB_id(rs.getInt("b_id"));
                book.setB_name(rs.getString("b_name"));
                book.setB_author(rs.getString("b_author"));
                book.setB_type(rs.getString("b_type"));
                book.setB_publish(rs.getString("b_publish"));
                book.setB_condition("b_condition");
                book.setB_price(rs.getDouble("b_price"));
                book.setB_position(rs.getString("b_position"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return book;
    }

    public int updateBook(Book book){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "update book set b_name=?,b_author=?,b_type=?," +
                "b_publish=?,b_condition=?,b_price=?," +
                "b_position=? where b_id=?";

        try{
            ps = connection.prepareStatement(sql);

            ps.setString(1,book.getB_name());
            ps.setString(2,book.getB_author());
            ps.setString(3,book.getB_type());
            ps.setString(4,book.getB_publish());
            ps.setString(5,book.getB_condition());
            ps.setDouble(6,book.getB_price());
            ps.setString(7,book.getB_position());
            ps.setInt(8,book.getB_id());

            int ret = ps.executeUpdate();
            return ret;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return 0;
    }

    public void setValues(PreparedStatement ps, Object...arrays) throws SQLException {
        for (int i = 0; i < arrays.length; i++) {
            ps.setObject(i+1,arrays[i]);
        }
    }

    public List<Book> findByPage(int start,int rows,Map<String,String[]> map){
        //拼装sql语句
        List<Book> books = new ArrayList<>();
        String sql = "select * from book where 1=1";
        StringBuilder sb = new StringBuilder(sql);

        List<Object> list = new ArrayList<>();

        Set<String> keySet = map.keySet();
        for(String key:keySet){
            String value = map.get(key)[0];
            if(value != null && !"".equals(value)){
                sb.append(" and ").append(key).append(" like ?");
                list.add("%"+value+"%");
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
                Book book = new Book();
                book.setB_id(rs.getInt("b_id"));
                book.setB_name(rs.getString("b_name"));
                book.setB_author(rs.getString("b_author"));
                book.setB_type(rs.getString("b_type"));
                book.setB_publish(rs.getString("b_publish"));
                book.setB_condition("b_condition");
                book.setB_price(rs.getDouble("b_price"));
                book.setB_position(rs.getString("b_position"));

                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return books;
    }

    public int findAllRecord(Map<String,String[]> map){
        int count =0;
        String sql = "select count(*) from book where 1=1";
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
        }finally {
            DButil.close(connection,ps,rs);
        }
        return count;
    }

    //降序排序
    public List<Book> sort(){
        List<Book> books = new ArrayList<>();
        String sql = "select * from book order by b_price asc";

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int count = 0;
        try{
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Book book = new Book();
                book.setB_id(rs.getInt("b_id"));
                book.setB_name(rs.getString("b_name"));
                book.setB_author(rs.getString("b_author"));
                book.setB_type(rs.getString("b_type"));
                book.setB_publish(rs.getString("b_publish"));
                book.setB_condition("b_condition");
                book.setB_price(rs.getDouble("b_price"));
                book.setB_position(rs.getString("b_position"));
                count ++;
                books.add(book);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return books;
    }

    public static void main(String[] args) {

        //测试add()
        BookDao bookDao = new BookDao();
        Book book = new Book();

        book.setB_name("Java编程：从入门到实践");
        book.setB_author("付松柏");
        book.setB_type("计算机编程书籍");
        book.setB_publish("人民邮电出版社");
        book.setB_condition("未借出");
        book.setB_price(89.00);
        book.setB_position("ZX_0010");
        int ret = bookDao.add(book);
        if(ret != 0){
            System.out.println("添加成功！！" + book.getB_name());
        }else{
            System.out.println("添加失败！！");
        }

//        //测试findAllRecord()
//        Map<String,String[]> map = new HashMap<>();
//        BookDao bookDao = new BookDao();
//        int count = bookDao.findAllRecord(map);
//        System.out.println(count);

//        //测试sort()
//        Map<String,String[]> map = new HashMap<>();
//        BookDao bookDao = new BookDao();
//        List<Book> bookList = bookDao.sort(map);
//        System.out.println(bookList);

//        //测试sort()
//        BookDao bookDao = new BookDao();
//        List<Book> bookList = bookDao.sort();
//        System.out.println(bookList);
    }
}
