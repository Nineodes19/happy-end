package code;

/**
 * @program:test_2.21
 * @author:Nine_odes
 * @description:一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求他在第10次落地时，共经过多少米？第十次反弹多高？
 * @create:2020-02-21 21:46
 **/
public class program03 {
    public static void main(String[] args) {
        double h = 100, s = 100;
        for (int i = 0; i < 10; i++) {
            s = s + h;
            h = h /2;//每次落地，高度/2
        }
        System.out.println("经过的路程：" + s);
        System.out.println("第十次反弹高度：" + h / 2);
    }
}
