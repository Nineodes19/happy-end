package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:猜数字
 * @create:2019-12-28 10:20
 */
public class SolutionLCP1 {
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0,j = 0; i < guess.length; i++,j++) {
            if(guess[i] == answer[j]){
                count++;
            }
        }

        return count;
    }
}
