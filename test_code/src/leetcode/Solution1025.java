package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:除数博弈
 * 爱丽丝和鲍勃一起玩游戏，他们轮流行动。爱丽丝先手开局。
 * 最初，黑板上有一个数字 N 。在每个玩家的回合，玩家需要执行以下操作：
 *     选出任一 x，满足 0 < x < N 且 N % x == 0 。
 *     用 N - x 替换黑板上的数字 N 。
 * 如果玩家无法执行这些操作，就会输掉游戏。
 * 只有在爱丽丝在游戏中取得胜利时才返回 True，否则返回 false。
 * 假设两个玩家都以最佳状态参与游戏。
 * @create:2020-01-08 20:37
 */
public class Solution1025 {
    public boolean divisorGame(int N) {
        int count = 0;
        int temp = 0;
        while(N>1){
            for(int i = 1; i < N; i++){
                if(N % i == 0){
                    temp = i;
                    count++;
                    break;
                }
            }
            N -= temp;
        }
        return count % 2 == 1;
    }

//    public static void main(String[] args) {
//        Solution1025 s = new Solution1025();
//        System.out.println(s.divisorGame(2));
//    }
}
