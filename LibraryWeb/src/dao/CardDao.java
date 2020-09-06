package dao;

import entiy.Card;
import util.DButil;

import java.awt.geom.RectangularShape;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-05 15:10
 **/
public class CardDao {

    /**
     * 管理员添加会员卡
     * @param card
     * @return
     */
    public int add(Card card){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "insert int card(stu_xh,c_money)values(?,?)";

        try{
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);

            ps.setInt(1,card.getStu_xh());
            ps.setDouble(2,card.getC_money());

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
     * 充值功能
     * @param id 需要充值的卡片id
     * @param money  充值的数额
     * @return
     */
    public int recharge(int id,double money){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "update card set c_money=c_money+? where c_id=?";

        try{
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setDouble(1,money);
            ps.setInt(2,id);

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
     * 付款功能
     * 当卡内余额不足，付款失败
     * @param id 付款的卡号
     * @param money 付款金额
     * @return
     */
    public int swipe(int id,double money){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        double ret = 0;
        String sql = "select c_money from card where c_id=?";
        String sql1 = "update card set c_money=c_money-? where c_id=?";
        try{
            connection = DButil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            if(rs.next()){
                ret = rs.getDouble(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,ps,rs);
        }

        if(ret-money >=0){
            Connection connection1 = null;
            PreparedStatement ps1 = null;
            ResultSet rs1 = null;
            try{
                connection1 = DButil.getConnection();
                ps1 = connection1.prepareStatement(sql1);
                ps1.setDouble(1,money);
                ps1.setInt(2,id);
                int re = ps1.executeUpdate();
                return re;
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                DButil.close(connection1,ps1,rs1);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        CardDao cardDao = new CardDao();
        int id = 1;
        int ret = cardDao.recharge(id,300);
        System.out.println(ret);
    }
}
