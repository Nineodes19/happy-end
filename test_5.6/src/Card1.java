import java.util.Objects;

/**
 * @program:test_5.6
 * @author:Nine_odes
 * @description:
 * @create:2020-05-06 22:53
 **/
public class Card1 {
    public int ranl;//数值
    public String suit;//花色

    public Card1(int ranl, String suit) {
        this.ranl = ranl;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if ((o == null) || !(o instanceof Card1)){
            return false;
        }
        Card1 card1 = (Card1) o;
        return ranl == card1.ranl &&
                Objects.equals(suit, card1.suit);
    }

    public static void main(String[] args) {
        Card1 p = new Card1(1,"♤");
        Card1 q = new Card1(1,"♤");
        Card1 o = p;
        System.out.println(p == o);
        System.out.println(p == q);
        System.out.println(p.equals(o));
        System.out.println(p.equals(q));
    }
}

