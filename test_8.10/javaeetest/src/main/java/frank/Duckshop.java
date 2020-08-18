package frank;

import java.util.List;

/**
 * @program:test_8.10
 * @author:Nine_odes
 * @description:
 * @create:2020-08-12 19:14
 **/
public class Duckshop {
    private List<Duck> ducks;

    @Override
    public String toString() {
        return "Duckshop{" +
                "ducks=" + ducks +
                '}';
    }

    public List<Duck> getDucks() {
        return ducks;
    }

    public void setDucks(List<Duck> ducks) {
        this.ducks = ducks;
    }
}
