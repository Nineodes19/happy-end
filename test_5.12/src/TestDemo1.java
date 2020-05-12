/**
 * @program:test_5.12
 * @author:Nine_odes
 * @description:
 * @create:2020-05-12 14:27
 **/
public class TestDemo1 {
    public static int compareVersion(String version1,String version2){
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int i1,i2;
        for(int i = 0; i < Math.max(s1.length,s2.length); i++){
            i1 = i < s1.length ? Integer.parseInt(s1[i]) : 0;
            i2 = i < s2.length ? Integer.parseInt(s2[i]) : 0;

            if(i1 != i2){
                return i1 > i2 ? 1 : -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(TestDemo1.compareVersion("7.5.2.4","7.5.3"));
    }
}
