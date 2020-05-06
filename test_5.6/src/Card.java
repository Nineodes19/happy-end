/**
 * @program:test_5.6
 * @author:Nine_odes
 * @description:
 * @create:2020-05-06 22:49
 **/
public class Card {
    public int ranl;//数值
    public String suit;//花色

    public Card(int ranl, String suit) {
        this.ranl = ranl;
        this.suit = suit;
    }

    public static void main(String[] args) {
        Card p = new Card(1,"♤");
        Card q = new Card(1,"♤");
        Card o = p;
        System.out.println(p == o);
        System.out.println(p == q);
        System.out.println(p.equals(o));
        System.out.println(p.equals(q));
    }
}
