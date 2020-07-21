import java.util.*;
public class Main1{
    private static void Index(int[] arr){
        int length = arr.length;
        int[] index = new int[2];
        for(int i = 0; i < length ; i++){
            index[0] = -1;
            index[1] = -1;
            int j = i-1;
            //寻找index[0]的值，往i左边看
            while(j >= 0){
                if(j >= 0){
                    if(arr[j] < arr[i]){
                        index[0] = j;
                        break;
                    }
                }
                j--;
            }
            j = i;
            while(j < length){
                if(j <length){
                    if(arr[j] < arr[i]){
                        index[1] = j;
                        break;
                    }
                }
                j++;
            }
            System.out.println(index[0] + " " + index[1]);

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Index(arr);
    }
}