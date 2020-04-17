import java.util.List;

/**
 * @program:Test_4.17
 * @author:Nine_odes
 * @description:
 * @create:2020-04-17 22:45
 **/
public class TestDemo {


    public int compareVersion(String version1, String version2){
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int i1,i2;
        for (int i = 0; i < Math.max(arr1.length,arr2.length); i++) {
            i1 = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;
            i2 = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;

            if(i1 != i1){
                return i1 > i2 ? 1 : -1;
            }
        }

        return 0;
    }

    public int compareVersion1(String version1, String version2) {

        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int i1,i2;
        for (int i = 0; i < Math.max(s1.length,s2.length); i++) {
            i1 = i < s1.length ? Integer.parseInt(s1[i]) : 0;
            i2 = i < s2.length ? Integer.parseInt(s2[i]) : 0;
            if(i1 != i2){
                return i1 > i2 ? 1 : -1;
            }
        }
        return 0;
    }
}
