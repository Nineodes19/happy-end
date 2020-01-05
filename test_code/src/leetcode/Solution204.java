package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:计数质数
 * 统计所有小于非负整数n的质数的数量
 * @create:2020-01-05 21:57
 */
public class Solution204 {
//    public int countPrimes(int n) {
//        int count = 0;
//        int i,j;
//        for (i = 2; i < n; i++) {
//            for (j = 2; j < i; j++) {
//                if(i % j == 0){
//                    break;
//                }
//            }
//            if(j == i){
//                count++;
//            }
//        }
//        return count;
//    }


    public int countPrimes(int n){
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }


    public static void main(String[] args) {
        Solution204 s = new Solution204();
        System.out.println(s.countPrimes(10));
    }
}
