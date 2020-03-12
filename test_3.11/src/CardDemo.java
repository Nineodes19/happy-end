/**
 * @program:test_3.11
 * @author:Nine_odes
 * @description:
 * @create:2020-03-11 20:53
 **/

class Card{
    public String suit;
    public int rank;

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }
}

//52张牌 1 2 3 4 5 6 7 8 9 10 11 12 13
//花色：◆●★▲
public class CardDemo {

    public static final String[] suits = {"▲","★","●","◆"};
    public static final int[] ranks = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    public static void main(String[] args) {

    }
}
