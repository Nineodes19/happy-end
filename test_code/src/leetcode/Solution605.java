package leetcode;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:种花问题
 * 不能相邻，（0表示没种花，1表示种了花）
 * @create:2020-01-06 20:18
 */
public class Solution605 {
//    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//        int count = flowerbed.length;
//        if(flowerbed[0] == 1){
//            count = count - 2;//3
//        }
//        if(flowerbed[flowerbed.length -1] == 1){
//            count= count - 2;//1
//        }
//        for (int i = 1; i < flowerbed.length-1; i++) {
//            if(flowerbed[i] == 1){
//                count = count - 3;
//            }
//        }
//        if(count >= n){
//            return true;
//        }
//        return false;
//    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 &&
                    (i - 1 == -1 || flowerbed[i - 1] == 0) &&
                    (i + 1 == flowerbed.length || flowerbed[i + 1] == 0)) {
                n--;
                flowerbed[i] = 1;
            }
        }
        if(n > 0){
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,0,0,0,0,0,1};//6
        int n = 2;
        Solution605 s = new Solution605();
        System.out.println(s.canPlaceFlowers(arr,n));
    }
}
