package dao;

import entiy.Record;

import util.DButil;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-06 14:05
 **/
public class RecordDao {
    public int add(Record addRecord){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String s = "begin";
        try{
            connection = DButil.getConnection();
            ps = connection.prepareStatement(s);

            String s1 = "select * from book where b_id=?";

            connection = DButil.getConnection();
            ps = connection.prepareStatement(s1);
            ps.setInt(1,addRecord.getB_id());
            int ret = ps.executeUpdate();
            rs = ps.executeQuery();
            double price = 0;
            if(rs.next()){
                rs.getDouble("b_price");
            }else{
                return 0;
            }

            String s2 = "update card\n" +
                    "set c_money=c_money-?\n" +
                    "where c_id =? and c_money>=?";
            ps = connection.prepareStatement(s2);
            ps.setDouble(1,price);
            ps.setInt(2,addRecord.getC_id());
            ps.setDouble(3,price);
            ret *= ps.executeUpdate();


            String s3 = "insert into record values(?,?,?,now())";
            ps =connection.prepareStatement(s3);
            ps.setInt(1,addRecord.getC_id());
            ps.setInt(2,addRecord.getB_id());
            ps.setInt(3,addRecord.getU_id());
            ret *= ps.executeUpdate();

            String s4 = "set foreign_key_checks= 0";
            ps = connection.prepareStatement(s4);

            String s5 = "delete from book where b_id = ?";
            ps = connection.prepareStatement(s5);
            ps.setInt(1,addRecord.getB_id());
            ret *= ps.executeUpdate();

            String s6 = "set foreign_key_checks= 1";
            ps = connection.prepareStatement(s6);
            String s7 = "commit";
            ps = connection.prepareStatement(s7);
            return ret;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }
        return 0;
    }

    public static void main(String[] args) {
        RecordDao recordDao = new RecordDao();
        Record record = new Record();
        record.setB_id(17);
        record.setC_id(1);
        record.setU_id(10);
        int ret = recordDao.add(record);
        if(ret !=0){
            System.out.println("添加成功！");
        }else{
            System.out.println("添加失败！");
        }
    }
}
