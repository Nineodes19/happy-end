/**
 * @program:test_9.5
 * @author:Nine_odes
 * @description:
 * @create:2020-09-05 20:12
 **/
public class TestDemo2 {
    //请实现一个函数，将一个字符串中的每个空格替换成“%20”。
    // 例如，当字符串为We Are Happy.则经过替换之后的字符串为
    // We%20Are%20Happy。
    public static String replaceSpace(StringBuffer str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i,i+1);
            if(!" ".equals(s)){
                sb.append(s);
            }else {
                sb.append("%20");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello world") ;
        System.out.println(replaceSpace(stringBuffer));
    }
}
