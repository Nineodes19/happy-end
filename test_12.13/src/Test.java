/**
 * @program:test_12.13
 * @author: Nine_odes
 * @description:
 * @create:2019-12-13 19:38
 */
class ArrayDemo
{

};
public class Test {
    public static void main(String args[]) {
       int arr[][]=new int [5][];
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=new int [i+1];
       }
       int count=0;
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
           {
               arr[i][j]=count++;
           }
       }
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
           {
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
    }
}
