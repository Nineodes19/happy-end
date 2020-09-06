package service;

import dao.CardDao;
import entiy.Card;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-05 15:53
 **/
public class CardService {

    public int add(Card card){
        CardDao cardDao = new CardDao();
        int ret = cardDao.add(card);
        return ret;
    }

    //充值
    public int recharge(int id,double money){
        CardDao cardDao = new CardDao();
        int ret = cardDao.recharge(id,money);
        return ret;
    }

    //付款
    public int swipe(int id,double money){
        CardDao cardDao = new CardDao();
        int ret = cardDao.swipe(id,money);
        return ret;
    }
}
