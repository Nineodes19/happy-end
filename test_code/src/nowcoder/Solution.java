package nowcoder;

/**
 * @program:test_code
 * @author: Nine_odes
 * @description:
 * @create:2019-12-24 22:53
 */
public class Solution {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            int[]array = new int[N];

            for(int i = 0; i < N; i++){
                //array[i] = (int)(Math.random() * 999 + 1);
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            System.out.println(array[0]);
            for (int i = 1; i < N; i++) {
                if(array[i] != array[i-1]){
                    System.out.println(array[i]);
                }
            }
        }

    }
}