import java.sql.CallableStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program:test_7.21
 * @author:Nine_odes
 * @description:
 * @create:2020-07-22 09:47
 **/
//{"♠", "♥", "♣", "♦"};

public class TestDemo1 {
    //先创建一个Card类用来描述每一张牌
    static class Card{
        public String suit;//花色
        public String rank;//牌面

        @Override
        public String toString() {
            return String.format("[%s:%s]",rank,suit);
        }
    }
    public static final String[] SUITS = {"♠", "♥", "♣", "♦"};
    public static final String[] RANKS = {"A","2","3","4","5","6","7","8",
                "9","10","J","Q","K"};

    //买牌
    private static List<Card> buy(){
        List<Card> deck = new ArrayList<>(52);
        for(int i = 0; i < 4;i++){
            for(int j = 0; j < RANKS.length;j++){
                Card card = new Card();
                card.suit = SUITS[i];
                card.rank = RANKS[j];
                deck.add(card);
            }
        }
        return deck;
    }

    private static void xiPai(List<Card> deck){
        Random random = new Random(200200722);
        for(int i = deck.size()-1; i > 0 ; i--){
            int r = random.nextInt(i);
            swap(deck,i,r);
        }
    }
    private static void swap(List<Card> deck,int i, int j){
        Card c = deck.get(i);
        deck.set(i,deck.get(j));
        deck.set(j,c);
    }
    public static void main(String[] args) {
        List<Card> deck = buy();
        System.out.println(deck);
        xiPai(deck);
        System.out.println("洗牌后： " + deck);
        xiPai(deck);
        System.out.println("洗牌后： " + deck);
        List<List<Card>> hand = new ArrayList<>();
        hand.add(new ArrayList<>());
        hand.add(new ArrayList<>());
        hand.add(new ArrayList<>());
        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 3; j++){
                hand.get(j).add(deck.remove(0));
            }
        }
        for (int i = 0; i < hand.size(); i++) {
            System.out.println(i+"手中的牌："+hand.get(i));
        }
    }
}
