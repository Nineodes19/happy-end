import java.io.EOFException;

/**
 * @program:test_3.1
 * @author:Nine_odes
 * @description:
 * @create:2020-03-01 10:39
 **/
public class Code {
    public static String reverse(String str,int left,int right){
        char[] s = str.toCharArray();
        while(left < right){
            char ch = s[left];
            s[left] =s[right];
            s[right] = ch;
            left ++;
            right--;
        }
        return new String(s);
        //return String.copyValueOf(s);//将数组变为字符串
    }
    public static String func(String str,int k){
        if(str == null||k < 0 || k >= str.length()){
            System.out.println("k输入错误");
            return null;
        }
        String arr = reverse(str,0,k-1);
        arr = reverse(arr,k,str.length()-1);
        String ret = reverse(arr,0,arr.length()-1);
        return ret;
    }
    public static void main(String[] args) {
        //输入处理
        String s = "abcdefg";
        String s1 = func(s,-1);
        System.out.println(s1);
    }
    //abcdefg
    //defgabc
    //abc-----cba[0,k-1)
    //defg----gfed[k-1,length)
    //cbagfed--defgabc
}
