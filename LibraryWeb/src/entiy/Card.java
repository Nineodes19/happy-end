package entiy;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-05 15:09
 **/
public class Card {
    private int c_id;
    private int stu_xh;
    private double c_money;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getStu_xh() {
        return stu_xh;
    }

    public void setStu_xh(int stu_xh) {
        this.stu_xh = stu_xh;
    }

    public double getC_money() {
        return c_money;
    }

    public void setC_money(double c_money) {
        this.c_money = c_money;
    }

    @Override
    public String

    toString() {
        return "Card{" +
                "c_id=" + c_id +
                ", stu_xh=" + stu_xh +
                ", c_money=" + c_money +
                '}';
    }
}
