import java.util.ArrayList;
import java.util.List;

/**
 * @program:test_10.20
 * @author:Nine_odes
 * @description:
 * @create:2020-10-20 20:50
 **/
public class HeapOOM {
    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while(true){
            list.add(new OOMObject());
        }
    }
}
