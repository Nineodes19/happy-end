/**
 * @program:test_9.9
 * @author:Nine_odes
 * @description:
 * @create:2020-09-09 23:02
 **/
public class TestDemo2 {
    public int RectCover(int target){
        int a1 = 1;
        int a2 = 2;
        if(target == 1){
            return a1;
        }else if(target == 2){
            return a2;
        }
        int a3 = 0;
        for(int i = 3; i <= target; i++){
            a3 = a1+a2;
            a1 = a2;
            a2 = a3;
        }
        return a3;
    }
}
