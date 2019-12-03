package code1;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/**
 * @program:test_12.3.1
 * @author: Nine_odes
 * @description:对数组按中文名称排序
 * @create:2019-12-03 17:45
 */
public class SortByChinese {
    public static void main(String[] args) {
        String[] arrString = {"计算机","长江","通信","数学"};
        for (int i = 0; i < arrString.length; i++) {
            System.out.println(arrString[i]);
        }
        System.out.println("----------------------------");
        //jisuanji（8）    changjiang（10）  tongxin（7）  shuxue（6）
        Arrays.sort(arrString);
        for (int i = 0; i < arrString.length; i++) {
            System.out.println(arrString[i]);
        }
        System.out.println("----------------------------");

        //Collator类是用来执行区分语言环境的字符串比较，这里选择用CHINA
        Comparator comparator = Collator.getInstance(Locale.CHINA);

        //根据指定比较器产生的顺序对指定对象数组进行排序
        Arrays.sort(arrString,comparator);
        for (int i = 0; i < arrString.length; i++) {
            System.out.println(arrString[i]);
        }
    }
}
