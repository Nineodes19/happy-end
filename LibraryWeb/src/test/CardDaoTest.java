package test;

import dao.CardDao;
import entiy.Card;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-08 13:46
 **/
public class CardDaoTest {

    @Test
    public void add() {
        CardDao cardDao = new CardDao();
        Card card = new Card();
        card.setStu_xh(11);
        card.setC_money(0);
        int ret = cardDao.add(card);
        if(ret != 0){
            System.out.println("添加成功！" + card.getC_id());
        }else{
            throw new RuntimeException("添加失败！！！");
        }
    }

    @Test
    public void recharge() {
    }

    @Test
    public void swipe() {
    }
}